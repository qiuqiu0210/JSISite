package cn.edu.buaa.jsi.web.action;

import cn.edu.buaa.jsi.entities.UpFile;
import cn.edu.buaa.jsi.service.FileService;
import cn.edu.buaa.jsi.utils.StringUtils;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Administrator on 14-8-21.
 */
public class FileAction extends BaseAction {
    private FileService fileService;
    private int id;
    private UpFile upFile;
    private File upload;//类型为File的xxx属性封装了该文件域对应的文件内容。（文中的 File upload属性中的upload就是下面两个string的属性的前缀）
    private String uploadFileName;//类型为String的xxxFileName属性封装了该文件域对应的文件的文件名。
    private String uploadContentType;//类型为String的xxxContentType属性封装了该文件域对应的文件的文件名。

    public String addFile() {
        if (upFile == null){
            return INPUT;
        }
        if (upload == null) {
            ActionContext.getContext().put("message", "请上传文件");
            return INPUT;
        }
        String path = ServletActionContext.getServletContext().getRealPath("/upload");
//        String[] fname = uploadFileName.split("\\.");
//        String suffix = fname[fname.length-1];
        String filename = path + File.separator + uploadFileName;
        File saveFile = new File(filename);
//        upFile.setFileSuffix(suffix);
        Timestamp time = new Timestamp(System.currentTimeMillis());
        upFile.setFileTime(time);
        upFile.setFilePath(path);
        upFile.setFileName(uploadFileName);
        if (this.fileService.saveFileAndUpload(upFile, upload, saveFile)){
            ActionContext.getContext().put("message", "文件上传成功！");
            return SUCCESS;
        }
        return null;
    }
    public String modifyFile() {
        if (id != 0 && upFile == null){
            upFile = this.fileService.findFileById(id);
            if (upFile != null){
                ActionContext.getContext().getSession().put("upFile", upFile);
                return INPUT;
            }
        }
        else if (upFile != null){
            if (this.fileService.updateFile(upFile)){
//                this.addActionMessage("修改成功!!");
                ActionContext.getContext().put("message", "修改成功！");
                return SUCCESS;
            }
        }
        return INPUT;
    }
    public String delFile() {
        if (id == 0){
            return INPUT;
        }
        if (this.fileService.removeFileById(id)) {
            ActionContext.getContext().put("message", "删除成功！");
            return SUCCESS;
        }
        return null;
    }

    public String execute(){
        List<UpFile> upFiles = this.fileService.findAllFiles();
        if (!upFiles.isEmpty()) {
            for (UpFile upFile1: upFiles){
                upFile1.setFileInfo(StringUtils.stringToHtml(upFile1.getFileInfo()));
            }
            ActionContext.getContext().getSession().put("fileList", upFiles);
            return SUCCESS;
        }
        return null;
    }

    public FileService getFileService() {
        return fileService;
    }

    public void setFileService(FileService fileService) {
        this.fileService = fileService;
    }

    public UpFile getUpFile() {
        return upFile;
    }

    public void setUpFile(UpFile upFile) {
        this.upFile = upFile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }
}

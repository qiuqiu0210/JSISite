package cn.edu.buaa.jsi.web.action;

import cn.edu.buaa.jsi.entities.FileEntity;
import cn.edu.buaa.jsi.service.FileService;
import cn.edu.buaa.jsi.utils.CommonUtils;
import cn.edu.buaa.jsi.utils.StringUtils;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.sql.Timestamp;
import java.util.List;
import java.util.Properties;

/**
 * 文件Action
 * @author songliu
 * @since 2014/08/21
 */
public class FileAction extends BaseAction {
    private FileService fileService;
    private int id;
    private FileEntity file;
    private File upload;//类型为File的xxx属性封装了该文件域对应的文件内容。（文中的 File upload属性中的upload就是下面两个string的属性的前缀）
    private String uploadFileName;//类型为String的xxxFileName属性封装了该文件域对应的文件的文件名。
    private String uploadContentType;//类型为String的xxxContentType属性封装了该文件域对应的文件的文件名。

    /**
     * 处理添加文件请求
     */
    public String addFile() {
        if (file == null){
            return INPUT;
        }
        if (upload == null) {
            ActionContext.getContext().put("message", "请上传文件");
            return INPUT;
        }
//        String path = ServletActionContext.getServletContext().getRealPath("/upload");
        Properties properties = CommonUtils.getProperties("filepath.properties");
        String path = properties.getProperty("upload.file");
        String filename = path + File.separator + uploadFileName;
        String suffix = uploadFileName.substring(uploadFileName.lastIndexOf(".")).toLowerCase();
        File saveFile = new File(filename);
        Timestamp time = new Timestamp(System.currentTimeMillis());
        file.setFileTime(time);
        file.setFilePath(path);
        file.setFileSuffix(suffix);
        file.setFileName(uploadFileName);
        if (this.fileService.saveFileAndUpload(file, upload, saveFile)){
            ActionContext.getContext().put("message", "文件上传成功！");
            return SUCCESS;
        }
        return null;
    }

    /**
     * 处理修改文件请求
     */
    public String modifyFile() {
        if (id != 0 && file == null){
            file = this.fileService.findFileById(id);
            if (file != null){
                ActionContext.getContext().getSession().put("file", file);
                return INPUT;
            }
        }
        else if (file != null){
            if (this.fileService.updateFile(file)){
//                this.addActionMessage("修改成功!!");
                ActionContext.getContext().put("message", "修改成功！");
                return SUCCESS;
            }
        }
        return INPUT;
    }

    /**
     * 处理删除文件请求
     */
    public String delFile() {
        if (id == 0){
            return INPUT;
        }
        if (this.fileService.deleteFileById(id)) {
            ActionContext.getContext().put("message", "删除成功！");
            return SUCCESS;
        }
        return null;
    }

    /**
     * 显示文件信息
     */
    @Override
    public String execute(){
        List<FileEntity> fileList = this.fileService.findAllFiles();
        if (!fileList.isEmpty()) {
            for (FileEntity file1: fileList){
                file1.setFileInfo(StringUtils.stringToHtml(file1.getFileInfo()));
            }
            ActionContext.getContext().getSession().put("fileList", fileList);
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

    public FileEntity getFile() {
        return file;
    }

    public void setFile(FileEntity file) {
        this.file = file;
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

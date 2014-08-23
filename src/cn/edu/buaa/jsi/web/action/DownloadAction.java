package cn.edu.buaa.jsi.web.action;

import cn.edu.buaa.jsi.utils.CommonUtils;
import com.opensymphony.xwork2.ActionContext;
import com.sun.corba.se.spi.orbutil.fsm.Input;
import org.apache.struts2.ServletActionContext;

import java.io.*;
import java.util.Properties;

/**
 * 下载通用Action
 * @author songliu
 * @since 2014/08/21
 */
public class DownloadAction extends BaseAction{
    private String fileName;
    private String type;
    private InputStream fileStream;

    //返回一个输入流，作为一个客户端来说是一个输入流，但对于服务器端是一个输出流
    //因为struts.xml配置的inputSteam名称为downloadFile，故此处需要有getDownloadFile()方法
    public InputStream getDownloadFile() throws Exception {
        return this.fileStream;
    }

    /**
     * 处理下载文件请求
     */
    @Override
    public String execute() throws Exception {
        if (fileName != null){
            //解决乱码问题
            String file = new String(fileName.getBytes("ISO-8859-1"),"UTF-8");
            //type==file文件上传到filepath.properties指定的路径，是绝对路径
            if (type != null && "file".equals(type)){
                //或者也可以从数据库中获取路径
                Properties properties = CommonUtils.getProperties("filepath.properties");
                String filePath = properties.getProperty("upload.file") + File.separator + file;
                if (fileExist(filePath)){
                    fileStream =  new FileInputStream(filePath);
                    return SUCCESS;
                }
            }
            //图片文件的相对路径已经保存在文件名中
            else {
                fileStream =  ServletActionContext.getServletContext().getResourceAsStream(file);
                if (fileStream != null) {
                    return SUCCESS;
                }
            }
        }
//        ActionContext.getContext().put("message", "文件不存在！");
        return "fileNotFound";
    }

    /**
     * 判断下载路径是否存在该文件
     */
    private boolean fileExist(String path) {
        File file = new File(path);
        if (file.exists()){
            return true;
        }
        return false;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


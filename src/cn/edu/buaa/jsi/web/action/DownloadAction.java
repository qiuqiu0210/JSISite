package cn.edu.buaa.jsi.web.action;

import org.apache.struts2.ServletActionContext;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 14-8-21.
 */
//文件下载
public class DownloadAction extends BaseAction{

    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    //返回一个输入流，作为一个客户端来说是一个输入流，但对于服务器端是一个 输出流
    public InputStream getDownloadFile() throws UnsupportedEncodingException {
        if (this.fileName != null){
            //解决乱码问题
            String file = new String(fileName.getBytes("ISO-8859-1"),"UTF-8");
            return ServletActionContext.getServletContext().getResourceAsStream("upload/"+file) ;
        }
        return null;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}


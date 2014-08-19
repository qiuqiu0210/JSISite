package cn.edu.buaa.jsi.web.action;

import cn.edu.buaa.jsi.service.ImageService;

import java.io.File;
import java.io.InputStream;

/**
 * Created by Administrator on 14-8-19.
 */
public class pictureAction extends BaseAction {
    private int id;
    private File image;
    private ImageService imageService;
    private InputStream inputStream;

    public String execute() throws Exception {
        if (image != null){
            imageService.addImage(image);
            return SUCCESS;
        }
        return INPUT;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public void setImageService(ImageService imageService) {
        this.imageService = imageService;
    }

    public void setId(int id) {
        this.id = id;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String viewImage() throws Exception {
        inputStream = imageService.findImageById(id).getImage().getBinaryStream();
        return SUCCESS;
    }
}

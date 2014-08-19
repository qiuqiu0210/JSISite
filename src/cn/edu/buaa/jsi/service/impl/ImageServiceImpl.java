package cn.edu.buaa.jsi.service.impl;

import cn.edu.buaa.jsi.entities.Image;
import cn.edu.buaa.jsi.hibernate.dao.ImageDao;
import cn.edu.buaa.jsi.service.ImageService;

import java.io.File;
import java.io.Serializable;

/**
 * Created by Administrator on 14-8-19.
 */
public class ImageServiceImpl implements ImageService {
    private ImageDao imageDao;
    @Override
    public boolean addImage(File image) {
        return this.imageDao.saveImage(image);
    }

    @Override
    public Image findImageById(Serializable id) {
        return this.imageDao.findImageById(id);
    }

    public void setImageDao(ImageDao imageDao) {
        this.imageDao = imageDao;
    }
}

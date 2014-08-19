package cn.edu.buaa.jsi.service;

import cn.edu.buaa.jsi.entities.Image;

import java.io.File;
import java.io.Serializable;

/**
 * Created by Administrator on 14-8-19.
 */
public interface ImageService {
    public boolean addImage(File image);
    public Image findImageById(Serializable id);
}

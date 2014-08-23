package cn.edu.buaa.jsi.service;

import cn.edu.buaa.jsi.entities.Image;

import java.io.File;
import java.io.Serializable;

/**
 * 图像业务接口
 * @author songliu
 * @since 2014/08/19
 */
public interface ImageService {
    public boolean addImage(File image);
    public Image findImageById(Serializable id);
}

package cn.edu.buaa.jsi.hibernate.dao;

import cn.edu.buaa.jsi.entities.Image;

import java.io.File;
import java.io.Serializable;

/**
 * 图像dao接口
 * @author songliu
 * @since 2014/08/19
 */
public interface ImageDao {
    public boolean saveImage(File image);
    public Image findImageById(Serializable id);
}

package cn.edu.buaa.jsi.hibernate.dao;

import cn.edu.buaa.jsi.entities.Image;

import java.io.File;
import java.io.Serializable;

/**
 * Created by Administrator on 14-8-19.
 */
public interface ImageDao {
    public boolean saveImage(File image);
    public Image findImageById(Serializable id);
}

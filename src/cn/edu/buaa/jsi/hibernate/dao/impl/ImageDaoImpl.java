package cn.edu.buaa.jsi.hibernate.dao.impl;

import cn.edu.buaa.jsi.entities.Image;
import cn.edu.buaa.jsi.hibernate.dao.ImageDao;
import org.hibernate.LobHelper;
import org.hibernate.Session;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.sql.Blob;

/**
 * Created by Administrator on 14-8-19.
 */
public class ImageDaoImpl extends BaseDaoImpl implements ImageDao {
    @Override
    public boolean saveImage(File image) {
        try {
            FileInputStream fin = new FileInputStream(image);
//            Session session = getSessionFactory().getCurrentSession();
            Session session = getSessionFactory().openSession();
            LobHelper lobHelper = session.getLobHelper();
            Blob blob = lobHelper.createBlob(fin,fin.available());
            Image im = new Image();
            im.setImage(blob);
            return this.save(im);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Image findImageById(Serializable id) {
        return (Image)this.findById(Image.class, id);
    }
}
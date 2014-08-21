package cn.edu.buaa.jsi.hibernate.dao.impl;

import cn.edu.buaa.jsi.entities.UpFile;
import cn.edu.buaa.jsi.hibernate.dao.FileDao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 14-8-21.
 */
public class FileDaoImpl extends BaseDaoImpl implements FileDao {
    @Override
    public List<UpFile> findAllFiles() {
        return this.findAll(UpFile.class);
    }

    @Override
    public UpFile findFileById(Serializable id) {
        return (UpFile)this.findByProperty("fileId", id, UpFile.class).get(0);
    }

    @Override
    public boolean saveFile(UpFile upFile) {
        return this.save(upFile);
    }

    @Override
    public boolean updateFile(UpFile upFile) {
        return this.update(upFile);
    }

    @Override
    public boolean removeFileById(Serializable id) {
        return this.deleteByProperty("fileId", id, UpFile.class);
    }
}

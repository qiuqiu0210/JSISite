package cn.edu.buaa.jsi.hibernate.dao.impl;

import cn.edu.buaa.jsi.entities.FileEntity;
import cn.edu.buaa.jsi.hibernate.dao.FileDao;

import java.io.Serializable;
import java.util.List;

/**
 * 文件dao接口实现类
 * @author songliu
 * @since 2014/08/21
 */
public class FileDaoImpl extends BaseDaoImpl implements FileDao {
    @Override
    public List<FileEntity> findAllFiles() {
        return this.findAll(FileEntity.class);
    }

    @Override
    public FileEntity findFileById(Serializable id) {
        return (FileEntity)this.findByProperty("fileId", id, FileEntity.class).get(0);
    }

    @Override
    public boolean saveFile(FileEntity fileEntity) {
        return this.save(fileEntity);
    }

    @Override
    public boolean updateFile(FileEntity fileEntity) {
        return this.update(fileEntity);
    }

    @Override
    public boolean deleteFileById(Serializable id) {
        return this.deleteByProperty("fileId", id, FileEntity.class);
    }
}

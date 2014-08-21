package cn.edu.buaa.jsi.hibernate.dao;

import cn.edu.buaa.jsi.entities.UpFile;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 14-8-21.
 */
public interface FileDao {
    public List<UpFile> findAllFiles();
    public UpFile findFileById(Serializable id);
    public boolean saveFile(UpFile upFile);
    public boolean updateFile(UpFile upFile);
    public boolean removeFileById(Serializable id);
}

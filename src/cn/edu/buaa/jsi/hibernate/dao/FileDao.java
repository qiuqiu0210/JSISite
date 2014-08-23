package cn.edu.buaa.jsi.hibernate.dao;

import cn.edu.buaa.jsi.entities.FileEntity;

import java.io.Serializable;
import java.util.List;

/**
 * 文件dao接口
 * @author songliu
 * @since 2014/08/21
 */
public interface FileDao {
    /**
     * 查询所有文件
     * @return List<FileEntity>
     */
    public List<FileEntity> findAllFiles();

    /**
     * 通过id查询文件
     * @param id
     * @return FileEntity
     */
    public FileEntity findFileById(Serializable id);

    /**
     * 保存文件
     * @param fileEntity
     * @return boolean
     */
    public boolean saveFile(FileEntity fileEntity);

    /**
     * 更新文件
     * @param fileEntity
     * @return boolean
     */
    public boolean updateFile(FileEntity fileEntity);

    /**
     * 根据id删除文件
     * @param id
     * @return boolean
     */
    public boolean deleteFileById(Serializable id);
}

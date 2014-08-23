package cn.edu.buaa.jsi.service;

import cn.edu.buaa.jsi.entities.FileEntity;

import java.io.File;
import java.util.List;

/**
 * 文件业务接口
 * @author songliu
 * @since 2014/08/21
 */
public interface FileService {
    /**
     * 查询所有文件
     * @return
     */
    public List<FileEntity> findAllFiles();

    /**
     * 根据id查询文件
     * @param id
     * @return
     */
    public FileEntity findFileById(int id);

    /**
     * 保存文件信息
     * @param fileEntity
     * @return
     */
    public boolean saveFile(FileEntity fileEntity);

    /**
     * 保存文件信息并上传到服务器
     * @param fileEntity
     * @param oldFile
     * @param newFile
     * @return
     */
    public boolean saveFileAndUpload(FileEntity fileEntity, File oldFile, File newFile);

    /**
     * 更新文件信息
     * @param fileEntity
     * @return
     */
    public boolean updateFile(FileEntity fileEntity);

    /**
     * 删除文件信息及文件
     * @param id
     * @return
     */
    public boolean deleteFileById(int id);
}

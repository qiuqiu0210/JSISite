package cn.edu.buaa.jsi.service;

import cn.edu.buaa.jsi.entities.UpFile;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 14-8-21.
 */
public interface FileService {
    public List<UpFile> findAllFiles();
    public UpFile findFileById(int id);
    public boolean saveFile(UpFile upFile);
    public boolean saveFileAndUpload(UpFile upFile, File oldFile, File newFile);
    public boolean updateFile(UpFile upFile);
    public boolean removeFileById(int id);
}

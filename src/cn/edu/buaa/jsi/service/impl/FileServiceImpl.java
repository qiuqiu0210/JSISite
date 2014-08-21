package cn.edu.buaa.jsi.service.impl;

import cn.edu.buaa.jsi.entities.UpFile;
import cn.edu.buaa.jsi.hibernate.dao.FileDao;
import cn.edu.buaa.jsi.service.FileService;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 14-8-21.
 */
public class FileServiceImpl implements FileService {
    private FileDao fileDao;

    @Override
    public List<UpFile> findAllFiles() {
        return this.fileDao.findAllFiles();
    }

    @Override
    public UpFile findFileById(int id) {
        return this.fileDao.findFileById(id);
    }

    @Override
    public boolean saveFile(UpFile upFile) {
        return this.fileDao.saveFile(upFile);
    }

    @Override
    public boolean saveFileAndUpload(UpFile upFile, File oldFile, File newFile) {
        if (!newFile.getParentFile().exists()) {
            newFile.getParentFile().mkdirs();
        }
        if (oldFile != null){
            try {
                FileUtils.copyFile(oldFile, newFile);
                return this.fileDao.saveFile(upFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean updateFile(UpFile upFile) {
        return this.fileDao.updateFile(upFile);
    }

    @Override
    public boolean removeFileById(int id) {
        UpFile upFile = this.fileDao.findFileById(id);
        String filePath = upFile.getFilePath() + File.separator + upFile.getFileName();;
        File file=new File(filePath);
        if(file.exists()){
            file.delete();
        }
        return this.fileDao.removeFileById(id);
    }

    public FileDao getFileDao() {
        return fileDao;
    }

    public void setFileDao(FileDao fileDao) {
        this.fileDao = fileDao;
    }
}

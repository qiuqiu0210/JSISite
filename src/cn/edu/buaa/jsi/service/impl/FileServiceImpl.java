package cn.edu.buaa.jsi.service.impl;

import cn.edu.buaa.jsi.entities.FileEntity;
import cn.edu.buaa.jsi.hibernate.dao.FileDao;
import cn.edu.buaa.jsi.service.FileService;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 文件业务实现类
 * @author songliu
 * @since  2014/08/21
 */
public class FileServiceImpl implements FileService {
    private static Logger log = LogManager.getLogger(FileServiceImpl.class.getName());

    private FileDao fileDao;

    @Override
    public List<FileEntity> findAllFiles() {
        return this.fileDao.findAllFiles();
    }

    @Override
    public FileEntity findFileById(int id) {
        return this.fileDao.findFileById(id);
    }

    @Override
    public boolean saveFile(FileEntity fileEntity) {
        return this.fileDao.saveFile(fileEntity);
    }

    @Override
    public boolean saveFileAndUpload(FileEntity fileEntity, File oldFile, File newFile) {
        if (!newFile.getParentFile().exists()) {
            log.debug("文件路径不存在，创建路径");
            newFile.getParentFile().mkdirs();
        }
        if (oldFile != null){
            try {
                FileUtils.copyFile(oldFile, newFile);
                return this.fileDao.saveFile(fileEntity);
            } catch (IOException e) {
                log.error("get failed " + e);
            }
        }
        return false;
    }

    @Override
    public boolean updateFile(FileEntity fileEntity) {
        return this.fileDao.updateFile(fileEntity);
    }

    @Override
    public boolean deleteFileById(int id) {
        FileEntity fileEntity = this.fileDao.findFileById(id);
        String filePath = fileEntity.getFilePath() + File.separator + fileEntity.getFileName();;
        File file=new File(filePath);
        if(file.exists()){
            file.delete();
            log.debug("file deleted success");
        }
        return this.fileDao.deleteFileById(id);
    }

    public void setFileDao(FileDao fileDao) {
        this.fileDao = fileDao;
    }
}

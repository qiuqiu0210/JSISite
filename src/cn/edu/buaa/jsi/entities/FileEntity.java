package cn.edu.buaa.jsi.entities;

import java.sql.Timestamp;

/**
 *
 * @author songliu
 * @since 2014/08/21
 */
public class FileEntity {
    private int fileId;
    private String fileTitle;
    private String fileName;
    private String filePath;
    private String fileSuffix;
    private Timestamp fileTime;
    private String fileKind;
    private String fileCount;
    private String fileInfo;

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public String getFileTitle() {
        return fileTitle;
    }

    public void setFileTitle(String fileTitle) {
        this.fileTitle = fileTitle;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileSuffix() {
        return fileSuffix;
    }

    public void setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
    }

    public Timestamp getFileTime() {
        return fileTime;
    }

    public void setFileTime(Timestamp fileTime) {
        this.fileTime = fileTime;
    }

    public String getFileKind() {
        return fileKind;
    }

    public void setFileKind(String fileKind) {
        this.fileKind = fileKind;
    }

    public String getFileCount() {
        return fileCount;
    }

    public void setFileCount(String fileCount) {
        this.fileCount = fileCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileEntity fileEntity = (FileEntity) o;

        if (fileId != fileEntity.fileId) return false;
        if (fileCount != null ? !fileCount.equals(fileEntity.fileCount) : fileEntity.fileCount != null) return false;
        if (fileKind != null ? !fileKind.equals(fileEntity.fileKind) : fileEntity.fileKind != null) return false;
        if (fileName != null ? !fileName.equals(fileEntity.fileName) : fileEntity.fileName != null) return false;
        if (filePath != null ? !filePath.equals(fileEntity.filePath) : fileEntity.filePath != null) return false;
        if (fileSuffix != null ? !fileSuffix.equals(fileEntity.fileSuffix) : fileEntity.fileSuffix != null) return false;
        if (fileTime != null ? !fileTime.equals(fileEntity.fileTime) : fileEntity.fileTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileId;
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        result = 31 * result + (filePath != null ? filePath.hashCode() : 0);
        result = 31 * result + (fileSuffix != null ? fileSuffix.hashCode() : 0);
        result = 31 * result + (fileTime != null ? fileTime.hashCode() : 0);
        result = 31 * result + (fileKind != null ? fileKind.hashCode() : 0);
        result = 31 * result + (fileCount != null ? fileCount.hashCode() : 0);
        return result;
    }

    public String getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(String fileInfo) {
        this.fileInfo = fileInfo;
    }

}

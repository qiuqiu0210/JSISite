package cn.edu.buaa.jsi.entities;

import java.sql.Timestamp;

/**
 * Created by Administrator on 14-8-21.
 */
public class UpFile {
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

        UpFile upFile = (UpFile) o;

        if (fileId != upFile.fileId) return false;
        if (fileCount != null ? !fileCount.equals(upFile.fileCount) : upFile.fileCount != null) return false;
        if (fileKind != null ? !fileKind.equals(upFile.fileKind) : upFile.fileKind != null) return false;
        if (fileName != null ? !fileName.equals(upFile.fileName) : upFile.fileName != null) return false;
        if (filePath != null ? !filePath.equals(upFile.filePath) : upFile.filePath != null) return false;
        if (fileSuffix != null ? !fileSuffix.equals(upFile.fileSuffix) : upFile.fileSuffix != null) return false;
        if (fileTime != null ? !fileTime.equals(upFile.fileTime) : upFile.fileTime != null) return false;

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

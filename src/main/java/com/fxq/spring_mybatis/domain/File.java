package com.fxq.spring_mybatis.domain;

public class File {
    private Integer id;
    private Integer fid;
    private String fileName;
    private String fileCode;
    private String fileStatus;
    private Integer versionId;
    private Integer versionNumber;
    private String filePath;
    private Long fileSize;
    private String isDel;
    private Integer creator;
    private String createDate;
    private Integer modifier;
    private String modifyDate;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }

    public String getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public Integer getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", fid=" + fid +
                ", fileName='" + fileName + '\'' +
                ", fileCode='" + fileCode + '\'' +
                ", fileStatus='" + fileStatus + '\'' +
                ", versionId=" + versionId +
                ", versionNumber=" + versionNumber +
                ", filePath='" + filePath + '\'' +
                ", fileSize=" + fileSize +
                ", isDel='" + isDel + '\'' +
                ", creator=" + creator +
                ", createDate='" + createDate + '\'' +
                ", modifier=" + modifier +
                ", modifyDate='" + modifyDate + '\'' +
                '}';
    }
}

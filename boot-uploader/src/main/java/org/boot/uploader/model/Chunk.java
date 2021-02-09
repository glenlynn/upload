package org.boot.uploader.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author luoliang
 * @date 2018/6/19
 */
@Data
@Entity
public class Chunk implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    /**
     * 当前文件块，从1开始
     */
    @Column(nullable = false)
    private Integer chunkNumber;
    /**
     * 分块大小
     */
    @Column(nullable = false)
    private Long chunkSize;
    /**
     * 当前分块大小
     */
    @Column(nullable = false)
    private Long currentChunkSize;
    /**
     * 总大小
     */
    @Column(nullable = false)
    private Long totalSize;
    /**
     * 文件标识
     */
    @Column(nullable = false)
    private String identifier;
    /**
     * 文件名
     */
    @Column(nullable = false)
    private String filename;
    /**
     * 相对路径
     */
    @Column(nullable = false)
    private String relativePath;
    /**
     * 总块数
     */
    @Column(nullable = false)
    private Integer totalChunks;
    /**
     * 文件类型
     */
    @Column
    private String type;

    @Transient
    private MultipartFile file;



    //public long getId() {return id;}



    //public void setId(long id){this.id = id;}


    public Integer getChunkNumber(){return chunkNumber;}


    public void setChunkNumber(Integer chunkNumber){this.chunkNumber=chunkNumber;}


    public long getChunkSize(){return chunkSize;}


    public void setChunkSize(long chunkSize){this.chunkSize=chunkSize;}


    public long getCurrentChunkSize(){return currentChunkSize;}


    public void setCurrentChunkSize(long currentChunkSize){this.currentChunkSize=currentChunkSize;}


    public long getTotalSize(){return totalSize;}


    public void setTotalSize(long totalSize){this.totalSize=totalSize;}


    public String getIdentifier(){return identifier;}


    public void setIdentifier(String identifier){this.identifier=identifier;}


    public String getFilename(){return filename;}


    public void setFilename(String filename){this.filename=filename;}


    public String getRelativePath(){return relativePath;}


    public void setRelativePath(String relativePath){this.relativePath=relativePath;}


    public Integer getTotalChunks(){return totalChunks;}


    public void setTotalChunks(Integer totalChunks){this.totalChunks=totalChunks;}


    public String getType(){return type;}


    public void setType(String type){this.type=type;}


    public MultipartFile getFile(){return file;}


    public void setFile(MultipartFile file){this.file=file;}
}

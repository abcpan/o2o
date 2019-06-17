package com.imooc.o2o.pojo;

public class HeadLine {
    private Integer headLineId;
    private String headLineName;
    private String  headLineImage;
    private String headLineLink;
    private Integer headLinePriority;
    private Integer headLineStatus;
    private Long createTime;
    private Long lastEditTime;

    public Integer getHeadLineId() {
        return headLineId;
    }

    public void setHeadLineId(Integer headLineId) {
        this.headLineId = headLineId;
    }

    public String getHeadLineName() {
        return headLineName;
    }

    public void setHeadLineName(String headLineName) {
        this.headLineName = headLineName;
    }

    public String getHeadLineImage() {
        return headLineImage;
    }

    public void setHeadLineImage(String headLineImage) {
        this.headLineImage = headLineImage;
    }

    public String getHeadLineLink() {
        return headLineLink;
    }

    public void setHeadLineLink(String headLineLink) {
        this.headLineLink = headLineLink;
    }

    public Integer getHeadLinePriority() {
        return headLinePriority;
    }

    public void setHeadLinePriority(Integer headLinePriority) {
        this.headLinePriority = headLinePriority;
    }

    public Integer getHeadLineStatus() {
        return headLineStatus;
    }

    public void setHeadLineStatus(Integer headLineStatus) {
        this.headLineStatus = headLineStatus;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Long lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}

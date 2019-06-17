package com.imooc.o2o.pojo;

public class ShopCategory {
    private Integer shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String getShopCategoryImg;
    private Integer priority;
    private Long createTime;
    private Long lastEditTime;
    private ShopCategory superShopCategory;

    public Integer getShopCategoryId() {
        return shopCategoryId;
    }

    public void setShopCategoryId(Integer shopCategoryId) {
        this.shopCategoryId = shopCategoryId;
    }

    public String getShopCategoryName() {
        return shopCategoryName;
    }

    public void setShopCategoryName(String shopCategoryName) {
        this.shopCategoryName = shopCategoryName;
    }

    public String getShopCategoryDesc() {
        return shopCategoryDesc;
    }

    public void setShopCategoryDesc(String shopCategoryDesc) {
        this.shopCategoryDesc = shopCategoryDesc;
    }

    public String getGetShopCategoryImg() {
        return getShopCategoryImg;
    }

    public void setGetShopCategoryImg(String getShopCategoryImg) {
        this.getShopCategoryImg = getShopCategoryImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
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

    public ShopCategory getSuperShopCategory() {
        return superShopCategory;
    }

    public void setSuperShopCategory(ShopCategory superShopCategory) {
        this.superShopCategory = superShopCategory;
    }
}

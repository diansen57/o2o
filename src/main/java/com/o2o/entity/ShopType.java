package com.o2o.entity;

import java.util.Date;

/**
 * Created by ls on 2019/10/25
 */
public class ShopType {
    private Integer shopId;
    private String sType;
    private Integer level;
    private String image;
    private ShopType upId;
    private String desc;
    private Date createTime;
    private Date updateTime;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ShopType getUpId() {
        return upId;
    }

    public void setUpId(ShopType upId) {
        this.upId = upId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

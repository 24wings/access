package com.fastsun.access.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class PlatformModule {
    private String code;
    private String name;
    private String descriotion;
    private Date createTime;
    private Integer devId;

    /**
     * @return the devId
     */
    public Integer getDevId() {
        return devId;
    }

    /**
     * @param devId the devId to set
     */
    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime the createTime to set
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return the descriotion
     */
    public String getDescriotion() {
        return descriotion;
    }

    /**
     * @param descriotion the descriotion to set
     */
    public void setDescriotion(String descriotion) {
        this.descriotion = descriotion;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
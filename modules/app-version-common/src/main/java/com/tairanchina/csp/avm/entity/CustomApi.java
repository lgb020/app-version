package com.tairanchina.csp.avm.entity;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Pattern;

/**
 * Created by hzlizx on 2018/6/21 0021
 */
public class CustomApi extends BasicEntity {

    private Integer id;
    private Integer appId;
    @ApiModelProperty(value = "自定义接口名称")
    private String customName;
    @ApiModelProperty(value = "是否适用于IOS")
    private Integer iosEnabled;
    @ApiModelProperty(value = "是否适用于Android")
    private Integer androidEnabled;
    @ApiModelProperty(value = "自定义接口内容，json格式")
    private String customContent;
    @Pattern(regexp = "^[0-9a-zA-Z_]+$", message = "customKey格式不正确")
    @ApiModelProperty(value = "自定义接口的key,正则：^[0-9a-zA-Z_]+$ ")
    private String customKey;
    @ApiModelProperty(value = "自定义接口状态， 0:关闭 1:线上开启 2:测试需要")
    private Integer customStatus;
    @ApiModelProperty(value = "自定义接口支持的ios最小版本")
    private String iosMin;
    @ApiModelProperty(value = "自定义接口支持的ios最大版本")
    private String iosMax;
    @ApiModelProperty(value = "自定义接口支持的android最小版本")
    private String androidMin;
    @ApiModelProperty(value = "自定义接口支持的android最大版本")
    private String androidMax;
    private Integer delFlag;

    public Integer getCustomStatus() {
        return customStatus;
    }

    public void setCustomStatus(Integer customStatus) {
        this.customStatus = customStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public Integer getIosEnabled() {
        return iosEnabled;
    }

    public void setIosEnabled(Integer iosEnabled) {
        this.iosEnabled = iosEnabled;
    }

    public Integer getAndroidEnabled() {
        return androidEnabled;
    }

    public void setAndroidEnabled(Integer androidEnabled) {
        this.androidEnabled = androidEnabled;
    }

    public String getCustomContent() {
        return customContent;
    }

    public void setCustomContent(String customContent) {
        this.customContent = customContent;
    }

    public String getCustomKey() {
        return customKey;
    }

    public void setCustomKey(String customKey) {
        this.customKey = customKey;
    }

    public String getIosMin() {
        return iosMin;
    }

    public void setIosMin(String iosMin) {
        this.iosMin = iosMin;
    }

    public String getIosMax() {
        return iosMax;
    }

    public void setIosMax(String iosMax) {
        this.iosMax = iosMax;
    }

    public String getAndroidMin() {
        return androidMin;
    }

    public void setAndroidMin(String androidMin) {
        this.androidMin = androidMin;
    }

    public String getAndroidMax() {
        return androidMax;
    }

    public void setAndroidMax(String androidMax) {
        this.androidMax = androidMax;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}

package com.codegym.model;

import java.util.List;

public class ConfigEmail {
    private String language;
    private String pageSize;
    private boolean isSpam;
    private String signature;

    public ConfigEmail() {
    }

    public ConfigEmail(String language, String pageSize, boolean isSpam, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.isSpam = isSpam;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpam() {
        return isSpam;
    }

    public void setSpam(boolean spam) {
        isSpam = spam;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
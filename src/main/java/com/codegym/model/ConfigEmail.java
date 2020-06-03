package com.codegym.model;

public class ConfigEmail {
    private String language;
    private String pageSize;
    private boolean spamFiller;
    private String signature;

    public ConfigEmail() {
    }

    public ConfigEmail(String language, String pageSize, boolean isSpam, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.spamFiller = isSpam;
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

    public boolean isSpamFiller() {
        return spamFiller;
    }

    public void setSpamFiller(boolean spamFiller) {
        this.spamFiller = spamFiller;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
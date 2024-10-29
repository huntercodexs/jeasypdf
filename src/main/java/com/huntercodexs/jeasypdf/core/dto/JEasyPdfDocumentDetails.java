package com.huntercodexs.jeasypdf.core.dto;

public class JEasyPdfDocumentDetails {

    private int numberOfPages;
    private boolean isProtected;
    private boolean hasSignature;
    private String date;
    private String title;
    private String author;
    private String subject;
    private String pageSize;
    private String fontName;
    private String fontSize;
    private String keywords;
    private String signature;
    private String documentId;

    public JEasyPdfDocumentDetails() {
    }

    public JEasyPdfDocumentDetails(
            int numberOfPages,
            boolean isProtected,
            boolean hasSignature,
            String date,
            String title,
            String author,
            String subject,
            String pageSize,
            String fontName,
            String fontSize,
            String keywords,
            String signature,
            String documentId
    ) {
        this.numberOfPages = numberOfPages;
        this.isProtected = isProtected;
        this.hasSignature = hasSignature;
        this.date = date;
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.pageSize = pageSize;
        this.fontName = fontName;
        this.fontSize = fontSize;
        this.keywords = keywords;
        this.signature = signature;
        this.documentId = documentId;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isProtected() {
        return isProtected;
    }

    public void setProtected(boolean aProtected) {
        isProtected = aProtected;
    }

    public boolean isHasSignature() {
        return hasSignature;
    }

    public void setHasSignature(boolean hasSignature) {
        this.hasSignature = hasSignature;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
}

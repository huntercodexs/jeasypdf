package com.huntercodexs.jeasypdf.core.dto;

import com.huntercodexs.jeasypdf.core.enumerator.FontNameToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.FontSizeToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.ProtectionLevelToJEasyPdf;

public class JEasyPdfDocument {

    private int startPage;
    private int endPage;
    private int numberOfPages;
    private String date;
    private String title;
    private String author;
    private String subject;
    private FontNameToJEasyPdf fontName;
    private FontSizeToJEasyPdf fontSize;
    private String keywords;
    private String userPassword;
    private String ownerPassword;
    private ProtectionLevelToJEasyPdf protectionLevel;
    private String filenamePath;

    public JEasyPdfDocument() {
    }

    public JEasyPdfDocument(
            int startPage,
            int endPage,
            int numberOfPages,
            String date,
            String title,
            String author,
            String subject,
            FontNameToJEasyPdf fontName,
            FontSizeToJEasyPdf fontSize,
            String keywords,
            String userPassword,
            String ownerPassword,
            ProtectionLevelToJEasyPdf protectionLevel,
            String filenamePath
    ) {
        this.startPage = startPage;
        this.endPage = endPage;
        this.numberOfPages = numberOfPages;
        this.date = date;
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.fontName = fontName;
        this.fontSize = fontSize;
        this.keywords = keywords;
        this.userPassword = userPassword;
        this.ownerPassword = ownerPassword;
        this.protectionLevel = protectionLevel;
        this.filenamePath = filenamePath;
    }

    public int getStartPage() {
        return startPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

    public int getEndPage() {
        return endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
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

    public FontNameToJEasyPdf getFontName() {
        return fontName;
    }

    public void setFontName(FontNameToJEasyPdf fontName) {
        this.fontName = fontName;
    }

    public FontSizeToJEasyPdf getFontSize() {
        return fontSize;
    }

    public void setFontSize(FontSizeToJEasyPdf fontSize) {
        this.fontSize = fontSize;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getOwnerPassword() {
        return ownerPassword;
    }

    public void setOwnerPassword(String ownerPassword) {
        this.ownerPassword = ownerPassword;
    }

    public ProtectionLevelToJEasyPdf getProtectionLevel() {
        return protectionLevel;
    }

    public void setProtectionLevel(ProtectionLevelToJEasyPdf protectionLevel) {
        this.protectionLevel = protectionLevel;
    }

    public String getFilenamePath() {
        return filenamePath;
    }

    public void setFilenamePath(String filenamePath) {
        this.filenamePath = filenamePath;
    }
}

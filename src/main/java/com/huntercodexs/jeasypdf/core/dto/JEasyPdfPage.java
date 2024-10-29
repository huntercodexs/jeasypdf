package com.huntercodexs.jeasypdf.core.dto;

import com.huntercodexs.jeasypdf.core.enumerator.ColorsToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.FontNameToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.FontSizeToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.PageSizeToJEasyPdf;

public class JEasyPdfPage {

    /*Page Size*/
    /*IMPORTANT: DO NOT CHANGE THESE VALUES*/
    private int width;
    private int height;
    private int offsetX;
    private int offsetY;
    private int lineHeight;
    private int pageNumber;
    private int margin;
    private int padding;
    private byte[] byteContent;
    private PageSizeToJEasyPdf pageSize;
    private FontNameToJEasyPdf fontName;
    private FontSizeToJEasyPdf fontSize;
    private ColorsToJEasyPdf fontColor;
    private ColorsToJEasyPdf pageColor;
    private String textContent = "";
    private String imageFilepath = null;

    public static final int WIDTH_ADJUST_A4 = -15;
    public static final int OFFSET_Y_ADJUST_A4 = 25;

    public static final int[] PAGE_SIZE_LETTER = new int[]{620,792};
    public static final int[] PAGE_SIZE_A4 = new int[]{596,842};

    public JEasyPdfPage() {
    }

    public JEasyPdfPage(
            int width,
            int height,
            int offsetX,
            int offsetY,
            int lineHeight,
            int pageNumber,
            int margin,
            int padding,
            byte[] byteContent,
            PageSizeToJEasyPdf pageSize,
            FontNameToJEasyPdf fontName,
            FontSizeToJEasyPdf fontSize,
            ColorsToJEasyPdf fontColor,
            ColorsToJEasyPdf pageColor,
            String textContent,
            String imageFilepath
    ) {
        this.width = width;
        this.height = height;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.lineHeight = lineHeight;
        this.pageNumber = pageNumber;
        this.margin = margin;
        this.padding = padding;
        this.byteContent = byteContent;
        this.pageSize = pageSize;
        this.fontName = fontName;
        this.fontSize = fontSize;
        this.fontColor = fontColor;
        this.pageColor = pageColor;
        this.textContent = textContent;
        this.imageFilepath = imageFilepath;
    }

    public int getPageWidth(String type) {
        if (type.equals("LETTER") || type.equals("LETTER_LAYOUT")) {
            return PAGE_SIZE_LETTER[0];
        }
        return PAGE_SIZE_A4[0];
    }

    public int getPageHeight(String type) {
        if (type.equals("LETTER") || type.equals("LETTER_LAYOUT")) {
            return PAGE_SIZE_LETTER[1];
        }
        return PAGE_SIZE_A4[1];
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(int offsetX) {
        this.offsetX = offsetX;
    }

    public int getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(int offsetY) {
        this.offsetY = offsetY;
    }

    public int getLineHeight() {
        return lineHeight;
    }

    public void setLineHeight(int lineHeight) {
        this.lineHeight = lineHeight;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    public int getPadding() {
        return padding;
    }

    public void setPadding(int padding) {
        this.padding = padding;
    }

    public byte[] getByteContent() {
        return byteContent;
    }

    public void setByteContent(byte[] byteContent) {
        this.byteContent = byteContent;
    }

    public PageSizeToJEasyPdf getPageSize() {
        return pageSize;
    }

    public void setPageSize(PageSizeToJEasyPdf pageSize) {
        this.pageSize = pageSize;
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

    public ColorsToJEasyPdf getFontColor() {
        return fontColor;
    }

    public void setFontColor(ColorsToJEasyPdf fontColor) {
        this.fontColor = fontColor;
    }

    public ColorsToJEasyPdf getPageColor() {
        return pageColor;
    }

    public void setPageColor(ColorsToJEasyPdf pageColor) {
        this.pageColor = pageColor;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public String getImageFilepath() {
        return imageFilepath;
    }

    public void setImageFilepath(String imageFilepath) {
        this.imageFilepath = imageFilepath;
    }
}

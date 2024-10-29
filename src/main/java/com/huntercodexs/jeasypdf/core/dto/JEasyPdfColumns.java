package com.huntercodexs.jeasypdf.core.dto;

import com.huntercodexs.jeasypdf.core.enumerator.ColorsToJEasyPdf;

public class JEasyPdfColumns {

    private int width;
    private int height;
    private int offsetX;
    private int offsetY;
    private int borderWidth;
    private boolean border;
    private ColorsToJEasyPdf textColor;
    private ColorsToJEasyPdf backgroundColor;
    private ColorsToJEasyPdf borderColor;

    public JEasyPdfColumns() {
    }

    public JEasyPdfColumns(
            int width,
            int height,
            int offsetX,
            int offsetY,
            int borderWidth,
            boolean border,
            ColorsToJEasyPdf textColor,
            ColorsToJEasyPdf backgroundColor,
            ColorsToJEasyPdf borderColor
    ) {
        this.width = width;
        this.height = height;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.borderWidth = borderWidth;
        this.border = border;
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
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

    public int getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public boolean isBorder() {
        return border;
    }

    public void setBorder(boolean border) {
        this.border = border;
    }

    public ColorsToJEasyPdf getTextColor() {
        return textColor;
    }

    public void setTextColor(ColorsToJEasyPdf textColor) {
        this.textColor = textColor;
    }

    public ColorsToJEasyPdf getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(ColorsToJEasyPdf backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public ColorsToJEasyPdf getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(ColorsToJEasyPdf borderColor) {
        this.borderColor = borderColor;
    }
}

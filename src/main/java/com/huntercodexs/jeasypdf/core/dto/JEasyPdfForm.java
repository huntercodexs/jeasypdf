package com.huntercodexs.jeasypdf.core.dto;

import com.huntercodexs.jeasypdf.core.enumerator.ColorsToJEasyPdf;

public class JEasyPdfForm {

    private int width;
    private int height;
    private int offsetX;
    private int offsetY;
    private boolean border;
    private ColorsToJEasyPdf headerColor;
    private ColorsToJEasyPdf celColor;
    private ColorsToJEasyPdf borderColor;

    public JEasyPdfForm() {
    }

    public JEasyPdfForm(
            int width,
            int height,
            int offsetX,
            int offsetY,
            boolean border,
            ColorsToJEasyPdf headerColor,
            ColorsToJEasyPdf celColor,
            ColorsToJEasyPdf borderColor
    ) {
        this.width = width;
        this.height = height;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.border = border;
        this.headerColor = headerColor;
        this.celColor = celColor;
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

    public boolean isBorder() {
        return border;
    }

    public void setBorder(boolean border) {
        this.border = border;
    }

    public ColorsToJEasyPdf getHeaderColor() {
        return headerColor;
    }

    public void setHeaderColor(ColorsToJEasyPdf headerColor) {
        this.headerColor = headerColor;
    }

    public ColorsToJEasyPdf getCelColor() {
        return celColor;
    }

    public void setCelColor(ColorsToJEasyPdf celColor) {
        this.celColor = celColor;
    }

    public ColorsToJEasyPdf getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(ColorsToJEasyPdf borderColor) {
        this.borderColor = borderColor;
    }
}

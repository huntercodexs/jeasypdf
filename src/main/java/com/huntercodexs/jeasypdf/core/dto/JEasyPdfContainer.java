package com.huntercodexs.jeasypdf.core.dto;

import com.huntercodexs.jeasypdf.core.enumerator.ColorsToJEasyPdf;

public class JEasyPdfContainer {

    private int width;
    private int height;
    private int offsetX;
    private int offsetY;
    private int borderWidth = 1;
    private boolean border = false;
    private boolean roundedBorder = false;
    private ColorsToJEasyPdf backColor;
    private ColorsToJEasyPdf borderColor;

    public JEasyPdfContainer() {
    }

    public JEasyPdfContainer(
            int width,
            int height,
            int offsetX,
            int offsetY,
            int borderWidth,
            boolean border,
            boolean roundedBorder,
            ColorsToJEasyPdf backColor,
            ColorsToJEasyPdf borderColor
    ) {
        this.width = width;
        this.height = height;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.borderWidth = borderWidth;
        this.border = border;
        this.roundedBorder = roundedBorder;
        this.backColor = backColor;
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

    public boolean isRoundedBorder() {
        return roundedBorder;
    }

    public void setRoundedBorder(boolean roundedBorder) {
        this.roundedBorder = roundedBorder;
    }

    public ColorsToJEasyPdf getBackColor() {
        return backColor;
    }

    public void setBackColor(ColorsToJEasyPdf backColor) {
        this.backColor = backColor;
    }

    public ColorsToJEasyPdf getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(ColorsToJEasyPdf borderColor) {
        this.borderColor = borderColor;
    }
}

package com.huntercodexs.jeasypdf.core.dto;

import com.huntercodexs.jeasypdf.core.enumerator.ImageQualityToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.ImageTypeToJEasyPdf;

public class JEasyPdfImage {

    private int width;
    private int height;
    private int offsetX;
    private int offsetY;
    private int maxWidth;
    private int maxHeight;
    private boolean border;
    private boolean resize;
    private String filenamePath;
    private ImageTypeToJEasyPdf imageType;
    private ImageQualityToJEasyPdf imageQuality;

    public JEasyPdfImage() {
    }

    public JEasyPdfImage(
            int width,
            int height,
            int offsetX,
            int offsetY,
            int maxWidth,
            int maxHeight,
            boolean border,
            boolean resize,
            String filenamePath,
            ImageTypeToJEasyPdf imageType,
            ImageQualityToJEasyPdf imageQuality
    ) {
        this.width = width;
        this.height = height;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
        this.border = border;
        this.resize = resize;
        this.filenamePath = filenamePath;
        this.imageType = imageType;
        this.imageQuality = imageQuality;
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

    public int getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(int maxWidth) {
        this.maxWidth = maxWidth;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public boolean isBorder() {
        return border;
    }

    public void setBorder(boolean border) {
        this.border = border;
    }

    public boolean isResize() {
        return resize;
    }

    public void setResize(boolean resize) {
        this.resize = resize;
    }

    public String getFilenamePath() {
        return filenamePath;
    }

    public void setFilenamePath(String filenamePath) {
        this.filenamePath = filenamePath;
    }

    public ImageTypeToJEasyPdf getImageType() {
        return imageType;
    }

    public void setImageType(ImageTypeToJEasyPdf imageType) {
        this.imageType = imageType;
    }

    public ImageQualityToJEasyPdf getImageQuality() {
        return imageQuality;
    }

    public void setImageQuality(ImageQualityToJEasyPdf imageQuality) {
        this.imageQuality = imageQuality;
    }
}

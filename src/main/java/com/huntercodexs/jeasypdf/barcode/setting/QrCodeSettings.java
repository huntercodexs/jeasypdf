package com.huntercodexs.jeasypdf.barcode.setting;

public class QrCodeSettings {
    private int dpi = 400;
    private int margin = 0;
    private int matrix = 70;
    private int size = 70;
    private int onColor = 0xFF000001;
    private int offColor = 0xFFFFFFFF;
    private float offsetX = 0;
    private float offsetY = 400;
    private String data;

    public QrCodeSettings() {
    }

    public QrCodeSettings(
            int dpi,
            int margin,
            int matrix,
            int size,
            int onColor,
            int offColor,
            float offsetX,
            float offsetY,
            String data
    ) {
        this.dpi = dpi;
        this.margin = margin;
        this.matrix = matrix;
        this.size = size;
        this.onColor = onColor;
        this.offColor = offColor;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.data = data;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    public int getMatrix() {
        return matrix;
    }

    public void setMatrix(int matrix) {
        this.matrix = matrix;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getOnColor() {
        return onColor;
    }

    public void setOnColor(int onColor) {
        this.onColor = onColor;
    }

    public int getOffColor() {
        return offColor;
    }

    public void setOffColor(int offColor) {
        this.offColor = offColor;
    }

    public float getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(float offsetX) {
        this.offsetX = offsetX;
    }

    public float getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(float offsetY) {
        this.offsetY = offsetY;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

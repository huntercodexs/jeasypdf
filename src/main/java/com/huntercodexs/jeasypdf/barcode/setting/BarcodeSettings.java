package com.huntercodexs.jeasypdf.barcode.setting;

import org.krysalis.barcode4j.HumanReadablePlacement;

public class BarcodeSettings {

    private int dpi = 400;
    private int width = 500;
    private int height = 50;
    private int fontSize = 2;
    private int lineHeight = 20;
    private int margin = 0;
    private int orientation = 0;
    private float offsetX = 0;
    private float offsetY = 400;
    private double fixQuiteZone = 0;
    private boolean doQuiteZone = false;
    private String data;
    private String fontName = "courier";
    private HumanReadablePlacement textPosition = HumanReadablePlacement.HRP_BOTTOM;

    public BarcodeSettings() {
    }

    public BarcodeSettings(
            int dpi,
            int width,
            int height,
            int fontSize,
            int lineHeight,
            int margin,
            int orientation,
            float offsetX,
            float offsetY,
            double fixQuiteZone,
            boolean doQuiteZone,
            String data,
            String fontName,
            HumanReadablePlacement textPosition
    ) {
        this.dpi = dpi;
        this.width = width;
        this.height = height;
        this.fontSize = fontSize;
        this.lineHeight = lineHeight;
        this.margin = margin;
        this.orientation = orientation;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.fixQuiteZone = fixQuiteZone;
        this.doQuiteZone = doQuiteZone;
        this.data = data;
        this.fontName = fontName;
        this.textPosition = textPosition;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
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

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public int getLineHeight() {
        return lineHeight;
    }

    public void setLineHeight(int lineHeight) {
        this.lineHeight = lineHeight;
    }

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
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

    public double getFixQuiteZone() {
        return fixQuiteZone;
    }

    public void setFixQuiteZone(double fixQuiteZone) {
        this.fixQuiteZone = fixQuiteZone;
    }

    public boolean isDoQuiteZone() {
        return doQuiteZone;
    }

    public void setDoQuiteZone(boolean doQuiteZone) {
        this.doQuiteZone = doQuiteZone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public HumanReadablePlacement getTextPosition() {
        return textPosition;
    }

    public void setTextPosition(HumanReadablePlacement textPosition) {
        this.textPosition = textPosition;
    }
}

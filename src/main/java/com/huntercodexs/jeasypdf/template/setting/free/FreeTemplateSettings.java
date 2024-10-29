package com.huntercodexs.jeasypdf.template.setting.free;

import com.huntercodexs.jeasypdf.core.enumerator.ColorsToJEasyPdf;

public class FreeTemplateSettings {
    //General
    public int freeQuantity;
    /*IMPORTANT: DO NOT CHANGE THESE VALUES*/
    public static final int FREE_DEFAULT_OFFSET_X = 20;
    public static final int FREE_DEFAULT_OFFSET_Y = 20;
    public static final int FREE_DEFAULT_WIDTH = 570;
    public static final int FREE_DEFAULT_HEIGHT = 750;
    public boolean templateTitleEnabled = false;
    public int[] boxWidth = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetX = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetY = new int[]{0,0,0,0,0};
    public boolean[] boxBorderEnabled = new boolean[]{true, true, true, true, true};
    public ColorsToJEasyPdf[] boxBackColor = new ColorsToJEasyPdf[]{null, null, null, null, null};

    public int getFreeQuantity() {
        return freeQuantity;
    }

    public void setFreeQuantity(int freeQuantity) {
        this.freeQuantity = freeQuantity;
    }

    public boolean isTemplateTitleEnabled() {
        return templateTitleEnabled;
    }

    public void setTemplateTitleEnabled(boolean templateTitleEnabled) {
        this.templateTitleEnabled = templateTitleEnabled;
    }

    public int[] getBoxWidth() {
        return boxWidth;
    }

    public void setBoxWidth(int[] boxWidth) {
        this.boxWidth = boxWidth;
    }

    public int[] getBoxAdjustOffsetX() {
        return boxAdjustOffsetX;
    }

    public void setBoxAdjustOffsetX(int[] boxAdjustOffsetX) {
        this.boxAdjustOffsetX = boxAdjustOffsetX;
    }

    public int[] getBoxAdjustOffsetY() {
        return boxAdjustOffsetY;
    }

    public void setBoxAdjustOffsetY(int[] boxAdjustOffsetY) {
        this.boxAdjustOffsetY = boxAdjustOffsetY;
    }

    public boolean[] getBoxBorderEnabled() {
        return boxBorderEnabled;
    }

    public void setBoxBorderEnabled(boolean[] boxBorderEnabled) {
        this.boxBorderEnabled = boxBorderEnabled;
    }

    public ColorsToJEasyPdf[] getBoxBackColor() {
        return boxBackColor;
    }

    public void setBoxBackColor(ColorsToJEasyPdf[] boxBackColor) {
        this.boxBackColor = boxBackColor;
    }
}

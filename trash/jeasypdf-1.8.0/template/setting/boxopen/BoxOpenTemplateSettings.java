package com.huntercodexs.jeasypdf.template.setting.boxopen;

import com.huntercodexs.jeasypdf.core.enumerator.ColorsToJEasyPdf;

public class BoxOpenTemplateSettings {
    //General
    public int boxOpenQuantity;
    /*IMPORTANT: DO NOT CHANGE THESE VALUES*/
    public boolean templateTitleEnabled = false;
    public int[] boxWidth = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetX = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetY = new int[]{0,0,0,0,0};
    public boolean[] boxBorderEnabled = new boolean[]{true, true, true, true, true};
    public ColorsToJEasyPdf[] boxBackColor = new ColorsToJEasyPdf[]{null, null, null, null, null};

    public static final int BOX_OPEN_QUANTITY = 10;
    public static final int BOX_OPEN_DEFAULT_WIDTH = 286;
    public static final int BOX_OPEN_DEFAULT_HEIGHT = 135;
    public static final int BOX_OPEN_HEIGHT = 445;

    public int getBoxOpenQuantity() {
        return boxOpenQuantity;
    }

    public void setBoxOpenQuantity(int boxOpenQuantity) {
        this.boxOpenQuantity = boxOpenQuantity;
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

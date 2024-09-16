package com.huntercodexs.jeasypdf.template.setting.bigburger;

import com.huntercodexs.jeasypdf.core.enumerator.ColorsToJEasyPdf;

public class BigBurgerTemplateSettings {
    //General
    public int bigBurgerQuantity;
    /*IMPORTANT: DO NOT CHANGE THESE VALUES*/
    public boolean templateTitleEnabled = false;
    public int[] boxWidth = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetX = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetY = new int[]{0,0,0,0,0};
    public boolean[] boxBorderEnabled = new boolean[]{true, true, true, true, true};
    public ColorsToJEasyPdf[] boxBackColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public static final int BIG_BURGER_DEFAULT_WIDTH = 570;
    public static final int BIG_BURGER_DEFAULT_HEIGHT = 135;
    public static final int BIG_BURGER_HEADER_OFFSET_X = 20;
    public static final int BIG_BURGER_HEADER_OFFSET_Y = 640;
    public static final int BIG_BURGER_HEADER_WIDTH = 570;
    public static final int BIG_BURGER_HEADER_HEIGHT = 135;
    public static final int BIG_BURGER_BODY_OFFSET_X = 20;
    public static final int BIG_BURGER_BODY_OFFSET_Y = 170;
    public static final int BIG_BURGER_BODY_WIDTH = 570;
    public static final int BIG_BURGER_BODY_HEIGHT = 455;
    public static final int BIG_BURGER_FOOTER_OFFSET_X = 20;
    public static final int BIG_BURGER_FOOTER_OFFSET_Y = 20;
    public static final int BIG_BURGER_FOOTER_WIDTH = 570;
    public static final int BIG_BURGER_FOOTER_HEIGHT = 135;

    public int getBigBurgerQuantity() {
        return bigBurgerQuantity;
    }

    public void setBigBurgerQuantity(int bigBurgerQuantity) {
        this.bigBurgerQuantity = bigBurgerQuantity;
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

package com.huntercodexs.jeasypdf.template.setting.slim;

import com.huntercodexs.jeasypdf.core.enumerator.ColorsToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.FontNameToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.FontSizeToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.TableDimensionsToJEasyPdf;

public class SlimTemplateSettings {
    //General
    /*IMPORTANT: DO NOT CHANGE THESE VALUES*/
    public static final int BOX_QUANTITY = 5;
    public static final int COLUMN_QUANTITY = 3;
    public static final int DEFAULT_WIDTH = 570;
    public static final int DEFAULT_HEIGHT = 135;
    public static final int DEFAULT_OFFSET_X = 20;
    public static final int OFFSET_Y_BLOCK1 = 640;
    public static final int OFFSET_Y_BLOCK2 = 485;
    public static final int OFFSET_Y_BLOCK3 = 330;
    public static final int OFFSET_Y_BLOCK4 = 175;
    public static final int OFFSET_Y_BLOCK5 = 20;
    public boolean templateTitleEnabled = false;
    public int[] boxWidth = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetX = new int[]{0,0,0,0,0};
    public int[] boxAdjustOffsetY = new int[]{0,0,0,0,0};
    public boolean[] boxBorderEnabled = new boolean[]{true, true, true, true, true};
    public ColorsToJEasyPdf[] boxBackColor = new ColorsToJEasyPdf[]{null, null, null, null, null};

    //Title
    public int leftTitleAdjustmentX = 0;
    public int leftTitleAdjustmentY = 0;
    public int centerTitleAdjustmentX = 0;
    public int centerTitleAdjustmentY = 0;
    public int rightTitleAdjustmentX = 0;
    public int rightTitleAdjustmentY = 0;
    public int[] titleOffsetX = new int[]{35,250,450};
    public int[] titleOffsetY = new int[]{750,595,440,285,130};
    public boolean[] leftTitleEnable = new boolean[]{false,false,false,false,false};
    public boolean[] centerTitleEnable = new boolean[]{false,false,false,false,false};
    public boolean[] rightTitleEnable = new boolean[]{false,false,false,false,false};
    public ColorsToJEasyPdf leftTitleColor = ColorsToJEasyPdf.BLACK;
    public ColorsToJEasyPdf centerTitleColor = ColorsToJEasyPdf.BLACK;
    public ColorsToJEasyPdf rightTitleColor = ColorsToJEasyPdf.BLACK;
    public FontSizeToJEasyPdf leftTitleSize = FontSizeToJEasyPdf.MEDIUM;
    public FontSizeToJEasyPdf centerTitleSize = FontSizeToJEasyPdf.MEDIUM;
    public FontSizeToJEasyPdf rightTitleSize = FontSizeToJEasyPdf.MEDIUM;
    public FontNameToJEasyPdf leftTitleFont = FontNameToJEasyPdf.HELVETICA_B;
    public FontNameToJEasyPdf centerTitleFont = FontNameToJEasyPdf.HELVETICA_B;
    public FontNameToJEasyPdf rightTitleFont = FontNameToJEasyPdf.HELVETICA_B;

    //Column
    public int columnBoxWidth = 170;
    public int columnBoxHeight = 90;
    public int columnBoxChars = 40;
    public int[] columnBoxOffsetX = new int[]{35,220,405};
    public int[] columnBoxOffsetY = new int[]{655,500,345,190,35};
    public int[] columnBoxLeftPadding = new int[]{10,10,10,10,10};
    public int[] columnBoxCenterPadding = new int[]{10,10,10,10,10};
    public int[] columnBoxRightPadding = new int[]{10,10,10,10,10};
    public int[] columnBoxLeftBorderWidth = new int[]{1,1,1,1,1};
    public int[] columnBoxCenterBorderWidth = new int[]{1,1,1,1,1};
    public int[] columnBoxRightBorderWidth = new int[]{1,1,1,1,1};
    public int[] columnBoxLeftLineHeight = new int[]{14,14,14,14,14};
    public int[] columnBoxCenterLineHeight = new int[]{14,14,14,14,14};
    public int[] columnBoxRightLineHeight = new int[]{14,14,14,14,14};
    public int[] columnBoxLeftAdjustmentX = new int[]{0,0,0,0,0};
    public int[] columnBoxLeftAdjustmentY = new int[]{0,0,0,0,0};
    public int[] columnBoxCenterAdjustmentX = new int[]{0,0,0,0,0};
    public int[] columnBoxCenterAdjustmentY = new int[]{0,0,0,0,0};
    public int[] columnBoxRightAdjustmentX = new int[]{0,0,0,0,0};
    public int[] columnBoxRightAdjustmentY = new int[]{0,0,0,0,0};
    public boolean[] columnBoxLeftEnable = new boolean[]{false,false,false,false,false};
    public boolean[] columnBoxCenterEnable = new boolean[]{false,false,false,false,false};
    public boolean[] columnBoxRightEnable = new boolean[]{false,false,false,false,false};
    public boolean[] columnBoxLeftBorderEnable = new boolean[]{true,true,true,true,true};
    public boolean[] columnBoxCenterBorderEnable = new boolean[]{true,true,true,true,true};
    public boolean[] columnBoxRightBorderEnable = new boolean[]{true,true,true,true,true};
    public ColorsToJEasyPdf[] columnBoxLeftBackColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public ColorsToJEasyPdf[] columnBoxCenterBackColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public ColorsToJEasyPdf[] columnBoxRightBackColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public ColorsToJEasyPdf[] columnBoxLeftBorderColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public ColorsToJEasyPdf[] columnBoxCenterBorderColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public ColorsToJEasyPdf[] columnBoxRightBorderColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public ColorsToJEasyPdf[] columnBoxLeftTextColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public ColorsToJEasyPdf[] columnBoxCenterTextColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public ColorsToJEasyPdf[] columnBoxRightTextColor = new ColorsToJEasyPdf[]{null, null, null, null, null};
    public FontSizeToJEasyPdf[] columnBoxLeftFontSize = new FontSizeToJEasyPdf[]{null, null, null, null, null};
    public FontSizeToJEasyPdf[] columnBoxCenterFontSize = new FontSizeToJEasyPdf[]{null, null, null, null, null};
    public FontSizeToJEasyPdf[] columnBoxRightFontSize = new FontSizeToJEasyPdf[]{null, null, null, null, null};
    public FontNameToJEasyPdf[] columnBoxLeftFontName = new FontNameToJEasyPdf[]{null, null, null, null, null};
    public FontNameToJEasyPdf[] columnBoxCenterFontName = new FontNameToJEasyPdf[]{null, null, null, null, null};
    public FontNameToJEasyPdf[] columnBoxRightFontName = new FontNameToJEasyPdf[]{null, null, null, null, null};

    //Table
    public int tableWidth = 540;
    public int tableHeight = 90;
    public int tableOffsetX = 35;
    public int tableColumnWidth = 90;
    public int tableColumnHeight = 18;
    public int tableHeaderHeight = 30;
    public int tableHeaderAdjustOffsetX = 0;
    public int tableHeaderAdjustOffsetY = 0;
    public int tableBodyAdjustOffsetX = 0;
    public int tableBodyAdjustOffsetY = 0;
    public int[] tableContainerOffsetY = new int[]{656, 500, 346, 190, 35};
    public int[] tableHeaderOffsetY = new int[]{728, 572, 418, 262, 107};
    public int[] tableColumnOffsetX = new int[] {35,125,215,305,395,485};
    public int[] tableDataOffsetY = new int[]{710, 554, 400, 244, 89};
    public boolean[] tableEnable = new boolean[]{false,false,false,false,false};
    public ColorsToJEasyPdf tableBorderColor = ColorsToJEasyPdf.WHITE;
    public ColorsToJEasyPdf tableHeaderColor = ColorsToJEasyPdf.GRAY;
    public ColorsToJEasyPdf tableBodyColor = ColorsToJEasyPdf.ICE;
    public ColorsToJEasyPdf tableHeaderFontColor = ColorsToJEasyPdf.WHITE;
    public ColorsToJEasyPdf tableBodyFontColor = ColorsToJEasyPdf.GRAY;
    public FontSizeToJEasyPdf tableHeaderFontSize = FontSizeToJEasyPdf.NORMAL;
    public FontSizeToJEasyPdf tableBodyFontSize = FontSizeToJEasyPdf.NORMAL;
    public FontNameToJEasyPdf tableHeaderFontName = FontNameToJEasyPdf.HELVETICA;
    public FontNameToJEasyPdf tableBodyFontName = FontNameToJEasyPdf.HELVETICA;
    public TableDimensionsToJEasyPdf tableSize = TableDimensionsToJEasyPdf.TABLE_5X6;

    //Signature Box
    public int signatureBoxWidth = 200;
    public int signatureBoxHeight = 100;
    public int signatureBoxAdjustOffsetX = 0;
    public int[] signatureBoxOffsetX = new int[]{55,210,355};
    public int[] signatureBoxOffsetY = new int[]{35,122,100};
    public int[] signatureBoxDigitalTitleOffsetX = new int[]{105,260,405};
    public int[] signatureBoxContentOffsetX = new int[]{70,230,370};
    public boolean signatureBoxBorderEnable = false;
    public boolean leftSignatureBoxEnable = false;
    public boolean centerSignatureBoxEnable = false;
    public boolean rightSignatureBoxEnable = false;
    public FontSizeToJEasyPdf signatureFontSize = FontSizeToJEasyPdf.SMALL;
    public FontNameToJEasyPdf signatureFontName = FontNameToJEasyPdf.HELVETICA_B;
    public ColorsToJEasyPdf signatureBoxColor = ColorsToJEasyPdf.BLACK;

    //Signature Tape
    public int signatureTapeWidth = 500;
    public int signatureTapeHeight = 30;
    public int signatureTapeOffsetX = 55;
    public int signatureTapeOffsetY = 35;
    public int signatureTapeTitleOffsetX = 260;
    public int signatureTapeTitleOffsetY = 57;
    public int signatureTapeValueOffsetX = 130;
    public int signatureTapeValueOffsetY = 40;
    public int signatureTapeAdjustOffsetX = 10;
    public boolean signatureTapeEnable = false;
    public FontSizeToJEasyPdf signatureTapeFontSize = FontSizeToJEasyPdf.SMALL;
    public FontNameToJEasyPdf signatureTapeFontName = FontNameToJEasyPdf.HELVETICA_B;
    public ColorsToJEasyPdf signatureTapeColor = ColorsToJEasyPdf.GRAY;

    //Text
    public int lineHeight = 18;
    public int textOffsetX = 35;
    public int textChars = 400;
    public int[] textOffsetY = new int[]{732,577,421,266,111};
    public boolean[] textEnable = new boolean[]{false,false,false,false,false};
    public ColorsToJEasyPdf textColor = ColorsToJEasyPdf.BLACK;
    public FontSizeToJEasyPdf textSize = FontSizeToJEasyPdf.NORMAL;
    public FontNameToJEasyPdf textFont = FontNameToJEasyPdf.HELVETICA;

    //Image
    public int imageWidth = 0;
    public int imageHeight = 0;
    public int imageAdjustOffsetX = 0;
    public int imageAdjustOffsetY = 0;
    public int[] imageOffsetX = new int[]{35,180,330};
    public int[] imageOffsetY = new int[]{650,495,340,185,30};
    public boolean[] leftImageEnable = new boolean[]{false,false,false,false,false};
    public boolean[] centerImageEnable = new boolean[]{false,false,false,false,false};
    public boolean[] rightImageEnable = new boolean[]{false,false,false,false,false};

    //Barcode
    public int barcodeDpi = 400;
    public int barcodeWidth = 500;
    public int barcodeHeight = 50;
    public static final int barcodeOffsetX = 55;
    public int barcodeAdjustOffsetX = 0;
    public int barcodeAdjustOffsetY = 0;
    public int[] barcodeOffsetY = new int[]{655,500,345,190,35};
    public int[] barcodeInfoOffsetY = new int[]{750, 595, 440, 285, 130};
    public int[] barcodeValueOffsetY = new int[]{690, 535, 380, 225, 70};
    public int[] barcodeAmountOffsetY = new int[]{745, 590, 435, 280, 135};
    public boolean barcodeShowText = true;
    public boolean[] barcodeEnabled = new boolean[]{false,false,false,false,false};

    //QRCode
    public int qrCodeDpi = 400;
    public int qrCodeWidth = 200;
    public int qrCodeHeight = 50;
    public int qrCodeAdjustOffsetX = 0;
    public int qrCodeAdjustOffsetY = 0;
    public int[] qrCodeOffsetX = new int[]{40,260,470};
    public int[] qrCodeOffsetY = new int[]{655,502,348,193,38};
    public int[] qrCodeInfoOffsetX = new int[]{145, 365, 365};
    public int[] qrCodeInfoOffsetY = new int[]{745, 595, 440, 285, 130};
    public boolean[] qrCodeLeftEnable = new boolean[]{false,false,false,false,false};
    public boolean[] qrCodeCenterEnable = new boolean[]{false,false,false,false,false};
    public boolean[] qrCodeRightEnable = new boolean[]{false,false,false,false,false};

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

    public int getLeftTitleAdjustmentX() {
        return leftTitleAdjustmentX;
    }

    public void setLeftTitleAdjustmentX(int leftTitleAdjustmentX) {
        this.leftTitleAdjustmentX = leftTitleAdjustmentX;
    }

    public int getLeftTitleAdjustmentY() {
        return leftTitleAdjustmentY;
    }

    public void setLeftTitleAdjustmentY(int leftTitleAdjustmentY) {
        this.leftTitleAdjustmentY = leftTitleAdjustmentY;
    }

    public int getCenterTitleAdjustmentX() {
        return centerTitleAdjustmentX;
    }

    public void setCenterTitleAdjustmentX(int centerTitleAdjustmentX) {
        this.centerTitleAdjustmentX = centerTitleAdjustmentX;
    }

    public int getCenterTitleAdjustmentY() {
        return centerTitleAdjustmentY;
    }

    public void setCenterTitleAdjustmentY(int centerTitleAdjustmentY) {
        this.centerTitleAdjustmentY = centerTitleAdjustmentY;
    }

    public int getRightTitleAdjustmentX() {
        return rightTitleAdjustmentX;
    }

    public void setRightTitleAdjustmentX(int rightTitleAdjustmentX) {
        this.rightTitleAdjustmentX = rightTitleAdjustmentX;
    }

    public int getRightTitleAdjustmentY() {
        return rightTitleAdjustmentY;
    }

    public void setRightTitleAdjustmentY(int rightTitleAdjustmentY) {
        this.rightTitleAdjustmentY = rightTitleAdjustmentY;
    }

    public int[] getTitleOffsetX() {
        return titleOffsetX;
    }

    public void setTitleOffsetX(int[] titleOffsetX) {
        this.titleOffsetX = titleOffsetX;
    }

    public int[] getTitleOffsetY() {
        return titleOffsetY;
    }

    public void setTitleOffsetY(int[] titleOffsetY) {
        this.titleOffsetY = titleOffsetY;
    }

    public boolean[] getLeftTitleEnable() {
        return leftTitleEnable;
    }

    public void setLeftTitleEnable(boolean[] leftTitleEnable) {
        this.leftTitleEnable = leftTitleEnable;
    }

    public boolean[] getCenterTitleEnable() {
        return centerTitleEnable;
    }

    public void setCenterTitleEnable(boolean[] centerTitleEnable) {
        this.centerTitleEnable = centerTitleEnable;
    }

    public boolean[] getRightTitleEnable() {
        return rightTitleEnable;
    }

    public void setRightTitleEnable(boolean[] rightTitleEnable) {
        this.rightTitleEnable = rightTitleEnable;
    }

    public ColorsToJEasyPdf getLeftTitleColor() {
        return leftTitleColor;
    }

    public void setLeftTitleColor(ColorsToJEasyPdf leftTitleColor) {
        this.leftTitleColor = leftTitleColor;
    }

    public ColorsToJEasyPdf getCenterTitleColor() {
        return centerTitleColor;
    }

    public void setCenterTitleColor(ColorsToJEasyPdf centerTitleColor) {
        this.centerTitleColor = centerTitleColor;
    }

    public ColorsToJEasyPdf getRightTitleColor() {
        return rightTitleColor;
    }

    public void setRightTitleColor(ColorsToJEasyPdf rightTitleColor) {
        this.rightTitleColor = rightTitleColor;
    }

    public FontSizeToJEasyPdf getLeftTitleSize() {
        return leftTitleSize;
    }

    public void setLeftTitleSize(FontSizeToJEasyPdf leftTitleSize) {
        this.leftTitleSize = leftTitleSize;
    }

    public FontSizeToJEasyPdf getCenterTitleSize() {
        return centerTitleSize;
    }

    public void setCenterTitleSize(FontSizeToJEasyPdf centerTitleSize) {
        this.centerTitleSize = centerTitleSize;
    }

    public FontSizeToJEasyPdf getRightTitleSize() {
        return rightTitleSize;
    }

    public void setRightTitleSize(FontSizeToJEasyPdf rightTitleSize) {
        this.rightTitleSize = rightTitleSize;
    }

    public FontNameToJEasyPdf getLeftTitleFont() {
        return leftTitleFont;
    }

    public void setLeftTitleFont(FontNameToJEasyPdf leftTitleFont) {
        this.leftTitleFont = leftTitleFont;
    }

    public FontNameToJEasyPdf getCenterTitleFont() {
        return centerTitleFont;
    }

    public void setCenterTitleFont(FontNameToJEasyPdf centerTitleFont) {
        this.centerTitleFont = centerTitleFont;
    }

    public FontNameToJEasyPdf getRightTitleFont() {
        return rightTitleFont;
    }

    public void setRightTitleFont(FontNameToJEasyPdf rightTitleFont) {
        this.rightTitleFont = rightTitleFont;
    }

    public int getColumnBoxWidth() {
        return columnBoxWidth;
    }

    public void setColumnBoxWidth(int columnBoxWidth) {
        this.columnBoxWidth = columnBoxWidth;
    }

    public int getColumnBoxHeight() {
        return columnBoxHeight;
    }

    public void setColumnBoxHeight(int columnBoxHeight) {
        this.columnBoxHeight = columnBoxHeight;
    }

    public int getColumnBoxChars() {
        return columnBoxChars;
    }

    public void setColumnBoxChars(int columnBoxChars) {
        this.columnBoxChars = columnBoxChars;
    }

    public int[] getColumnBoxOffsetX() {
        return columnBoxOffsetX;
    }

    public void setColumnBoxOffsetX(int[] columnBoxOffsetX) {
        this.columnBoxOffsetX = columnBoxOffsetX;
    }

    public int[] getColumnBoxOffsetY() {
        return columnBoxOffsetY;
    }

    public void setColumnBoxOffsetY(int[] columnBoxOffsetY) {
        this.columnBoxOffsetY = columnBoxOffsetY;
    }

    public int[] getColumnBoxLeftPadding() {
        return columnBoxLeftPadding;
    }

    public void setColumnBoxLeftPadding(int[] columnBoxLeftPadding) {
        this.columnBoxLeftPadding = columnBoxLeftPadding;
    }

    public int[] getColumnBoxCenterPadding() {
        return columnBoxCenterPadding;
    }

    public void setColumnBoxCenterPadding(int[] columnBoxCenterPadding) {
        this.columnBoxCenterPadding = columnBoxCenterPadding;
    }

    public int[] getColumnBoxRightPadding() {
        return columnBoxRightPadding;
    }

    public void setColumnBoxRightPadding(int[] columnBoxRightPadding) {
        this.columnBoxRightPadding = columnBoxRightPadding;
    }

    public int[] getColumnBoxLeftBorderWidth() {
        return columnBoxLeftBorderWidth;
    }

    public void setColumnBoxLeftBorderWidth(int[] columnBoxLeftBorderWidth) {
        this.columnBoxLeftBorderWidth = columnBoxLeftBorderWidth;
    }

    public int[] getColumnBoxCenterBorderWidth() {
        return columnBoxCenterBorderWidth;
    }

    public void setColumnBoxCenterBorderWidth(int[] columnBoxCenterBorderWidth) {
        this.columnBoxCenterBorderWidth = columnBoxCenterBorderWidth;
    }

    public int[] getColumnBoxRightBorderWidth() {
        return columnBoxRightBorderWidth;
    }

    public void setColumnBoxRightBorderWidth(int[] columnBoxRightBorderWidth) {
        this.columnBoxRightBorderWidth = columnBoxRightBorderWidth;
    }

    public int[] getColumnBoxLeftLineHeight() {
        return columnBoxLeftLineHeight;
    }

    public void setColumnBoxLeftLineHeight(int[] columnBoxLeftLineHeight) {
        this.columnBoxLeftLineHeight = columnBoxLeftLineHeight;
    }

    public int[] getColumnBoxCenterLineHeight() {
        return columnBoxCenterLineHeight;
    }

    public void setColumnBoxCenterLineHeight(int[] columnBoxCenterLineHeight) {
        this.columnBoxCenterLineHeight = columnBoxCenterLineHeight;
    }

    public int[] getColumnBoxRightLineHeight() {
        return columnBoxRightLineHeight;
    }

    public void setColumnBoxRightLineHeight(int[] columnBoxRightLineHeight) {
        this.columnBoxRightLineHeight = columnBoxRightLineHeight;
    }

    public int[] getColumnBoxLeftAdjustmentX() {
        return columnBoxLeftAdjustmentX;
    }

    public void setColumnBoxLeftAdjustmentX(int[] columnBoxLeftAdjustmentX) {
        this.columnBoxLeftAdjustmentX = columnBoxLeftAdjustmentX;
    }

    public int[] getColumnBoxLeftAdjustmentY() {
        return columnBoxLeftAdjustmentY;
    }

    public void setColumnBoxLeftAdjustmentY(int[] columnBoxLeftAdjustmentY) {
        this.columnBoxLeftAdjustmentY = columnBoxLeftAdjustmentY;
    }

    public int[] getColumnBoxCenterAdjustmentX() {
        return columnBoxCenterAdjustmentX;
    }

    public void setColumnBoxCenterAdjustmentX(int[] columnBoxCenterAdjustmentX) {
        this.columnBoxCenterAdjustmentX = columnBoxCenterAdjustmentX;
    }

    public int[] getColumnBoxCenterAdjustmentY() {
        return columnBoxCenterAdjustmentY;
    }

    public void setColumnBoxCenterAdjustmentY(int[] columnBoxCenterAdjustmentY) {
        this.columnBoxCenterAdjustmentY = columnBoxCenterAdjustmentY;
    }

    public int[] getColumnBoxRightAdjustmentX() {
        return columnBoxRightAdjustmentX;
    }

    public void setColumnBoxRightAdjustmentX(int[] columnBoxRightAdjustmentX) {
        this.columnBoxRightAdjustmentX = columnBoxRightAdjustmentX;
    }

    public int[] getColumnBoxRightAdjustmentY() {
        return columnBoxRightAdjustmentY;
    }

    public void setColumnBoxRightAdjustmentY(int[] columnBoxRightAdjustmentY) {
        this.columnBoxRightAdjustmentY = columnBoxRightAdjustmentY;
    }

    public boolean[] getColumnBoxLeftEnable() {
        return columnBoxLeftEnable;
    }

    public void setColumnBoxLeftEnable(boolean[] columnBoxLeftEnable) {
        this.columnBoxLeftEnable = columnBoxLeftEnable;
    }

    public boolean[] getColumnBoxCenterEnable() {
        return columnBoxCenterEnable;
    }

    public void setColumnBoxCenterEnable(boolean[] columnBoxCenterEnable) {
        this.columnBoxCenterEnable = columnBoxCenterEnable;
    }

    public boolean[] getColumnBoxRightEnable() {
        return columnBoxRightEnable;
    }

    public void setColumnBoxRightEnable(boolean[] columnBoxRightEnable) {
        this.columnBoxRightEnable = columnBoxRightEnable;
    }

    public boolean[] getColumnBoxLeftBorderEnable() {
        return columnBoxLeftBorderEnable;
    }

    public void setColumnBoxLeftBorderEnable(boolean[] columnBoxLeftBorderEnable) {
        this.columnBoxLeftBorderEnable = columnBoxLeftBorderEnable;
    }

    public boolean[] getColumnBoxCenterBorderEnable() {
        return columnBoxCenterBorderEnable;
    }

    public void setColumnBoxCenterBorderEnable(boolean[] columnBoxCenterBorderEnable) {
        this.columnBoxCenterBorderEnable = columnBoxCenterBorderEnable;
    }

    public boolean[] getColumnBoxRightBorderEnable() {
        return columnBoxRightBorderEnable;
    }

    public void setColumnBoxRightBorderEnable(boolean[] columnBoxRightBorderEnable) {
        this.columnBoxRightBorderEnable = columnBoxRightBorderEnable;
    }

    public ColorsToJEasyPdf[] getColumnBoxLeftBackColor() {
        return columnBoxLeftBackColor;
    }

    public void setColumnBoxLeftBackColor(ColorsToJEasyPdf[] columnBoxLeftBackColor) {
        this.columnBoxLeftBackColor = columnBoxLeftBackColor;
    }

    public ColorsToJEasyPdf[] getColumnBoxCenterBackColor() {
        return columnBoxCenterBackColor;
    }

    public void setColumnBoxCenterBackColor(ColorsToJEasyPdf[] columnBoxCenterBackColor) {
        this.columnBoxCenterBackColor = columnBoxCenterBackColor;
    }

    public ColorsToJEasyPdf[] getColumnBoxRightBackColor() {
        return columnBoxRightBackColor;
    }

    public void setColumnBoxRightBackColor(ColorsToJEasyPdf[] columnBoxRightBackColor) {
        this.columnBoxRightBackColor = columnBoxRightBackColor;
    }

    public ColorsToJEasyPdf[] getColumnBoxLeftBorderColor() {
        return columnBoxLeftBorderColor;
    }

    public void setColumnBoxLeftBorderColor(ColorsToJEasyPdf[] columnBoxLeftBorderColor) {
        this.columnBoxLeftBorderColor = columnBoxLeftBorderColor;
    }

    public ColorsToJEasyPdf[] getColumnBoxCenterBorderColor() {
        return columnBoxCenterBorderColor;
    }

    public void setColumnBoxCenterBorderColor(ColorsToJEasyPdf[] columnBoxCenterBorderColor) {
        this.columnBoxCenterBorderColor = columnBoxCenterBorderColor;
    }

    public ColorsToJEasyPdf[] getColumnBoxRightBorderColor() {
        return columnBoxRightBorderColor;
    }

    public void setColumnBoxRightBorderColor(ColorsToJEasyPdf[] columnBoxRightBorderColor) {
        this.columnBoxRightBorderColor = columnBoxRightBorderColor;
    }

    public ColorsToJEasyPdf[] getColumnBoxLeftTextColor() {
        return columnBoxLeftTextColor;
    }

    public void setColumnBoxLeftTextColor(ColorsToJEasyPdf[] columnBoxLeftTextColor) {
        this.columnBoxLeftTextColor = columnBoxLeftTextColor;
    }

    public ColorsToJEasyPdf[] getColumnBoxCenterTextColor() {
        return columnBoxCenterTextColor;
    }

    public void setColumnBoxCenterTextColor(ColorsToJEasyPdf[] columnBoxCenterTextColor) {
        this.columnBoxCenterTextColor = columnBoxCenterTextColor;
    }

    public ColorsToJEasyPdf[] getColumnBoxRightTextColor() {
        return columnBoxRightTextColor;
    }

    public void setColumnBoxRightTextColor(ColorsToJEasyPdf[] columnBoxRightTextColor) {
        this.columnBoxRightTextColor = columnBoxRightTextColor;
    }

    public FontSizeToJEasyPdf[] getColumnBoxLeftFontSize() {
        return columnBoxLeftFontSize;
    }

    public void setColumnBoxLeftFontSize(FontSizeToJEasyPdf[] columnBoxLeftFontSize) {
        this.columnBoxLeftFontSize = columnBoxLeftFontSize;
    }

    public FontSizeToJEasyPdf[] getColumnBoxCenterFontSize() {
        return columnBoxCenterFontSize;
    }

    public void setColumnBoxCenterFontSize(FontSizeToJEasyPdf[] columnBoxCenterFontSize) {
        this.columnBoxCenterFontSize = columnBoxCenterFontSize;
    }

    public FontSizeToJEasyPdf[] getColumnBoxRightFontSize() {
        return columnBoxRightFontSize;
    }

    public void setColumnBoxRightFontSize(FontSizeToJEasyPdf[] columnBoxRightFontSize) {
        this.columnBoxRightFontSize = columnBoxRightFontSize;
    }

    public FontNameToJEasyPdf[] getColumnBoxLeftFontName() {
        return columnBoxLeftFontName;
    }

    public void setColumnBoxLeftFontName(FontNameToJEasyPdf[] columnBoxLeftFontName) {
        this.columnBoxLeftFontName = columnBoxLeftFontName;
    }

    public FontNameToJEasyPdf[] getColumnBoxCenterFontName() {
        return columnBoxCenterFontName;
    }

    public void setColumnBoxCenterFontName(FontNameToJEasyPdf[] columnBoxCenterFontName) {
        this.columnBoxCenterFontName = columnBoxCenterFontName;
    }

    public FontNameToJEasyPdf[] getColumnBoxRightFontName() {
        return columnBoxRightFontName;
    }

    public void setColumnBoxRightFontName(FontNameToJEasyPdf[] columnBoxRightFontName) {
        this.columnBoxRightFontName = columnBoxRightFontName;
    }

    public int getTableWidth() {
        return tableWidth;
    }

    public void setTableWidth(int tableWidth) {
        this.tableWidth = tableWidth;
    }

    public int getTableHeight() {
        return tableHeight;
    }

    public void setTableHeight(int tableHeight) {
        this.tableHeight = tableHeight;
    }

    public int getTableOffsetX() {
        return tableOffsetX;
    }

    public void setTableOffsetX(int tableOffsetX) {
        this.tableOffsetX = tableOffsetX;
    }

    public int getTableColumnWidth() {
        return tableColumnWidth;
    }

    public void setTableColumnWidth(int tableColumnWidth) {
        this.tableColumnWidth = tableColumnWidth;
    }

    public int getTableColumnHeight() {
        return tableColumnHeight;
    }

    public void setTableColumnHeight(int tableColumnHeight) {
        this.tableColumnHeight = tableColumnHeight;
    }

    public int getTableHeaderHeight() {
        return tableHeaderHeight;
    }

    public void setTableHeaderHeight(int tableHeaderHeight) {
        this.tableHeaderHeight = tableHeaderHeight;
    }

    public int getTableHeaderAdjustOffsetX() {
        return tableHeaderAdjustOffsetX;
    }

    public void setTableHeaderAdjustOffsetX(int tableHeaderAdjustOffsetX) {
        this.tableHeaderAdjustOffsetX = tableHeaderAdjustOffsetX;
    }

    public int getTableHeaderAdjustOffsetY() {
        return tableHeaderAdjustOffsetY;
    }

    public void setTableHeaderAdjustOffsetY(int tableHeaderAdjustOffsetY) {
        this.tableHeaderAdjustOffsetY = tableHeaderAdjustOffsetY;
    }

    public int getTableBodyAdjustOffsetX() {
        return tableBodyAdjustOffsetX;
    }

    public void setTableBodyAdjustOffsetX(int tableBodyAdjustOffsetX) {
        this.tableBodyAdjustOffsetX = tableBodyAdjustOffsetX;
    }

    public int getTableBodyAdjustOffsetY() {
        return tableBodyAdjustOffsetY;
    }

    public void setTableBodyAdjustOffsetY(int tableBodyAdjustOffsetY) {
        this.tableBodyAdjustOffsetY = tableBodyAdjustOffsetY;
    }

    public int[] getTableContainerOffsetY() {
        return tableContainerOffsetY;
    }

    public void setTableContainerOffsetY(int[] tableContainerOffsetY) {
        this.tableContainerOffsetY = tableContainerOffsetY;
    }

    public int[] getTableHeaderOffsetY() {
        return tableHeaderOffsetY;
    }

    public void setTableHeaderOffsetY(int[] tableHeaderOffsetY) {
        this.tableHeaderOffsetY = tableHeaderOffsetY;
    }

    public int[] getTableColumnOffsetX() {
        return tableColumnOffsetX;
    }

    public void setTableColumnOffsetX(int[] tableColumnOffsetX) {
        this.tableColumnOffsetX = tableColumnOffsetX;
    }

    public int[] getTableDataOffsetY() {
        return tableDataOffsetY;
    }

    public void setTableDataOffsetY(int[] tableDataOffsetY) {
        this.tableDataOffsetY = tableDataOffsetY;
    }

    public boolean[] getTableEnable() {
        return tableEnable;
    }

    public void setTableEnable(boolean[] tableEnable) {
        this.tableEnable = tableEnable;
    }

    public ColorsToJEasyPdf getTableBorderColor() {
        return tableBorderColor;
    }

    public void setTableBorderColor(ColorsToJEasyPdf tableBorderColor) {
        this.tableBorderColor = tableBorderColor;
    }

    public ColorsToJEasyPdf getTableHeaderColor() {
        return tableHeaderColor;
    }

    public void setTableHeaderColor(ColorsToJEasyPdf tableHeaderColor) {
        this.tableHeaderColor = tableHeaderColor;
    }

    public ColorsToJEasyPdf getTableBodyColor() {
        return tableBodyColor;
    }

    public void setTableBodyColor(ColorsToJEasyPdf tableBodyColor) {
        this.tableBodyColor = tableBodyColor;
    }

    public ColorsToJEasyPdf getTableHeaderFontColor() {
        return tableHeaderFontColor;
    }

    public void setTableHeaderFontColor(ColorsToJEasyPdf tableHeaderFontColor) {
        this.tableHeaderFontColor = tableHeaderFontColor;
    }

    public ColorsToJEasyPdf getTableBodyFontColor() {
        return tableBodyFontColor;
    }

    public void setTableBodyFontColor(ColorsToJEasyPdf tableBodyFontColor) {
        this.tableBodyFontColor = tableBodyFontColor;
    }

    public FontSizeToJEasyPdf getTableHeaderFontSize() {
        return tableHeaderFontSize;
    }

    public void setTableHeaderFontSize(FontSizeToJEasyPdf tableHeaderFontSize) {
        this.tableHeaderFontSize = tableHeaderFontSize;
    }

    public FontSizeToJEasyPdf getTableBodyFontSize() {
        return tableBodyFontSize;
    }

    public void setTableBodyFontSize(FontSizeToJEasyPdf tableBodyFontSize) {
        this.tableBodyFontSize = tableBodyFontSize;
    }

    public FontNameToJEasyPdf getTableHeaderFontName() {
        return tableHeaderFontName;
    }

    public void setTableHeaderFontName(FontNameToJEasyPdf tableHeaderFontName) {
        this.tableHeaderFontName = tableHeaderFontName;
    }

    public FontNameToJEasyPdf getTableBodyFontName() {
        return tableBodyFontName;
    }

    public void setTableBodyFontName(FontNameToJEasyPdf tableBodyFontName) {
        this.tableBodyFontName = tableBodyFontName;
    }

    public TableDimensionsToJEasyPdf getTableSize() {
        return tableSize;
    }

    public void setTableSize(TableDimensionsToJEasyPdf tableSize) {
        this.tableSize = tableSize;
    }

    public int getSignatureBoxWidth() {
        return signatureBoxWidth;
    }

    public void setSignatureBoxWidth(int signatureBoxWidth) {
        this.signatureBoxWidth = signatureBoxWidth;
    }

    public int getSignatureBoxHeight() {
        return signatureBoxHeight;
    }

    public void setSignatureBoxHeight(int signatureBoxHeight) {
        this.signatureBoxHeight = signatureBoxHeight;
    }

    public int getSignatureBoxAdjustOffsetX() {
        return signatureBoxAdjustOffsetX;
    }

    public void setSignatureBoxAdjustOffsetX(int signatureBoxAdjustOffsetX) {
        this.signatureBoxAdjustOffsetX = signatureBoxAdjustOffsetX;
    }

    public int[] getSignatureBoxOffsetX() {
        return signatureBoxOffsetX;
    }

    public void setSignatureBoxOffsetX(int[] signatureBoxOffsetX) {
        this.signatureBoxOffsetX = signatureBoxOffsetX;
    }

    public int[] getSignatureBoxOffsetY() {
        return signatureBoxOffsetY;
    }

    public void setSignatureBoxOffsetY(int[] signatureBoxOffsetY) {
        this.signatureBoxOffsetY = signatureBoxOffsetY;
    }

    public int[] getSignatureBoxDigitalTitleOffsetX() {
        return signatureBoxDigitalTitleOffsetX;
    }

    public void setSignatureBoxDigitalTitleOffsetX(int[] signatureBoxDigitalTitleOffsetX) {
        this.signatureBoxDigitalTitleOffsetX = signatureBoxDigitalTitleOffsetX;
    }

    public int[] getSignatureBoxContentOffsetX() {
        return signatureBoxContentOffsetX;
    }

    public void setSignatureBoxContentOffsetX(int[] signatureBoxContentOffsetX) {
        this.signatureBoxContentOffsetX = signatureBoxContentOffsetX;
    }

    public boolean isSignatureBoxBorderEnable() {
        return signatureBoxBorderEnable;
    }

    public void setSignatureBoxBorderEnable(boolean signatureBoxBorderEnable) {
        this.signatureBoxBorderEnable = signatureBoxBorderEnable;
    }

    public boolean isLeftSignatureBoxEnable() {
        return leftSignatureBoxEnable;
    }

    public void setLeftSignatureBoxEnable(boolean leftSignatureBoxEnable) {
        this.leftSignatureBoxEnable = leftSignatureBoxEnable;
    }

    public boolean isCenterSignatureBoxEnable() {
        return centerSignatureBoxEnable;
    }

    public void setCenterSignatureBoxEnable(boolean centerSignatureBoxEnable) {
        this.centerSignatureBoxEnable = centerSignatureBoxEnable;
    }

    public boolean isRightSignatureBoxEnable() {
        return rightSignatureBoxEnable;
    }

    public void setRightSignatureBoxEnable(boolean rightSignatureBoxEnable) {
        this.rightSignatureBoxEnable = rightSignatureBoxEnable;
    }

    public FontSizeToJEasyPdf getSignatureFontSize() {
        return signatureFontSize;
    }

    public void setSignatureFontSize(FontSizeToJEasyPdf signatureFontSize) {
        this.signatureFontSize = signatureFontSize;
    }

    public FontNameToJEasyPdf getSignatureFontName() {
        return signatureFontName;
    }

    public void setSignatureFontName(FontNameToJEasyPdf signatureFontName) {
        this.signatureFontName = signatureFontName;
    }

    public ColorsToJEasyPdf getSignatureBoxColor() {
        return signatureBoxColor;
    }

    public void setSignatureBoxColor(ColorsToJEasyPdf signatureBoxColor) {
        this.signatureBoxColor = signatureBoxColor;
    }

    public int getSignatureTapeWidth() {
        return signatureTapeWidth;
    }

    public void setSignatureTapeWidth(int signatureTapeWidth) {
        this.signatureTapeWidth = signatureTapeWidth;
    }

    public int getSignatureTapeHeight() {
        return signatureTapeHeight;
    }

    public void setSignatureTapeHeight(int signatureTapeHeight) {
        this.signatureTapeHeight = signatureTapeHeight;
    }

    public int getSignatureTapeOffsetX() {
        return signatureTapeOffsetX;
    }

    public void setSignatureTapeOffsetX(int signatureTapeOffsetX) {
        this.signatureTapeOffsetX = signatureTapeOffsetX;
    }

    public int getSignatureTapeOffsetY() {
        return signatureTapeOffsetY;
    }

    public void setSignatureTapeOffsetY(int signatureTapeOffsetY) {
        this.signatureTapeOffsetY = signatureTapeOffsetY;
    }

    public int getSignatureTapeTitleOffsetX() {
        return signatureTapeTitleOffsetX;
    }

    public void setSignatureTapeTitleOffsetX(int signatureTapeTitleOffsetX) {
        this.signatureTapeTitleOffsetX = signatureTapeTitleOffsetX;
    }

    public int getSignatureTapeTitleOffsetY() {
        return signatureTapeTitleOffsetY;
    }

    public void setSignatureTapeTitleOffsetY(int signatureTapeTitleOffsetY) {
        this.signatureTapeTitleOffsetY = signatureTapeTitleOffsetY;
    }

    public int getSignatureTapeValueOffsetX() {
        return signatureTapeValueOffsetX;
    }

    public void setSignatureTapeValueOffsetX(int signatureTapeValueOffsetX) {
        this.signatureTapeValueOffsetX = signatureTapeValueOffsetX;
    }

    public int getSignatureTapeValueOffsetY() {
        return signatureTapeValueOffsetY;
    }

    public void setSignatureTapeValueOffsetY(int signatureTapeValueOffsetY) {
        this.signatureTapeValueOffsetY = signatureTapeValueOffsetY;
    }

    public int getSignatureTapeAdjustOffsetX() {
        return signatureTapeAdjustOffsetX;
    }

    public void setSignatureTapeAdjustOffsetX(int signatureTapeAdjustOffsetX) {
        this.signatureTapeAdjustOffsetX = signatureTapeAdjustOffsetX;
    }

    public boolean isSignatureTapeEnable() {
        return signatureTapeEnable;
    }

    public void setSignatureTapeEnable(boolean signatureTapeEnable) {
        this.signatureTapeEnable = signatureTapeEnable;
    }

    public FontSizeToJEasyPdf getSignatureTapeFontSize() {
        return signatureTapeFontSize;
    }

    public void setSignatureTapeFontSize(FontSizeToJEasyPdf signatureTapeFontSize) {
        this.signatureTapeFontSize = signatureTapeFontSize;
    }

    public FontNameToJEasyPdf getSignatureTapeFontName() {
        return signatureTapeFontName;
    }

    public void setSignatureTapeFontName(FontNameToJEasyPdf signatureTapeFontName) {
        this.signatureTapeFontName = signatureTapeFontName;
    }

    public ColorsToJEasyPdf getSignatureTapeColor() {
        return signatureTapeColor;
    }

    public void setSignatureTapeColor(ColorsToJEasyPdf signatureTapeColor) {
        this.signatureTapeColor = signatureTapeColor;
    }

    public int getLineHeight() {
        return lineHeight;
    }

    public void setLineHeight(int lineHeight) {
        this.lineHeight = lineHeight;
    }

    public int getTextOffsetX() {
        return textOffsetX;
    }

    public void setTextOffsetX(int textOffsetX) {
        this.textOffsetX = textOffsetX;
    }

    public int getTextChars() {
        return textChars;
    }

    public void setTextChars(int textChars) {
        this.textChars = textChars;
    }

    public int[] getTextOffsetY() {
        return textOffsetY;
    }

    public void setTextOffsetY(int[] textOffsetY) {
        this.textOffsetY = textOffsetY;
    }

    public boolean[] getTextEnable() {
        return textEnable;
    }

    public void setTextEnable(boolean[] textEnable) {
        this.textEnable = textEnable;
    }

    public ColorsToJEasyPdf getTextColor() {
        return textColor;
    }

    public void setTextColor(ColorsToJEasyPdf textColor) {
        this.textColor = textColor;
    }

    public FontSizeToJEasyPdf getTextSize() {
        return textSize;
    }

    public void setTextSize(FontSizeToJEasyPdf textSize) {
        this.textSize = textSize;
    }

    public FontNameToJEasyPdf getTextFont() {
        return textFont;
    }

    public void setTextFont(FontNameToJEasyPdf textFont) {
        this.textFont = textFont;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public int getImageAdjustOffsetX() {
        return imageAdjustOffsetX;
    }

    public void setImageAdjustOffsetX(int imageAdjustOffsetX) {
        this.imageAdjustOffsetX = imageAdjustOffsetX;
    }

    public int getImageAdjustOffsetY() {
        return imageAdjustOffsetY;
    }

    public void setImageAdjustOffsetY(int imageAdjustOffsetY) {
        this.imageAdjustOffsetY = imageAdjustOffsetY;
    }

    public int[] getImageOffsetX() {
        return imageOffsetX;
    }

    public void setImageOffsetX(int[] imageOffsetX) {
        this.imageOffsetX = imageOffsetX;
    }

    public int[] getImageOffsetY() {
        return imageOffsetY;
    }

    public void setImageOffsetY(int[] imageOffsetY) {
        this.imageOffsetY = imageOffsetY;
    }

    public boolean[] getLeftImageEnable() {
        return leftImageEnable;
    }

    public void setLeftImageEnable(boolean[] leftImageEnable) {
        this.leftImageEnable = leftImageEnable;
    }

    public boolean[] getCenterImageEnable() {
        return centerImageEnable;
    }

    public void setCenterImageEnable(boolean[] centerImageEnable) {
        this.centerImageEnable = centerImageEnable;
    }

    public boolean[] getRightImageEnable() {
        return rightImageEnable;
    }

    public void setRightImageEnable(boolean[] rightImageEnable) {
        this.rightImageEnable = rightImageEnable;
    }

    public int getBarcodeDpi() {
        return barcodeDpi;
    }

    public void setBarcodeDpi(int barcodeDpi) {
        this.barcodeDpi = barcodeDpi;
    }

    public int getBarcodeWidth() {
        return barcodeWidth;
    }

    public void setBarcodeWidth(int barcodeWidth) {
        this.barcodeWidth = barcodeWidth;
    }

    public int getBarcodeHeight() {
        return barcodeHeight;
    }

    public void setBarcodeHeight(int barcodeHeight) {
        this.barcodeHeight = barcodeHeight;
    }

    public int getBarcodeAdjustOffsetX() {
        return barcodeAdjustOffsetX;
    }

    public void setBarcodeAdjustOffsetX(int barcodeAdjustOffsetX) {
        this.barcodeAdjustOffsetX = barcodeAdjustOffsetX;
    }

    public int getBarcodeAdjustOffsetY() {
        return barcodeAdjustOffsetY;
    }

    public void setBarcodeAdjustOffsetY(int barcodeAdjustOffsetY) {
        this.barcodeAdjustOffsetY = barcodeAdjustOffsetY;
    }

    public int[] getBarcodeOffsetY() {
        return barcodeOffsetY;
    }

    public void setBarcodeOffsetY(int[] barcodeOffsetY) {
        this.barcodeOffsetY = barcodeOffsetY;
    }

    public int[] getBarcodeInfoOffsetY() {
        return barcodeInfoOffsetY;
    }

    public void setBarcodeInfoOffsetY(int[] barcodeInfoOffsetY) {
        this.barcodeInfoOffsetY = barcodeInfoOffsetY;
    }

    public int[] getBarcodeValueOffsetY() {
        return barcodeValueOffsetY;
    }

    public void setBarcodeValueOffsetY(int[] barcodeValueOffsetY) {
        this.barcodeValueOffsetY = barcodeValueOffsetY;
    }

    public int[] getBarcodeAmountOffsetY() {
        return barcodeAmountOffsetY;
    }

    public void setBarcodeAmountOffsetY(int[] barcodeAmountOffsetY) {
        this.barcodeAmountOffsetY = barcodeAmountOffsetY;
    }

    public boolean isBarcodeShowText() {
        return barcodeShowText;
    }

    public void setBarcodeShowText(boolean barcodeShowText) {
        this.barcodeShowText = barcodeShowText;
    }

    public boolean[] getBarcodeEnabled() {
        return barcodeEnabled;
    }

    public void setBarcodeEnabled(boolean[] barcodeEnabled) {
        this.barcodeEnabled = barcodeEnabled;
    }

    public int getQrCodeDpi() {
        return qrCodeDpi;
    }

    public void setQrCodeDpi(int qrCodeDpi) {
        this.qrCodeDpi = qrCodeDpi;
    }

    public int getQrCodeWidth() {
        return qrCodeWidth;
    }

    public void setQrCodeWidth(int qrCodeWidth) {
        this.qrCodeWidth = qrCodeWidth;
    }

    public int getQrCodeHeight() {
        return qrCodeHeight;
    }

    public void setQrCodeHeight(int qrCodeHeight) {
        this.qrCodeHeight = qrCodeHeight;
    }

    public int getQrCodeAdjustOffsetX() {
        return qrCodeAdjustOffsetX;
    }

    public void setQrCodeAdjustOffsetX(int qrCodeAdjustOffsetX) {
        this.qrCodeAdjustOffsetX = qrCodeAdjustOffsetX;
    }

    public int getQrCodeAdjustOffsetY() {
        return qrCodeAdjustOffsetY;
    }

    public void setQrCodeAdjustOffsetY(int qrCodeAdjustOffsetY) {
        this.qrCodeAdjustOffsetY = qrCodeAdjustOffsetY;
    }

    public int[] getQrCodeOffsetX() {
        return qrCodeOffsetX;
    }

    public void setQrCodeOffsetX(int[] qrCodeOffsetX) {
        this.qrCodeOffsetX = qrCodeOffsetX;
    }

    public int[] getQrCodeOffsetY() {
        return qrCodeOffsetY;
    }

    public void setQrCodeOffsetY(int[] qrCodeOffsetY) {
        this.qrCodeOffsetY = qrCodeOffsetY;
    }

    public int[] getQrCodeInfoOffsetX() {
        return qrCodeInfoOffsetX;
    }

    public void setQrCodeInfoOffsetX(int[] qrCodeInfoOffsetX) {
        this.qrCodeInfoOffsetX = qrCodeInfoOffsetX;
    }

    public int[] getQrCodeInfoOffsetY() {
        return qrCodeInfoOffsetY;
    }

    public void setQrCodeInfoOffsetY(int[] qrCodeInfoOffsetY) {
        this.qrCodeInfoOffsetY = qrCodeInfoOffsetY;
    }

    public boolean[] getQrCodeLeftEnable() {
        return qrCodeLeftEnable;
    }

    public void setQrCodeLeftEnable(boolean[] qrCodeLeftEnable) {
        this.qrCodeLeftEnable = qrCodeLeftEnable;
    }

    public boolean[] getQrCodeCenterEnable() {
        return qrCodeCenterEnable;
    }

    public void setQrCodeCenterEnable(boolean[] qrCodeCenterEnable) {
        this.qrCodeCenterEnable = qrCodeCenterEnable;
    }

    public boolean[] getQrCodeRightEnable() {
        return qrCodeRightEnable;
    }

    public void setQrCodeRightEnable(boolean[] qrCodeRightEnable) {
        this.qrCodeRightEnable = qrCodeRightEnable;
    }
}

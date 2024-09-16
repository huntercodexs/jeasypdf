package com.huntercodexs.jeasypdf.core.dto;

import com.huntercodexs.jeasypdf.core.enumerator.CodeType4ScannerToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.FontNameToJEasyPdf;
import org.krysalis.barcode4j.HumanReadablePlacement;

public class JEasyPdfBarcode {

    private int dpi = 400;
    private int width = 370;
    private int height = 40;
    private int fontSize = 2;
    private int lineHeight = 20;
    private int margin = 0;
    private int orientation = 0;
    private float offsetX = 0;
    private float offsetY = 400;
    private double fixQuiteZone = 0;
    private boolean doQuiteZone = false;
    private String data = "00000.00000 00000.000000 00000.00000 0 00000000000000";
    private String infoOne = "";
    private String infoThree = "";
    private String infoFour = "";
    private FontNameToJEasyPdf fontName = FontNameToJEasyPdf.COURIER;
    private HumanReadablePlacement textPosition = HumanReadablePlacement.HRP_NONE;
    private CodeType4ScannerToJEasyPdf codeType4Scanner;

    public JEasyPdfBarcode() {
    }

    public JEasyPdfBarcode(
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
            String infoOne,
            String infoThree,
            String infoFour,
            FontNameToJEasyPdf fontName,
            HumanReadablePlacement textPosition,
            CodeType4ScannerToJEasyPdf codeType4Scanner
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
        this.infoOne = infoOne;
        this.infoThree = infoThree;
        this.infoFour = infoFour;
        this.fontName = fontName;
        this.textPosition = textPosition;
        this.codeType4Scanner = codeType4Scanner;
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

    public String getInfoOne() {
        return infoOne;
    }

    public void setInfoOne(String infoOne) {
        this.infoOne = infoOne;
    }

    public String getInfoThree() {
        return infoThree;
    }

    public void setInfoThree(String infoThree) {
        this.infoThree = infoThree;
    }

    public String getInfoFour() {
        return infoFour;
    }

    public void setInfoFour(String infoFour) {
        this.infoFour = infoFour;
    }

    public FontNameToJEasyPdf getFontName() {
        return fontName;
    }

    public void setFontName(FontNameToJEasyPdf fontName) {
        this.fontName = fontName;
    }

    public HumanReadablePlacement getTextPosition() {
        return textPosition;
    }

    public void setTextPosition(HumanReadablePlacement textPosition) {
        this.textPosition = textPosition;
    }

    public CodeType4ScannerToJEasyPdf getCodeType4Scanner() {
        return codeType4Scanner;
    }

    public void setCodeType4Scanner(CodeType4ScannerToJEasyPdf codeType4Scanner) {
        this.codeType4Scanner = codeType4Scanner;
    }
}

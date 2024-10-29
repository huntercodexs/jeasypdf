package com.huntercodexs.jeasypdf.core.dto;

import com.huntercodexs.jeasypdf.core.enumerator.ColorsToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.FontNameToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.FontSizeToJEasyPdf;

public class JEasyPdfText {

    private int width;
    private int height;
    private int offsetX;
    private int offsetY;
    private int lineHeight;
    private int letterSpace;
    private boolean bold = false;
    private boolean italic = false;
    private boolean underline = false;
    private FontNameToJEasyPdf fontName;
    private FontSizeToJEasyPdf fontSize;
    private ColorsToJEasyPdf fontColor;

    public JEasyPdfText() {
    }

    public JEasyPdfText(
            int width,
            int height,
            int offsetX,
            int offsetY,
            int lineHeight,
            int letterSpace,
            boolean bold,
            boolean italic,
            boolean underline,
            FontNameToJEasyPdf fontName,
            FontSizeToJEasyPdf fontSize,
            ColorsToJEasyPdf fontColor
    ) {
        this.width = width;
        this.height = height;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.lineHeight = lineHeight;
        this.letterSpace = letterSpace;
        this.bold = bold;
        this.italic = italic;
        this.underline = underline;
        this.fontName = fontName;
        this.fontSize = fontSize;
        this.fontColor = fontColor;
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

    public int getLineHeight() {
        return lineHeight;
    }

    public void setLineHeight(int lineHeight) {
        this.lineHeight = lineHeight;
    }

    public int getLetterSpace() {
        return letterSpace;
    }

    public void setLetterSpace(int letterSpace) {
        this.letterSpace = letterSpace;
    }

    public boolean isBold() {
        return bold;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public boolean isItalic() {
        return italic;
    }

    public void setItalic(boolean italic) {
        this.italic = italic;
    }

    public boolean isUnderline() {
        return underline;
    }

    public void setUnderline(boolean underline) {
        this.underline = underline;
    }

    public FontNameToJEasyPdf getFontName() {
        return fontName;
    }

    public void setFontName(FontNameToJEasyPdf fontName) {
        this.fontName = fontName;
    }

    public FontSizeToJEasyPdf getFontSize() {
        return fontSize;
    }

    public void setFontSize(FontSizeToJEasyPdf fontSize) {
        this.fontSize = fontSize;
    }

    public ColorsToJEasyPdf getFontColor() {
        return fontColor;
    }

    public void setFontColor(ColorsToJEasyPdf fontColor) {
        this.fontColor = fontColor;
    }
}


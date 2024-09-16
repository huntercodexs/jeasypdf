package com.huntercodexs.jeasypdf.core.enumerator;

public enum QrCodeBorderStyleToJEasyPdf {
    BORDERED("BORDERED"),
    BORDERLESS("BORDERLESS"),
    LEFT_BORDERED("LEFT_BORDERED");

    private final String borderStyle;

    QrCodeBorderStyleToJEasyPdf(String borderStyle) {
        this.borderStyle = borderStyle;
    }

    public String getBorderStyle() {
        return borderStyle;
    }

    public static String qrCodeBorderStyle(QrCodeBorderStyleToJEasyPdf borderStyle) {
        return borderStyle.getBorderStyle();
    }
}

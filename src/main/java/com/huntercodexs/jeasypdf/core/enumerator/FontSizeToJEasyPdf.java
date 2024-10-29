package com.huntercodexs.jeasypdf.core.enumerator;

public enum FontSizeToJEasyPdf {
    X_SMALL(5),
    M_SMALL(7),
    SMALL(8),
    NORMAL(12),
    PLUS(14),
    MEDIUM(16),
    X_MEDIUM(20),
    LARGE(24),
    X_LARGE(45);

    private final int fontSize;

    FontSizeToJEasyPdf(int fontSize) {
        this.fontSize = fontSize;
    }

    public int getFontSize() {
        return fontSize;
    }

    public static int fontSize(FontSizeToJEasyPdf fontSize) {
        return fontSize.getFontSize();
    }
}

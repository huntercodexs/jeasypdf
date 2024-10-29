package com.huntercodexs.jeasypdf.core.enumerator;

public enum ProtectionLevelToJEasyPdf {
    LOW(64),
    MIDDLE(128),
    HIGH(256);

    private final int protectionLevel;

    ProtectionLevelToJEasyPdf(int protectionLevel) {
        this.protectionLevel = protectionLevel;
    }

    public int getProtectionLevel() {
        return protectionLevel;
    }

    public static int protectionLevel(ProtectionLevelToJEasyPdf protectionLevel) {
        return protectionLevel.getProtectionLevel();
    }
}

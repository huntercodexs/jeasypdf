package com.huntercodexs.jeasypdf.core.enumerator;

public enum CodeType4ScannerToJEasyPdf {
    CODE128("CODE128"),
    CODE39("CODE39"),
    PDF417("PDF417"),
    QRCODE("QRCODE");

    private final String codeType4Scanner;

    CodeType4ScannerToJEasyPdf(String codeType) {
        this.codeType4Scanner = codeType;
    }

    public String getCodeType4Scanner() {
        return codeType4Scanner;
    }

    public static String codeType4Scanner(CodeType4ScannerToJEasyPdf codeType) {
        return codeType.getCodeType4Scanner();
    }
}

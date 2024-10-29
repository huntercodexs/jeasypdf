package com.huntercodexs.jeasypdf.barcode.setting;

public class BarcodeScanner {
    private int page;
    private String barcodeType;
    private String barcodeValue;

    public BarcodeScanner() {
    }

    public BarcodeScanner(int page, String barcodeType, String barcodeValue) {
        this.page = page;
        this.barcodeType = barcodeType;
        this.barcodeValue = barcodeValue;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getBarcodeType() {
        return barcodeType;
    }

    public void setBarcodeType(String barcodeType) {
        this.barcodeType = barcodeType;
    }

    public String getBarcodeValue() {
        return barcodeValue;
    }

    public void setBarcodeValue(String barcodeValue) {
        this.barcodeValue = barcodeValue;
    }
}

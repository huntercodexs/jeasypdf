package com.huntercodexs.jeasypdf.template.setting.slim;

import java.util.HashMap;
import java.util.List;

public class SlimDataContent {
    //Title
    public String leftTitleContent = "";
    public String centerTitleContent = "";
    public String rightTitleContent = "";

    //Column
    public HashMap<Integer, String> columnContent = new HashMap<>();

    //Table
    public HashMap<Integer, List<String>> tableHeaderContent = new HashMap<>();
    public HashMap<Integer, List<String>> tableBodyContent = new HashMap<>();

    //Signature
    public String signaturePersonName = "";
    public String signaturePersonDoc = "";
    public String signatureRecord = "";
    public String signatureDateGmt = "";
    public String signatureStampMark = "";

    //Text
    public HashMap<Integer, String> textContent = new HashMap<>();

    //Image
    public String[] leftImagePaths = new String[]{null,null,null,null,null};
    public String[] centerImagePaths = new String[]{null,null,null,null,null};
    public String[] rightImagePaths = new String[]{null,null,null,null,null};

    //Barcode
    public HashMap<Integer, String>  barcodeValue = new HashMap<>();
    public HashMap<Integer, String>  barcodeInfoOne = new HashMap<>();
    public HashMap<Integer, String>  barcodeInfoTwo = new HashMap<>();
    public HashMap<Integer, String>  barcodeInfoThree = new HashMap<>();
    public HashMap<Integer, String>  barcodeInfoFour = new HashMap<>();
    public HashMap<Integer, String>  barcodeAmount = new HashMap<>();

    //QrCode
    public HashMap<Integer, String>  qrCodeValue = new HashMap<>();
    public HashMap<Integer, String> qrCodeInfoOne = new HashMap<>();
    public HashMap<Integer, String>  qrCodeInfoTwo = new HashMap<>();
    public HashMap<Integer, String>  qrCodeInfoThree = new HashMap<>();
    public HashMap<Integer, String>  qrCodeInfoFour = new HashMap<>();
    public HashMap<Integer, String>  qrCodeAmount = new HashMap<>();

    public String getLeftTitleContent() {
        return leftTitleContent;
    }

    public void setLeftTitleContent(String leftTitleContent) {
        this.leftTitleContent = leftTitleContent;
    }

    public String getCenterTitleContent() {
        return centerTitleContent;
    }

    public void setCenterTitleContent(String centerTitleContent) {
        this.centerTitleContent = centerTitleContent;
    }

    public String getRightTitleContent() {
        return rightTitleContent;
    }

    public void setRightTitleContent(String rightTitleContent) {
        this.rightTitleContent = rightTitleContent;
    }

    public HashMap<Integer, String> getColumnContent() {
        return columnContent;
    }

    public void setColumnContent(HashMap<Integer, String> columnContent) {
        this.columnContent = columnContent;
    }

    public HashMap<Integer, List<String>> getTableHeaderContent() {
        return tableHeaderContent;
    }

    public void setTableHeaderContent(HashMap<Integer, List<String>> tableHeaderContent) {
        this.tableHeaderContent = tableHeaderContent;
    }

    public HashMap<Integer, List<String>> getTableBodyContent() {
        return tableBodyContent;
    }

    public void setTableBodyContent(HashMap<Integer, List<String>> tableBodyContent) {
        this.tableBodyContent = tableBodyContent;
    }

    public String getSignaturePersonName() {
        return signaturePersonName;
    }

    public void setSignaturePersonName(String signaturePersonName) {
        this.signaturePersonName = signaturePersonName;
    }

    public String getSignaturePersonDoc() {
        return signaturePersonDoc;
    }

    public void setSignaturePersonDoc(String signaturePersonDoc) {
        this.signaturePersonDoc = signaturePersonDoc;
    }

    public String getSignatureRecord() {
        return signatureRecord;
    }

    public void setSignatureRecord(String signatureRecord) {
        this.signatureRecord = signatureRecord;
    }

    public String getSignatureDateGmt() {
        return signatureDateGmt;
    }

    public void setSignatureDateGmt(String signatureDateGmt) {
        this.signatureDateGmt = signatureDateGmt;
    }

    public String getSignatureStampMark() {
        return signatureStampMark;
    }

    public void setSignatureStampMark(String signatureStampMark) {
        this.signatureStampMark = signatureStampMark;
    }

    public HashMap<Integer, String> getTextContent() {
        return textContent;
    }

    public void setTextContent(HashMap<Integer, String> textContent) {
        this.textContent = textContent;
    }

    public String[] getLeftImagePaths() {
        return leftImagePaths;
    }

    public void setLeftImagePaths(String[] leftImagePaths) {
        this.leftImagePaths = leftImagePaths;
    }

    public String[] getCenterImagePaths() {
        return centerImagePaths;
    }

    public void setCenterImagePaths(String[] centerImagePaths) {
        this.centerImagePaths = centerImagePaths;
    }

    public String[] getRightImagePaths() {
        return rightImagePaths;
    }

    public void setRightImagePaths(String[] rightImagePaths) {
        this.rightImagePaths = rightImagePaths;
    }

    public HashMap<Integer, String> getBarcodeValue() {
        return barcodeValue;
    }

    public void setBarcodeValue(HashMap<Integer, String> barcodeValue) {
        this.barcodeValue = barcodeValue;
    }

    public HashMap<Integer, String> getBarcodeInfoOne() {
        return barcodeInfoOne;
    }

    public void setBarcodeInfoOne(HashMap<Integer, String> barcodeInfoOne) {
        this.barcodeInfoOne = barcodeInfoOne;
    }

    public HashMap<Integer, String> getBarcodeInfoTwo() {
        return barcodeInfoTwo;
    }

    public void setBarcodeInfoTwo(HashMap<Integer, String> barcodeInfoTwo) {
        this.barcodeInfoTwo = barcodeInfoTwo;
    }

    public HashMap<Integer, String> getBarcodeInfoThree() {
        return barcodeInfoThree;
    }

    public void setBarcodeInfoThree(HashMap<Integer, String> barcodeInfoThree) {
        this.barcodeInfoThree = barcodeInfoThree;
    }

    public HashMap<Integer, String> getBarcodeInfoFour() {
        return barcodeInfoFour;
    }

    public void setBarcodeInfoFour(HashMap<Integer, String> barcodeInfoFour) {
        this.barcodeInfoFour = barcodeInfoFour;
    }

    public HashMap<Integer, String> getBarcodeAmount() {
        return barcodeAmount;
    }

    public void setBarcodeAmount(HashMap<Integer, String> barcodeAmount) {
        this.barcodeAmount = barcodeAmount;
    }

    public HashMap<Integer, String> getQrCodeValue() {
        return qrCodeValue;
    }

    public void setQrCodeValue(HashMap<Integer, String> qrCodeValue) {
        this.qrCodeValue = qrCodeValue;
    }

    public HashMap<Integer, String> getQrCodeInfoOne() {
        return qrCodeInfoOne;
    }

    public void setQrCodeInfoOne(HashMap<Integer, String> qrCodeInfoOne) {
        this.qrCodeInfoOne = qrCodeInfoOne;
    }

    public HashMap<Integer, String> getQrCodeInfoTwo() {
        return qrCodeInfoTwo;
    }

    public void setQrCodeInfoTwo(HashMap<Integer, String> qrCodeInfoTwo) {
        this.qrCodeInfoTwo = qrCodeInfoTwo;
    }

    public HashMap<Integer, String> getQrCodeInfoThree() {
        return qrCodeInfoThree;
    }

    public void setQrCodeInfoThree(HashMap<Integer, String> qrCodeInfoThree) {
        this.qrCodeInfoThree = qrCodeInfoThree;
    }

    public HashMap<Integer, String> getQrCodeInfoFour() {
        return qrCodeInfoFour;
    }

    public void setQrCodeInfoFour(HashMap<Integer, String> qrCodeInfoFour) {
        this.qrCodeInfoFour = qrCodeInfoFour;
    }

    public HashMap<Integer, String> getQrCodeAmount() {
        return qrCodeAmount;
    }

    public void setQrCodeAmount(HashMap<Integer, String> qrCodeAmount) {
        this.qrCodeAmount = qrCodeAmount;
    }
}

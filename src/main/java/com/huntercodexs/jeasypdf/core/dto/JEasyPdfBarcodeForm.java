package com.huntercodexs.jeasypdf.core.dto;

import com.huntercodexs.jeasypdf.core.enumerator.ColorsToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.QrCodeBorderStyleToJEasyPdf;

public class JEasyPdfBarcodeForm {

    private int width;
    private int height;
    private int offsetX;
    private int offsetY;
    private int borderWidth = 1;
    private int adjustOffsetX = 0;
    private int adjustOffsetY = 0;
    private boolean border = true;
    private boolean qrcode = true;
    private boolean revealFields = false;
    private ColorsToJEasyPdf headerColor;
    private ColorsToJEasyPdf celColor;
    private ColorsToJEasyPdf borderColor;
    private JEasyPdfBarcode barcode = new JEasyPdfBarcode();
    private JEasyPdfBarcodeFormFields fields = new JEasyPdfBarcodeFormFields();
    private JEasyPdfBarcodeFormData data = new JEasyPdfBarcodeFormData();
    private QrCodeBorderStyleToJEasyPdf borderStyle = QrCodeBorderStyleToJEasyPdf.BORDERED;

    public JEasyPdfBarcodeForm() {
    }

    public JEasyPdfBarcodeForm(
            int width,
            int height,
            int offsetX,
            int offsetY,
            int borderWidth,
            int adjustOffsetX,
            int adjustOffsetY,
            boolean border,
            boolean qrcode,
            boolean revealFields,
            ColorsToJEasyPdf headerColor,
            ColorsToJEasyPdf celColor,
            ColorsToJEasyPdf borderColor,
            JEasyPdfBarcode barcode,
            JEasyPdfBarcodeFormFields fields,
            JEasyPdfBarcodeFormData data,
            QrCodeBorderStyleToJEasyPdf borderStyle
    ) {
        this.width = width;
        this.height = height;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.borderWidth = borderWidth;
        this.adjustOffsetX = adjustOffsetX;
        this.adjustOffsetY = adjustOffsetY;
        this.border = border;
        this.qrcode = qrcode;
        this.revealFields = revealFields;
        this.headerColor = headerColor;
        this.celColor = celColor;
        this.borderColor = borderColor;
        this.barcode = barcode;
        this.fields = fields;
        this.data = data;
        this.borderStyle = borderStyle;
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

    public int getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public int getAdjustOffsetX() {
        return adjustOffsetX;
    }

    public void setAdjustOffsetX(int adjustOffsetX) {
        this.adjustOffsetX = adjustOffsetX;
    }

    public int getAdjustOffsetY() {
        return adjustOffsetY;
    }

    public void setAdjustOffsetY(int adjustOffsetY) {
        this.adjustOffsetY = adjustOffsetY;
    }

    public boolean isBorder() {
        return border;
    }

    public void setBorder(boolean border) {
        this.border = border;
    }

    public boolean isQrcode() {
        return qrcode;
    }

    public void setQrcode(boolean qrcode) {
        this.qrcode = qrcode;
    }

    public boolean isRevealFields() {
        return revealFields;
    }

    public void setRevealFields(boolean revealFields) {
        this.revealFields = revealFields;
    }

    public ColorsToJEasyPdf getHeaderColor() {
        return headerColor;
    }

    public void setHeaderColor(ColorsToJEasyPdf headerColor) {
        this.headerColor = headerColor;
    }

    public ColorsToJEasyPdf getCelColor() {
        return celColor;
    }

    public void setCelColor(ColorsToJEasyPdf celColor) {
        this.celColor = celColor;
    }

    public ColorsToJEasyPdf getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(ColorsToJEasyPdf borderColor) {
        this.borderColor = borderColor;
    }

    public JEasyPdfBarcode getBarcode() {
        return barcode;
    }

    public void setBarcode(JEasyPdfBarcode barcode) {
        this.barcode = barcode;
    }

    public JEasyPdfBarcodeFormFields getFields() {
        return fields;
    }

    public void setFields(JEasyPdfBarcodeFormFields fields) {
        this.fields = fields;
    }

    public JEasyPdfBarcodeFormData getData() {
        return data;
    }

    public void setData(JEasyPdfBarcodeFormData data) {
        this.data = data;
    }

    public QrCodeBorderStyleToJEasyPdf getBorderStyle() {
        return borderStyle;
    }

    public void setBorderStyle(QrCodeBorderStyleToJEasyPdf borderStyle) {
        this.borderStyle = borderStyle;
    }
}

package com.huntercodexs.jeasy;

import com.huntercodexs.jeasypdf.core.enumerator.*;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static com.huntercodexs.jeasypdf.core.enumerator.CodeType4ScannerToJEasyPdf.codeType4Scanner;
import static com.huntercodexs.jeasypdf.core.enumerator.ColorsToJEasyPdf.color;
import static com.huntercodexs.jeasypdf.core.enumerator.FontNameToJEasyPdf.fontName;
import static com.huntercodexs.jeasypdf.core.enumerator.FontSizeToJEasyPdf.fontSize;
import static com.huntercodexs.jeasypdf.core.enumerator.ImageQualityToJEasyPdf.imageQuality;
import static com.huntercodexs.jeasypdf.core.enumerator.ImageTypeToJEasyPdf.imageType;
import static com.huntercodexs.jeasypdf.core.enumerator.PageSizeToJEasyPdf.pageSize;
import static com.huntercodexs.jeasypdf.core.enumerator.ProtectionLevelToJEasyPdf.protectionLevel;
import static com.huntercodexs.jeasypdf.core.enumerator.QrCodeBorderStyleToJEasyPdf.qrCodeBorderStyle;
import static com.huntercodexs.jeasypdf.core.enumerator.TableDimensionsToJEasyPdf.tableSize;

public class JEasyPdfEnumeratorsUnitaryTests {

    @Test
    public void pageSizeTest() {
        PDRectangle pageSize = pageSize(PageSizeToJEasyPdf.A0);
        Assertions.assertEquals("[0.0,0.0,2383.937,3370.3938]", String.valueOf(pageSize));

        pageSize = pageSize(PageSizeToJEasyPdf.A1);
        Assertions.assertEquals("[0.0,0.0,1683.7795,2383.937]", String.valueOf(pageSize));

        pageSize = pageSize(PageSizeToJEasyPdf.A2);
        Assertions.assertEquals("[0.0,0.0,1190.5513,1683.7795]", String.valueOf(pageSize));

        pageSize = pageSize(PageSizeToJEasyPdf.A3);
        Assertions.assertEquals("[0.0,0.0,841.8898,1190.5513]", String.valueOf(pageSize));

        pageSize = pageSize(PageSizeToJEasyPdf.A4);
        Assertions.assertEquals("[0.0,0.0,595.27563,841.8898]", String.valueOf(pageSize));

        pageSize = pageSize(PageSizeToJEasyPdf.A5);
        Assertions.assertEquals("[0.0,0.0,419.52756,595.27563]", String.valueOf(pageSize));

        pageSize = pageSize(PageSizeToJEasyPdf.A6);
        Assertions.assertEquals("[0.0,0.0,297.63782,419.52756]", String.valueOf(pageSize));

        pageSize = pageSize(PageSizeToJEasyPdf.LEGAL);
        Assertions.assertEquals("[0.0,0.0,612.0,1008.0]", String.valueOf(pageSize));

        pageSize = pageSize(PageSizeToJEasyPdf.LETTER);
        Assertions.assertEquals("[0.0,0.0,612.0,792.0]", String.valueOf(pageSize));
    }

    @Test
    public void colorTest() {

        Color color = color(ColorsToJEasyPdf.WHITE);
        Assertions.assertEquals("java.awt.Color[r=255,g=255,b=255]", String.valueOf(color));

        color = color(ColorsToJEasyPdf.RED);
        Assertions.assertEquals("java.awt.Color[r=255,g=0,b=0]", String.valueOf(color));

        color = color(ColorsToJEasyPdf.GREEN);
        Assertions.assertEquals("java.awt.Color[r=0,g=255,b=0]", String.valueOf(color));

        color = color(ColorsToJEasyPdf.GREEN_SEA);
        Assertions.assertEquals("java.awt.Color[r=26,g=188,b=156]", String.valueOf(color));

        color = color(ColorsToJEasyPdf.BLUE);
        Assertions.assertEquals("java.awt.Color[r=0,g=0,b=255]", String.valueOf(color));

        color = color(ColorsToJEasyPdf.BLUE_SEA);
        Assertions.assertEquals("java.awt.Color[r=51,g=181,b=255]", String.valueOf(color));

        color = color(ColorsToJEasyPdf.BLUE_SAD);
        Assertions.assertEquals("java.awt.Color[r=78,g=120,b=149]", String.valueOf(color));

        color = color(ColorsToJEasyPdf.BLACK);
        Assertions.assertEquals("java.awt.Color[r=0,g=0,b=0]", String.valueOf(color));

        color = color(ColorsToJEasyPdf.GRAY);
        Assertions.assertEquals("java.awt.Color[r=128,g=128,b=128]", String.valueOf(color));

        color = color(ColorsToJEasyPdf.LIGHT_GRAY);
        Assertions.assertEquals("java.awt.Color[r=192,g=192,b=192]", String.valueOf(color));

        color = color(ColorsToJEasyPdf.ICE);
        Assertions.assertEquals("java.awt.Color[r=235,g=235,b=235]", String.valueOf(color));

        color = color(ColorsToJEasyPdf.PURPLE);
        Assertions.assertEquals("java.awt.Color[r=173,g=108,b=227]", String.valueOf(color));

        color = color(ColorsToJEasyPdf.GOLD);
        Assertions.assertEquals("java.awt.Color[r=255,g=215,b=0]", String.valueOf(color));

        color = color(ColorsToJEasyPdf.PINK);
        Assertions.assertEquals("java.awt.Color[r=231,g=6,b=176]", String.valueOf(color));

        color = color(ColorsToJEasyPdf.YELLOW);
        Assertions.assertEquals("java.awt.Color[r=255,g=255,b=0]", String.valueOf(color));

        color = color(ColorsToJEasyPdf.ORANGE);
        Assertions.assertEquals("java.awt.Color[r=250,g=123,b=24]", String.valueOf(color));

        color = color(ColorsToJEasyPdf.CYAN);
        Assertions.assertEquals("java.awt.Color[r=0,g=255,b=255]", String.valueOf(color));

        color = color(ColorsToJEasyPdf.MAGENTA);
        Assertions.assertEquals("java.awt.Color[r=255,g=0,b=255]", String.valueOf(color));

    }

    @Test
    public void fontNameTest() {

        PDType1Font font = fontName(FontNameToJEasyPdf.ZAP);
        Assertions.assertEquals("PDType1Font ZapfDingbats", String.valueOf(font));

        font = fontName(FontNameToJEasyPdf.SYMBOL);
        Assertions.assertEquals("PDType1Font Symbol", String.valueOf(font));

        font = fontName(FontNameToJEasyPdf.TIMES);
        Assertions.assertEquals("PDType1Font Times-Roman", String.valueOf(font));

        font = fontName(FontNameToJEasyPdf.TIMES_B);
        Assertions.assertEquals("PDType1Font Times-Bold", String.valueOf(font));

        font = fontName(FontNameToJEasyPdf.TIMES_I);
        Assertions.assertEquals("PDType1Font Times-Italic", String.valueOf(font));

        font = fontName(FontNameToJEasyPdf.TIMES_BI);
        Assertions.assertEquals("PDType1Font Times-BoldItalic", String.valueOf(font));

        font = fontName(FontNameToJEasyPdf.COURIER);
        Assertions.assertEquals("PDType1Font Courier", String.valueOf(font));

        font = fontName(FontNameToJEasyPdf.COURIER_B);
        Assertions.assertEquals("PDType1Font Courier-Bold", String.valueOf(font));

        font = fontName(FontNameToJEasyPdf.COURIER_I);
        Assertions.assertEquals("PDType1Font Courier-Oblique", String.valueOf(font));

        font = fontName(FontNameToJEasyPdf.COURIER_BI);
        Assertions.assertEquals("PDType1Font Courier-BoldOblique", String.valueOf(font));

        font = fontName(FontNameToJEasyPdf.HELVETICA);
        Assertions.assertEquals("PDType1Font Helvetica", String.valueOf(font));

        font = fontName(FontNameToJEasyPdf.HELVETICA_B);
        Assertions.assertEquals("PDType1Font Helvetica-Bold", String.valueOf(font));

        font = fontName(FontNameToJEasyPdf.HELVETICA_I);
        Assertions.assertEquals("PDType1Font Helvetica-Oblique", String.valueOf(font));

        font = fontName(FontNameToJEasyPdf.HELVETICA_BI);
        Assertions.assertEquals("PDType1Font Helvetica-BoldOblique", String.valueOf(font));
    }

    @Test
    public void fontSizeTest() {
        int fontSize = fontSize(FontSizeToJEasyPdf.X_SMALL);
        Assertions.assertEquals(5, fontSize);

        fontSize = fontSize(FontSizeToJEasyPdf.SMALL);
        Assertions.assertEquals(8, fontSize);

        fontSize = fontSize(FontSizeToJEasyPdf.NORMAL);
        Assertions.assertEquals(12, fontSize);

        fontSize = fontSize(FontSizeToJEasyPdf.MEDIUM);
        Assertions.assertEquals(16, fontSize);

        fontSize = fontSize(FontSizeToJEasyPdf.LARGE);
        Assertions.assertEquals(24, fontSize);

        fontSize = fontSize(FontSizeToJEasyPdf.X_LARGE);
        Assertions.assertEquals(45, fontSize);
    }

    @Test
    public void protectionLevelTest() {
        int protectionLevel = protectionLevel(ProtectionLevelToJEasyPdf.LOW);
        Assertions.assertEquals(64, protectionLevel);

        protectionLevel = protectionLevel(ProtectionLevelToJEasyPdf.MIDDLE);
        Assertions.assertEquals(128, protectionLevel);

        protectionLevel = protectionLevel(ProtectionLevelToJEasyPdf.HIGH);
        Assertions.assertEquals(256, protectionLevel);
    }

    @Test
    public void imageTypeTest() {
        String imageType = imageType(ImageTypeToJEasyPdf.JPEG);
        Assertions.assertEquals("JPEG", imageType);

        imageType = imageType(ImageTypeToJEasyPdf.JPG);
        Assertions.assertEquals("JPEG", imageType);

        imageType = imageType(ImageTypeToJEasyPdf.PNG);
        Assertions.assertEquals("PNG", imageType);

        imageType = imageType(ImageTypeToJEasyPdf.GIF);
        Assertions.assertEquals("GIF", imageType);

        imageType = imageType(ImageTypeToJEasyPdf.TIFF);
        Assertions.assertEquals("TIFF", imageType);

        imageType = imageType(ImageTypeToJEasyPdf.BMP);
        Assertions.assertEquals("BMP", imageType);
    }

    @Test
    public void imageQualityTest() {
        int imageQuality = imageQuality(ImageQualityToJEasyPdf.LOW);
        Assertions.assertEquals(50, imageQuality);

        imageQuality = imageQuality(ImageQualityToJEasyPdf.NORMAL);
        Assertions.assertEquals(120, imageQuality);

        imageQuality = imageQuality(ImageQualityToJEasyPdf.GOOD);
        Assertions.assertEquals(300, imageQuality);

        imageQuality = imageQuality(ImageQualityToJEasyPdf.ULTRA);
        Assertions.assertEquals(500, imageQuality);

        imageQuality = imageQuality(ImageQualityToJEasyPdf.SUPER);
        Assertions.assertEquals(800, imageQuality);
    }

    @Test
    public void tableTemplateTest() {
        int[] tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_5X6);
        Assertions.assertEquals("5,6", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_5X5);
        Assertions.assertEquals("5,5", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_5X4);
        Assertions.assertEquals("5,4", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_5X3);
        Assertions.assertEquals("5,3", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_5X2);
        Assertions.assertEquals("5,2", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_4X6);
        Assertions.assertEquals("4,6", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_4X5);
        Assertions.assertEquals("4,5", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_4X4);
        Assertions.assertEquals("4,4", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_4X3);
        Assertions.assertEquals("4,3", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_4X2);
        Assertions.assertEquals("4,2", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_3X6);
        Assertions.assertEquals("3,6", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_3X5);
        Assertions.assertEquals("3,5", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_3X4);
        Assertions.assertEquals("3,4", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_3X3);
        Assertions.assertEquals("3,3", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_3X2);
        Assertions.assertEquals("3,2", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_2X6);
        Assertions.assertEquals("2,6", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_2X5);
        Assertions.assertEquals("2,5", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_2X4);
        Assertions.assertEquals("2,4", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_2X3);
        Assertions.assertEquals("2,3", tableTemplate[0]+","+tableTemplate[1]);

        tableTemplate = tableSize(TableDimensionsToJEasyPdf.TABLE_2X2);
        Assertions.assertEquals("2,2", tableTemplate[0]+","+tableTemplate[1]);
    }

    @Test
    public void codeType4ScannerTest() {
        String codeType4Scanner = codeType4Scanner(CodeType4ScannerToJEasyPdf.CODE128);
        Assertions.assertEquals("CODE128", codeType4Scanner);

        codeType4Scanner = codeType4Scanner(CodeType4ScannerToJEasyPdf.CODE39);
        Assertions.assertEquals("CODE39", codeType4Scanner);

        codeType4Scanner = codeType4Scanner(CodeType4ScannerToJEasyPdf.PDF417);
        Assertions.assertEquals("PDF417", codeType4Scanner);

        codeType4Scanner = codeType4Scanner(CodeType4ScannerToJEasyPdf.QRCODE);
        Assertions.assertEquals("QRCODE", codeType4Scanner);
    }

    @Test
    public void qrCodeBorderStyleTest() {
        String qrCodeBorderStyle = qrCodeBorderStyle(QrCodeBorderStyleToJEasyPdf.BORDERED);
        Assertions.assertEquals("BORDERED", qrCodeBorderStyle);

        qrCodeBorderStyle = qrCodeBorderStyle(QrCodeBorderStyleToJEasyPdf.BORDERLESS);
        Assertions.assertEquals("BORDERLESS", qrCodeBorderStyle);

        qrCodeBorderStyle = qrCodeBorderStyle(QrCodeBorderStyleToJEasyPdf.LEFT_BORDERED);
        Assertions.assertEquals("LEFT_BORDERED", qrCodeBorderStyle);
    }

}

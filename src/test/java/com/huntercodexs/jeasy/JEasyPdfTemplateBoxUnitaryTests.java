package com.huntercodexs.jeasy;

import com.huntercodexs.jeasypdf.core.dto.*;
import com.huntercodexs.jeasypdf.core.enumerator.*;
import com.huntercodexs.jeasypdf.template.JEasyPdfTemplate;
import com.huntercodexs.jeasypdf.template.setting.JEasyPdfTemplateSettings;
import com.huntercodexs.jeasypdf.template.setting.box.BoxDataContent;
import com.huntercodexs.jeasypdf.template.setting.box.BoxTemplateSettings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.krysalis.barcode4j.HumanReadablePlacement;

import static com.huntercodexs.jeasypdf.core.enumerator.JEasyPdfTemplates.template;

public class JEasyPdfTemplateBoxUnitaryTests {

    private final static String path = "./src/test/resources/files/pdf";
    private final static String pdfFilenameLetter = path+"/my-jeasypdf-test-template-box-LETTER.pdf";
    private final static String pdfFilenameLetterLayout = path+"/my-jeasypdf-test-template-box-LETTER-LAYOUT.pdf";
    private final static String pdfFilenameA4 = path+"/my-jeasypdf-test-template-box-A4.pdf";
    private final static String pdfFilenameA4Layout = path+"/my-jeasypdf-test-template-box-A4-LAYOUT.pdf";
    private final static String imgJava = "./src/test/resources/files/images/ads/java.png";
    private final static String imgBackground = "./src/test/resources/files/images/background/jeasypdf-background-sample-5.jpg";
    private final static String userPassword = "123456";
    private final static String ownerPassword = "password";

    private JEasyPdfDocument documentSettings(PageSizeToJEasyPdf pageType) {
        JEasyPdfDocument settings = new JEasyPdfDocument();
        settings.setStartPage(1);
        settings.setEndPage(1);
        settings.setNumberOfPages(1);
        settings.setDate("1990-01-01 10:00:00");
        settings.setTitle("Title Test");
        settings.setAuthor("Huntercodexs");
        settings.setSubject("Document Test");
        settings.setFontName(FontNameToJEasyPdf.COURIER);
        settings.setFontSize(FontSizeToJEasyPdf.X_SMALL);
        settings.setKeywords("test, pdf, java, huntercodexs");
        settings.setUserPassword(null); //TODO: CHECK BUG WHEN PASSWORD EXISTS
        settings.setOwnerPassword(null); //TODO: CHECK BUG WHEN PASSWORD EXISTS
        settings.setProtectionLevel(ProtectionLevelToJEasyPdf.HIGH);

        if (pageType.equals(PageSizeToJEasyPdf.LETTER)) {
            settings.setFilenamePath(pdfFilenameLetter);
        } else if (pageType.equals(PageSizeToJEasyPdf.A4)) {
            settings.setFilenamePath(pdfFilenameA4);
        } else if (pageType.equals(PageSizeToJEasyPdf.LETTER_LAYOUT)) {
            settings.setFilenamePath(pdfFilenameLetterLayout);
        } else if (pageType.equals(PageSizeToJEasyPdf.A4_LAYOUT)) {
            settings.setFilenamePath(pdfFilenameA4Layout);
        }

        return settings;
    }

    private JEasyPdfPage pageSettings(PageSizeToJEasyPdf pageType) {
        JEasyPdfPage settings = new JEasyPdfPage();
        settings.setWidth(842);
        settings.setHeight(595);
        settings.setOffsetX(0);
        settings.setOffsetY(0);
        settings.setLineHeight(18);
        settings.setPageNumber(1);
        settings.setMargin(0);
        settings.setPadding(0);
        settings.setPageSize(pageType);
        settings.setFontName(FontNameToJEasyPdf.COURIER);
        settings.setFontSize(FontSizeToJEasyPdf.SMALL);
        settings.setFontColor(ColorsToJEasyPdf.BLACK);
        settings.setPageColor(ColorsToJEasyPdf.WHITE);
        settings.setTextContent(null);
        settings.setImageFilepath(null);
        settings.setByteContent(null);
        return settings;
    }

    private JEasyPdfContainer containerSettings() {
        JEasyPdfContainer settings = new JEasyPdfContainer();
        settings.setWidth(570);
        settings.setHeight(780);
        settings.setOffsetX(20);
        settings.setOffsetY(20);
        settings.setBorder(true);
        settings.setRoundedBorder(false);
        settings.setBorderWidth(1);
        settings.setBackColor(ColorsToJEasyPdf.WHITE);
        settings.setBorderColor(ColorsToJEasyPdf.GRAY);
        return settings;
    }

    private JEasyPdfTable tableSettings() {
        JEasyPdfTable settings = new JEasyPdfTable();
        settings.setWidth(540);
        settings.setHeight(90);
        settings.setOffsetX(0);
        settings.setOffsetY(0);
        settings.setBorder(true);
        settings.setHeaderColor(ColorsToJEasyPdf.BLACK);
        settings.setCelColor(ColorsToJEasyPdf.ICE);
        settings.setBorderColor(ColorsToJEasyPdf.BLACK);
        settings.setTableTemplate(TableDimensionsToJEasyPdf.TABLE_5X6);
        return settings;
    }

    private JEasyPdfText textSettings() {
        JEasyPdfText settings = new JEasyPdfText();
        settings.setWidth(0);
        settings.setHeight(780);
        settings.setOffsetX(0);
        settings.setOffsetY(0);
        settings.setLineHeight(18);
        settings.setLetterSpace(1);
        settings.setBold(false);
        settings.setItalic(false);
        settings.setUnderline(false);
        settings.setFontName(FontNameToJEasyPdf.HELVETICA);
        settings.setFontSize(FontSizeToJEasyPdf.NORMAL);
        return settings;
    }

    private JEasyPdfImage imageSettings() {
        JEasyPdfImage settings = new JEasyPdfImage();
        settings.setWidth(500);
        settings.setHeight(780);
        settings.setOffsetX(25);
        settings.setOffsetY(100);
        settings.setMaxWidth(500);
        settings.setMaxHeight(780);
        settings.setBorder(false);
        settings.setResize(false);
        settings.setFilenamePath(imgJava);
        settings.setImageType(ImageTypeToJEasyPdf.JPEG);
        settings.setImageQuality(ImageQualityToJEasyPdf.GOOD);
        return settings;
    }

    private JEasyPdfBarcode barcodeSettings() {
        JEasyPdfBarcode settings = new JEasyPdfBarcode();
        settings.setDpi(400);
        settings.setWidth(500);
        settings.setHeight(50);
        settings.setFontSize(2);
        settings.setLineHeight(20);
        settings.setOffsetX(55);
        settings.setOffsetY(35); //650,500,345,190,35
        settings.setFixQuiteZone(0);
        settings.setDoQuiteZone(false);
        settings.setData("123456789123456789123456789123456789");
        settings.setFontName(FontNameToJEasyPdf.COURIER);
        settings.setTextPosition(HumanReadablePlacement.HRP_BOTTOM);
        settings.setCodeType4Scanner(CodeType4ScannerToJEasyPdf.CODE128);
        return settings;
    }

    private JEasyPdfQrCode qrCodeSettings() {
        JEasyPdfQrCode settings = new JEasyPdfQrCode();
        settings.setDpi(400);
        settings.setMargin(0);
        settings.setMatrix(100);
        settings.setSize(100);
        settings.setOnColor(0xFF000001);
        settings.setOffColor(0xFFFFFFFF);
        settings.setOffsetX(470); //40,260,470
        settings.setOffsetY(348); //655,502,348,193,38
        settings.setData("https://huntercodexs.com");
        settings.setCodeType4Scanner(CodeType4ScannerToJEasyPdf.QRCODE);
        return settings;
    }

    private BoxTemplateSettings boxSettingsLetterLayout() {
        BoxTemplateSettings settings = new BoxTemplateSettings();

        //General
        settings.setTemplateTitleEnabled(true);
        settings.setBoxWidth(new int[]{570,620,570,570,570});
        settings.setBoxAdjustOffsetX(new int[]{0,-20,0,0,0});
        settings.setBoxAdjustOffsetY(new int[]{0,0,0,0,0});
        settings.setBoxBorderEnabled(new boolean[]{false, false, false, true, false});
        settings.setBoxBackColor(new ColorsToJEasyPdf[]{
                ColorsToJEasyPdf.WHITE,
                ColorsToJEasyPdf.BLACK,
                ColorsToJEasyPdf.NONE,
                ColorsToJEasyPdf.WHITE,
                ColorsToJEasyPdf.WHITE
        });

        return settings;
    }

    private BoxTemplateSettings boxSettingsA4Layout() {
        BoxTemplateSettings settings = new BoxTemplateSettings();

        //General
        settings.setTemplateTitleEnabled(true);
        settings.setBoxWidth(new int[]{570,620,570,570,570});
        settings.setBoxAdjustOffsetX(new int[]{0,-20,0,0,0});
        settings.setBoxAdjustOffsetY(new int[]{0,0,0,0,0});
        settings.setBoxBorderEnabled(new boolean[]{false, false, false, true, false});
        settings.setBoxBackColor(new ColorsToJEasyPdf[]{
                ColorsToJEasyPdf.WHITE,
                ColorsToJEasyPdf.BLACK,
                ColorsToJEasyPdf.NONE,
                ColorsToJEasyPdf.WHITE,
                ColorsToJEasyPdf.WHITE
        });

        return settings;
    }

    private BoxTemplateSettings boxSettingsLetter() {
        BoxTemplateSettings settings = new BoxTemplateSettings();

        //General
        settings.setTemplateTitleEnabled(true);
        settings.setBoxWidth(new int[]{570,620,570,570,570});
        settings.setBoxAdjustOffsetX(new int[]{0,-20,0,0,0});
        settings.setBoxAdjustOffsetY(new int[]{0,0,0,0,0});
        settings.setBoxBorderEnabled(new boolean[]{false, false, false, true, false});
        settings.setBoxBackColor(new ColorsToJEasyPdf[]{
                ColorsToJEasyPdf.WHITE,
                ColorsToJEasyPdf.BLACK,
                ColorsToJEasyPdf.NONE,
                ColorsToJEasyPdf.WHITE,
                ColorsToJEasyPdf.WHITE
        });

        return settings;
    }

    private BoxTemplateSettings boxSettingsA4() {
        BoxTemplateSettings settings = new BoxTemplateSettings();

        //General
        settings.setTemplateTitleEnabled(true);
        settings.setBoxWidth(new int[]{570,620,570,570,570});
        settings.setBoxAdjustOffsetX(new int[]{0,-20,0,0,0});
        settings.setBoxAdjustOffsetY(new int[]{0,0,0,0,0});
        settings.setBoxBorderEnabled(new boolean[]{false, false, false, true, false});
        settings.setBoxBackColor(new ColorsToJEasyPdf[]{
                ColorsToJEasyPdf.WHITE,
                ColorsToJEasyPdf.BLACK,
                ColorsToJEasyPdf.NONE,
                ColorsToJEasyPdf.WHITE,
                ColorsToJEasyPdf.WHITE
        });

        return settings;
    }

    private BoxDataContent boxData() {
        BoxDataContent settings = new BoxDataContent();
        return settings;
    }

    private JEasyPdfTemplateSettings easyPdfTemplateSettingsLetterLayout() {
        PageSizeToJEasyPdf pageType = PageSizeToJEasyPdf.LETTER_LAYOUT;
        JEasyPdfTemplateSettings settings = new JEasyPdfTemplateSettings();
        settings.setTemplate(JEasyPdfTemplates.BOX);
        settings.setImageBackground(imgBackground);
        settings.setDocument(documentSettings(pageType));
        settings.setPage(pageSettings(pageType));
        settings.setContainer(containerSettings());
        settings.setTable(tableSettings());
        settings.setText(textSettings());
        settings.setImage(imageSettings());
        settings.setBarcode(barcodeSettings());
        settings.setQrCode(qrCodeSettings());
        settings.setBox(boxSettingsLetterLayout());
        settings.setBoxContent(boxData());
        return settings;
    }

    private JEasyPdfTemplateSettings easyPdfTemplateSettingsA4Layout() {
        PageSizeToJEasyPdf pageType = PageSizeToJEasyPdf.A4_LAYOUT;
        JEasyPdfTemplateSettings settings = new JEasyPdfTemplateSettings();
        settings.setTemplate(JEasyPdfTemplates.BOX);
        settings.setImageBackground(imgBackground);
        settings.setDocument(documentSettings(pageType));
        settings.setPage(pageSettings(pageType));
        settings.setContainer(containerSettings());
        settings.setTable(tableSettings());
        settings.setText(textSettings());
        settings.setImage(imageSettings());
        settings.setBarcode(barcodeSettings());
        settings.setQrCode(qrCodeSettings());
        settings.setBox(boxSettingsA4Layout());
        settings.setBoxContent(boxData());
        return settings;
    }

    private JEasyPdfTemplateSettings easyPdfTemplateSettingsLetter() {
        PageSizeToJEasyPdf pageType = PageSizeToJEasyPdf.LETTER;
        JEasyPdfTemplateSettings settings = new JEasyPdfTemplateSettings();
        settings.setTemplate(JEasyPdfTemplates.BOX);
        settings.setImageBackground(imgBackground);
        settings.setDocument(documentSettings(pageType));
        settings.setPage(pageSettings(pageType));
        settings.setContainer(containerSettings());
        settings.setTable(tableSettings());
        settings.setText(textSettings());
        settings.setImage(imageSettings());
        settings.setBarcode(barcodeSettings());
        settings.setQrCode(qrCodeSettings());
        settings.setBox(boxSettingsLetter());
        settings.setBoxContent(boxData());
        return settings;
    }

    private JEasyPdfTemplateSettings easyPdfTemplateSettingsA4() {
        PageSizeToJEasyPdf pageType = PageSizeToJEasyPdf.A4;
        JEasyPdfTemplateSettings settings = new JEasyPdfTemplateSettings();
        settings.setTemplate(JEasyPdfTemplates.BOX);
        settings.setImageBackground(imgBackground);
        settings.setDocument(documentSettings(pageType));
        settings.setPage(pageSettings(pageType));
        settings.setContainer(containerSettings());
        settings.setTable(tableSettings());
        settings.setText(textSettings());
        settings.setImage(imageSettings());
        settings.setBarcode(barcodeSettings());
        settings.setQrCode(qrCodeSettings());
        settings.setBox(boxSettingsA4());
        settings.setBoxContent(boxData());
        return settings;
    }

    @Test
    public void templateTest() {
        String template = template(JEasyPdfTemplates.BOX);
        Assertions.assertEquals("BOX", template);
    }

    @Test
    public void easyPdfTemplateBoxLetterLayoutTest() {
        JEasyPdfTemplate templateManager = new JEasyPdfTemplate();
        templateManager.easyPdfTemplateBox(easyPdfTemplateSettingsLetterLayout());
    }

    @Test
    public void easyPdfTemplateBoxA4LayoutTest() {
        JEasyPdfTemplate templateManager = new JEasyPdfTemplate();
        templateManager.easyPdfTemplateBox(easyPdfTemplateSettingsA4Layout());
    }

    @Test
    public void easyPdfTemplateBoxLetterSample1Test() {
        JEasyPdfTemplate templateManager = new JEasyPdfTemplate();
        templateManager.easyPdfTemplateBox(easyPdfTemplateSettingsLetter());
    }

    @Test
    public void easyPdfTemplateBoxA4Sample1Test() {
        JEasyPdfTemplate templateManager = new JEasyPdfTemplate();
        templateManager.easyPdfTemplateBox(easyPdfTemplateSettingsA4());
    }

}

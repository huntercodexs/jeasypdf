package com.huntercodexs.jeasy;

import com.huntercodexs.jeasypdf.core.dto.*;
import com.huntercodexs.jeasypdf.core.enumerator.*;
import com.huntercodexs.jeasypdf.template.JEasyPdfTemplate;
import com.huntercodexs.jeasypdf.template.setting.JEasyPdfTemplateSettings;
import com.huntercodexs.jeasypdf.template.setting.free.FreeDataContent;
import com.huntercodexs.jeasypdf.template.setting.free.FreeTemplateSettings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.krysalis.barcode4j.HumanReadablePlacement;

import static com.huntercodexs.jeasypdf.core.enumerator.JEasyPdfTemplates.template;

public class JEasyPdfTemplateFreeUnitaryTests {

    private final static String path = "./src/test/resources/files/pdf";
    private final static String pdfFilenameLetter = path+"/my-jeasypdf-test-template-free-LETTER.pdf";
    private final static String pdfFilenameLetterLayout = path+"/my-jeasypdf-test-template-free-LETTER-LAYOUT.pdf";
    private final static String pdfFilenameA4 = path+"/my-jeasypdf-test-template-free-A4.pdf";
    private final static String pdfFilenameA4Layout = path+"/my-jeasypdf-test-template-free-A4-LAYOUT.pdf";
    private final static String imgJava = "./src/test/resources/files/images/ads/java.png";
    private final static String imgBackground = "./src/test/resources/files/images/background/jeasypdf-background-sample-7.jpg";
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

    private FreeTemplateSettings freeSettingsLetterLayout() {
        FreeTemplateSettings settings = new FreeTemplateSettings();

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

    private FreeTemplateSettings freeSettingsA4Layout() {
        FreeTemplateSettings settings = new FreeTemplateSettings();

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

    private FreeTemplateSettings freeSettingsLetter() {
        FreeTemplateSettings settings = new FreeTemplateSettings();

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

    private FreeTemplateSettings freeSettingsA4() {
        FreeTemplateSettings settings = new FreeTemplateSettings();

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

    private FreeDataContent freeData() {
        FreeDataContent settings = new FreeDataContent();
        return settings;
    }

    private JEasyPdfTemplateSettings easyPdfTemplateSettingsLetterLayout() {
        PageSizeToJEasyPdf pageType = PageSizeToJEasyPdf.LETTER_LAYOUT;
        JEasyPdfTemplateSettings settings = new JEasyPdfTemplateSettings();
        settings.setTemplate(JEasyPdfTemplates.FREE);
        settings.setImageBackground(imgBackground);
        settings.setDocument(documentSettings(pageType));
        settings.setPage(pageSettings(pageType));
        settings.setContainer(containerSettings());
        settings.setTable(tableSettings());
        settings.setText(textSettings());
        settings.setImage(imageSettings());
        settings.setBarcode(barcodeSettings());
        settings.setQrCode(qrCodeSettings());
        settings.setFree(freeSettingsLetterLayout());
        settings.setFreeContent(freeData());
        return settings;
    }

    private JEasyPdfTemplateSettings easyPdfTemplateSettingsA4Layout() {
        PageSizeToJEasyPdf pageType = PageSizeToJEasyPdf.A4_LAYOUT;
        JEasyPdfTemplateSettings settings = new JEasyPdfTemplateSettings();
        settings.setTemplate(JEasyPdfTemplates.FREE);
        settings.setImageBackground(imgBackground);
        settings.setDocument(documentSettings(pageType));
        settings.setPage(pageSettings(pageType));
        settings.setContainer(containerSettings());
        settings.setTable(tableSettings());
        settings.setText(textSettings());
        settings.setImage(imageSettings());
        settings.setBarcode(barcodeSettings());
        settings.setQrCode(qrCodeSettings());
        settings.setFree(freeSettingsA4Layout());
        settings.setFreeContent(freeData());
        return settings;
    }

    private JEasyPdfTemplateSettings easyPdfTemplateSettingsLetter() {
        PageSizeToJEasyPdf pageType = PageSizeToJEasyPdf.LETTER;
        JEasyPdfTemplateSettings settings = new JEasyPdfTemplateSettings();
        settings.setTemplate(JEasyPdfTemplates.FREE);
        settings.setImageBackground(imgBackground);
        settings.setDocument(documentSettings(pageType));
        settings.setPage(pageSettings(pageType));
        settings.setContainer(containerSettings());
        settings.setTable(tableSettings());
        settings.setText(textSettings());
        settings.setImage(imageSettings());
        settings.setBarcode(barcodeSettings());
        settings.setQrCode(qrCodeSettings());
        settings.setFree(freeSettingsLetter());
        settings.setFreeContent(freeData());
        return settings;
    }

    private JEasyPdfTemplateSettings easyPdfTemplateSettingsA4() {
        PageSizeToJEasyPdf pageType = PageSizeToJEasyPdf.A4;
        JEasyPdfTemplateSettings settings = new JEasyPdfTemplateSettings();
        settings.setTemplate(JEasyPdfTemplates.FREE);
        settings.setImageBackground(imgBackground);
        settings.setDocument(documentSettings(pageType));
        settings.setPage(pageSettings(pageType));
        settings.setContainer(containerSettings());
        settings.setTable(tableSettings());
        settings.setText(textSettings());
        settings.setImage(imageSettings());
        settings.setBarcode(barcodeSettings());
        settings.setQrCode(qrCodeSettings());
        settings.setFree(freeSettingsA4());
        settings.setFreeContent(freeData());
        return settings;
    }

    @Test
    public void templateTest() {
        String template = template(JEasyPdfTemplates.FREE);
        Assertions.assertEquals("FREE", template);
    }

    @Test
    public void easyPdfTemplateFreeLetterLayoutTest() {
        Runtime rt = Runtime.getRuntime();

        long totalMemory = rt.totalMemory();
        long freeMemoryBefore = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

        JEasyPdfTemplate templateManager = new JEasyPdfTemplate();
        templateManager.easyPdfTemplateFree(easyPdfTemplateSettingsLetterLayout());

        long freeMemoryAfter = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long usedMemory = freeMemoryAfter - freeMemoryBefore;
    }

    @Test
    public void easyPdfTemplateFreeA4LayoutTest() {
        Runtime rt = Runtime.getRuntime();

        long totalMemory = rt.totalMemory();
        long freeMemoryBefore = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

        JEasyPdfTemplate templateManager = new JEasyPdfTemplate();
        templateManager.easyPdfTemplateFree(easyPdfTemplateSettingsA4Layout());

        long freeMemoryAfter = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long usedMemory = freeMemoryAfter - freeMemoryBefore;
    }

    @Test
    public void easyPdfTemplateFreeLetterSample1Test() {
        Runtime rt = Runtime.getRuntime();

        long totalMemory = rt.totalMemory();
        long freeMemoryBefore = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

        JEasyPdfTemplate templateManager = new JEasyPdfTemplate();
        templateManager.easyPdfTemplateFree(easyPdfTemplateSettingsLetter());

        long freeMemoryAfter = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long usedMemory = freeMemoryAfter - freeMemoryBefore;
    }

    @Test
    public void easyPdfTemplateFreeA4Sample1Test() {
        Runtime rt = Runtime.getRuntime();

        long totalMemory = rt.totalMemory();
        long freeMemoryBefore = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

        JEasyPdfTemplate templateManager = new JEasyPdfTemplate();
        templateManager.easyPdfTemplateFree(easyPdfTemplateSettingsA4());

        long freeMemoryAfter = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long usedMemory = freeMemoryAfter - freeMemoryBefore;
    }

}

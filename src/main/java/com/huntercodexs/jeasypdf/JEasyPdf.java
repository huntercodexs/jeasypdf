package com.huntercodexs.jeasypdf;

import com.huntercodexs.jeasypdf.barcode.JEasyBarcodeScanner;
import com.huntercodexs.jeasypdf.barcode.setting.BarcodeScanner;
import com.huntercodexs.jeasypdf.core.JEasyPdfResources;
import com.huntercodexs.jeasypdf.core.dto.*;
import com.huntercodexs.jeasypdf.core.enumerator.ColorsToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.ImageQualityToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.ImageTypeToJEasyPdf;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.text.PDFTextStripper;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import static com.huntercodexs.jeasypdf.core.enumerator.ColorsToJEasyPdf.color;
import static com.huntercodexs.jeasypdf.core.enumerator.ImageQualityToJEasyPdf.imageQuality;
import static com.huntercodexs.jeasypdf.core.enumerator.ImageTypeToJEasyPdf.imageType;

/**
 * @author huntercodexs (powered by jereelton-devel)
 * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
 * @implNote This class use as "pdfbox 2.0.0" from org.apache.pdfbox base process to PDF files handler
 * */
public class JEasyPdf extends JEasyPdfResources {

    /**
     * <h6 style="color: #FFFF00; font-size: 11px">pdfCreate</h6>
     *
     * <p style="color: #CDCDCD">Create a PDF file quickly</p>
     *
     * @param docSettings  (EasyPdfDocumentSettings)
     * @param pageSettings (EasyPdfPageSettings)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void pdfCreate(JEasyPdfDocument docSettings, JEasyPdfPage pageSettings) {
        String filenamePath = docSettings.getFilenamePath();

        if (filenamePath == null || filenamePath.isEmpty()) {
            filenamePath = UUID.randomUUID()+".pdf";
            docSettings.setFilenamePath(filenamePath);
        }

        if ((pageSettings.getPageNumber()-1) > 0) {
            addPDF(docSettings, pageSettings);
        } else {
            initPDF(filenamePath, pageSettings);
        }

        createPDF(docSettings, pageSettings);
        protectPDF(docSettings);
    }

    /**
     * <h6 style="color: #FFFF00; font-size: 11px">pdfAddImage</h6>
     *
     * <p style="color: #CDCDCD">Add an image to a PDF file</p>
     *
     * @param docSettings  (EasyPdfDocumentSettings)
     * @param pageSettings (EasyPdfPageSettings)
     * @param imgSettings (EasyPdfImageSettings)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void pdfAddImage(
            JEasyPdfDocument docSettings,
            JEasyPdfPage pageSettings,
            JEasyPdfImage imgSettings
    ) {
        File file = new File(docSettings.getFilenamePath());

        try (PDDocument document = PDDocument.load(file, docSettings.getOwnerPassword())) {

            PDPage page = document.getPage(pageSettings.getPageNumber()-1);

            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setStartPage(pageSettings.getPageNumber()-1);
            stripper.setEndPage((pageSettings.getPageNumber()-1)+1);
            String content = stripper.getText(document);

            PDPageContentStream contentStream = contentStreamInit(page, document, null);

            String[] lines = content.replace("\r", "").split("\n");

            contentStreamText(lines, pageSettings, contentStream);

            contentStreamImage(
                    pageSettings.getImageFilepath(),
                    imgSettings.getWidth(),
                    imgSettings.getHeight(),
                    imgSettings.getOffsetX(),
                    imgSettings.getOffsetY(),
                    document,
                    contentStream);

            contentStream.close();
            document.save(docSettings.getFilenamePath());
            document.close();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

    /**
     * <h6 style="color: #FFFF00; font-size: 11px">pdfAddContainer</h6>
     *
     * <p style="color: #CDCDCD">Add an box (square, rectangle) to a PDF file</p>
     *
     * @param docSettings (EasyPdfDocumentSettings)
     * @param pageSettings (EasyPdfPageSettings)
     * @param rectSettings (EasyPdfRectangleSettings)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void pdfAddContainer(
            JEasyPdfDocument docSettings,
            JEasyPdfPage pageSettings,
            JEasyPdfContainer rectSettings
    ) {
        File file = new File(docSettings.getFilenamePath());

        try (PDDocument document = PDDocument.load(file, docSettings.getOwnerPassword())) {

            PDPage page = document.getPage(pageSettings.getPageNumber()-1);

            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setStartPage((pageSettings.getPageNumber()-1)+1);
            stripper.setEndPage((pageSettings.getPageNumber()-1)+1);
            String content = stripper.getText(document);

            PDPageContentStream contentStream = contentStreamInit(page, document, null);

            contentStreamFillRect(rectSettings, contentStream);

            if (rectSettings.isBorder()) {
                contentStreamBorderRect(rectSettings, contentStream);
            }

            String[] lines = content.replace("\r", "").split("\n");

            contentStreamText(lines, pageSettings, contentStream);

            contentStream.close();
            document.save(docSettings.getFilenamePath());
            document.close();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

    /**
     * <h6 style="color: #FFFF00; font-size: 11px">pdfAddBarcode</h6>
     *
     * <p style="color: #CDCDCD">Add an barcode (128, 39, pdf417) to a PDF file</p>
     *
     * @param docSettings (EasyPdfDocument)
     * @param pageSettings (EasyPdfPage)
     * @param barcodeSettings (EasyPdfBarcode)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void pdfAddBarcode(
            JEasyPdfDocument docSettings,
            JEasyPdfPage pageSettings,
            JEasyPdfBarcode barcodeSettings
    ) {
        File file = new File(docSettings.getFilenamePath());

        try (PDDocument document = PDDocument.load(file, docSettings.getOwnerPassword())) {

            PDPage page = document.getPage(pageSettings.getPageNumber()-1);

            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setStartPage(pageSettings.getPageNumber()-1);
            stripper.setEndPage((pageSettings.getPageNumber()-1)+1);
            String content = stripper.getText(document);

            PDPageContentStream contentStream = contentStreamInit(page, document, null);

            String[] lines = content.replace("\r", "").split("\n");

            contentStreamText(lines, pageSettings, contentStream);

            switch (barcodeSettings.getCodeType4Scanner().name()) {

                case "CODE128":
                    barcode128(barcodeSettings, document, contentStream);
                    break;
                case "CODE39":
                    barcode39(barcodeSettings, document, contentStream);
                    break;
                case "PDF417":
                    barcodePdf417(barcodeSettings, document, contentStream);
                    break;
                default:
                    throw new RuntimeException("Invalid Barcode Type");
            }

            contentStream.close();
            document.save(docSettings.getFilenamePath());
            document.close();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

    /**
     * <h6 style="color: #FFFF00; font-size: 11px">pdfAddQrCode</h6>
     *
     * <p style="color: #CDCDCD">Add an QR Code to a PDF file</p>
     *
     * @param docSettings (EasyPdfDocument)
     * @param pageSettings (EasyPdfPage)
     * @param qrCodeSettings (EasyPdfQrCode)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void pdfAddQrCode(
            JEasyPdfDocument docSettings,
            JEasyPdfPage pageSettings,
            JEasyPdfQrCode qrCodeSettings
    ) {
        File file = new File(docSettings.getFilenamePath());

        try (PDDocument document = PDDocument.load(file, docSettings.getOwnerPassword())) {

            PDPage page = document.getPage(pageSettings.getPageNumber()-1);

            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setStartPage(pageSettings.getPageNumber()-1);
            stripper.setEndPage((pageSettings.getPageNumber()-1)+1);
            String content = stripper.getText(document);

            PDPageContentStream contentStream = contentStreamInit(page, document, null);

            String[] lines = content.replace("\r", "").split("\n");

            contentStreamText(lines, pageSettings, contentStream);

            if (qrCodeSettings.getCodeType4Scanner().name().equals("QRCODE")) {
                qrCode(qrCodeSettings, document, contentStream);
            } else {
                throw new RuntimeException("Invalid Code Type: " + qrCodeSettings.getCodeType4Scanner().name());
            }

            contentStream.close();
            document.save(docSettings.getFilenamePath());
            document.close();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }
    }

    /**
     * TODO
     * <h6 style="color: #FFFF00; font-size: 11px">pdfAddForm</h6>
     *
     * <p style="color: #CDCDCD">Add an form to a PDF file</p>
     *
     * @param docSettings (EasyPdfDocumentSettings)
     * @param pageSettings (EasyPdfPageSettings)
     * @param rectSettings (EasyPdfRectangleSettings)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void pdfAddForm(
            JEasyPdfDocument docSettings,
            JEasyPdfPage pageSettings,
            JEasyPdfContainer rectSettings
    ) {
        File file = new File(docSettings.getFilenamePath());

        try (PDDocument document = PDDocument.load(file, docSettings.getOwnerPassword())) {

            PDPage page = document.getPage(pageSettings.getPageNumber()-1);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            //TOP
            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.GREEN_DARK));
            contentStream.addRect(
                    rectSettings.getOffsetX(),
                    610,
                    550,
                    30);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.GOLD));
            contentStream.addRect(
                    rectSettings.getOffsetX(),
                    610,
                    100,
                    30);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.BLUE));
            contentStream.addRect(
                    130,
                    610,
                    80,
                    30);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.BLUE_SEA));
            contentStream.addRect(
                    210,
                    610,
                    370,
                    30);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            //LEFT SIDE
            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.PURPLE));
            contentStream.addRect(
                    rectSettings.getOffsetX(),
                    rectSettings.getOffsetY(),
                    rectSettings.getWidth(),
                    rectSettings.getHeight());
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.RED_LIGHT));
            contentStream.addRect(
                    rectSettings.getOffsetX(),
                    400,
                    rectSettings.getWidth(),
                    30);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.GREEN));
            contentStream.addRect(
                    rectSettings.getOffsetX(),
                    430,
                    rectSettings.getWidth(),
                    100);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.BLUE));
            contentStream.addRect(
                    rectSettings.getOffsetX(),
                    530,
                    rectSettings.getWidth(),
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.GOLD));
            contentStream.addRect(
                    rectSettings.getOffsetX(),
                    530,
                    100,
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.GREEN_DARK));
            contentStream.addRect(
                    130,
                    530,
                    100,
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.YELLOW));
            contentStream.addRect(
                    230,
                    530,
                    100,
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.CYAN));
            contentStream.addRect(
                    330,
                    530,
                    100,
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.PINK));
            contentStream.addRect(
                    rectSettings.getOffsetX(),
                    550,
                    rectSettings.getWidth(),
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.BLUE));
            contentStream.addRect(
                    rectSettings.getOffsetX(),
                    550,
                    100,
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.BLACK));
            contentStream.addRect(
                    130,
                    550,
                    100,
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.GREEN));
            contentStream.addRect(
                    230,
                    550,
                    100,
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.GRAY));
            contentStream.addRect(
                    330,
                    550,
                    100,
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.ORANGE));
            contentStream.addRect(
                    rectSettings.getOffsetX(),
                    570,
                    rectSettings.getWidth(),
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.RED));
            contentStream.addRect(
                    rectSettings.getOffsetX(),
                    590,
                    rectSettings.getWidth(),
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            //RIGHT SIDE
            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(rectSettings.getBorderColor()));
            contentStream.addRect(
                    430,
                    rectSettings.getOffsetY(),
                    150,
                    rectSettings.getHeight());
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(rectSettings.getBorderColor()));
            contentStream.addRect(
                    430,
                    430,
                    150,
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(rectSettings.getBorderColor()));
            contentStream.addRect(
                    430,
                    450,
                    150,
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(rectSettings.getBorderColor()));
            contentStream.addRect(
                    430,
                    470,
                    150,
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(rectSettings.getBorderColor()));
            contentStream.addRect(
                    430,
                    490,
                    150,
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(rectSettings.getBorderColor()));
            contentStream.addRect(
                    430,
                    510,
                    150,
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(rectSettings.getBorderColor()));
            contentStream.addRect(
                    430,
                    530,
                    150,
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(rectSettings.getBorderColor()));
            contentStream.addRect(
                    430,
                    550,
                    150,
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(rectSettings.getBorderColor()));
            contentStream.addRect(
                    430,
                    570,
                    150,
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.setLineWidth(rectSettings.getBorderWidth());
            contentStream.setStrokingColor(color(ColorsToJEasyPdf.YELLOW));
            contentStream.addRect(
                    430,
                    590,
                    150,
                    20);
            contentStream.closeAndStroke();
            contentStream.setStrokingColor(0,0,0);

            contentStream.close();
            document.save(docSettings.getFilenamePath());
            document.close();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

    /**
     * <h6 style="color: #FFFF00; font-size: 11px">pdfAddBarcodeForm</h6>
     *
     * <p style="color: #CDCDCD">Add an barcode form to a PDF file</p>
     *
     * @param docSettings (EasyPdfDocumentSettings)
     * @param pageSettings (EasyPdfPageSettings)
     * @param bcFormSettings (EasyPdfBarcodeForm)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void pdfAddBarcodeForm(
            JEasyPdfDocument docSettings,
            JEasyPdfPage pageSettings,
            JEasyPdfBarcodeForm bcFormSettings
    ) {
        File file = new File(docSettings.getFilenamePath());

        try (PDDocument document = PDDocument.load(file, docSettings.getOwnerPassword())) {

            PDPage page = document.getPage(pageSettings.getPageNumber()-1);
            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            barcodeForm(document, pageSettings, bcFormSettings, contentStream);

            contentStream.close();
            document.save(docSettings.getFilenamePath());
            document.close();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

    /**
     * <h6 style="color: #FFFF00; font-size: 11px">pdfReader</h6>
     *
     * <p style="color: #CDCDCD">Reader an specific PDF file</p>
     * <p>
     * <br />It is possible to read a whole pdf document using 0 for pageStart and 0 for pageEnd
     * <br />Also it is possible to read a range of page using the initial page range and the final page range
     * <br />More one option is to read a single page using in the pageStart and pageEnd the same value
     * <br />Examples:
     * <br />- Read Whole document: (filenamePath, 0, 0)
     * <br />- Read range page of document: (filenamePath, 2, 6)
     * <br />- Read a single page of document: (filenamePath, 0, 1)
     *
     * @param docSettings (EasyPdfDocumentSettings)
     * @return String (PDF Content)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public String pdfReader(JEasyPdfDocument docSettings) {

        File file = new File(docSettings.getFilenamePath());

        try (PDDocument document = PDDocument.load(file, docSettings.getOwnerPassword())) {

            if ((docSettings.getStartPage()-1) > docSettings.getEndPage()) {
                throw new RuntimeException("Failed: Page End should be greater than Page Start");
            }

            if ((docSettings.getStartPage()-1) > document.getNumberOfPages()) {
                throw new RuntimeException("Failed: Page Start > numberOfPages");
            } else if (docSettings.getEndPage() > document.getNumberOfPages()) {
                throw new RuntimeException("Failed: Page End > numberOfPages");
            }

            PDFTextStripper stripper = new PDFTextStripper();

            if ((docSettings.getStartPage()-1) == 0 && docSettings.getEndPage() == 0) {
                String content = stripper.getText(document);
                document.close();
                return content;
            }

            stripper.setStartPage(docSettings.getStartPage()-1);
            stripper.setEndPage(docSettings.getEndPage()-1);
            String content = stripper.getText(document);
            document.close();

            return content;

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

    /**
     * <h6 style="color: #FFFF00; font-size: 11px">pdfProtect</h6>
     *
     * <p style="color: #CDCDCD">Encrypt one PDF file to data protection</p>
     *
     * @param docSettings (EasyPdfDocumentSettings)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void pdfProtect(JEasyPdfDocument docSettings) {
        protectPDF(docSettings);
    }

    /**
     * <h6 style="color: #FFFF00; font-size: 11px">pdfUnprotect</h6>
     *
     * <p style="color: #CDCDCD">Unprotect PDF file</p>
     *
     * @param docSettings (EasyPdfDocumentSettings)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void pdfUnprotect(JEasyPdfDocument docSettings) {
        unprotectPDF(docSettings);
    }

    /**
     * <h6 style="color: #FFFF00; font-size: 11px">pdfDetails</h6>
     *
     * <p style="color: #CDCDCD">Get details from one PDF file</p>
     *
     * @param docSettings (EasyPdfDocumentSettings)
     * @return String (PDF Content)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     * @author huntercodexs (powered by jereelton-devel)
     */
    public JEasyPdfDocumentDetails pdfDetails(JEasyPdfDocument docSettings) {

        File file = new File(docSettings.getFilenamePath());

        try (PDDocument document = PDDocument.load(file, docSettings.getOwnerPassword())) {

            PDDocumentInformation information = document.getDocumentInformation();

            JEasyPdfDocumentDetails details = new JEasyPdfDocumentDetails();
            details.setNumberOfPages(document.getNumberOfPages());
            details.setProtected(document.isEncrypted());
            details.setPageSize(String.valueOf(information.getPropertyStringValue("Paper size")));
            details.setTitle(information.getTitle());
            details.setFontName(null);
            details.setFontSize(null);
            details.setAuthor(information.getAuthor());
            details.setDate(String.valueOf(information.getCreationDate().getTime()));
            details.setSubject(information.getSubject());
            details.setKeywords(information.getKeywords());

            return details;

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

    /**
     * <h6 style="color: #FFFF00; font-size: 11px">pdfFromImage</h6>
     *
     * <p style="color: #CDCDCD">Create a PDF file from image</p>
     *
     * @param docSettings (EasyPdfDocumentSettings)
     * @param pageSettings (EasyPdfPageSettings)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void pdfFromImage(JEasyPdfDocument docSettings, JEasyPdfPage pageSettings) {

        initPDF(docSettings.getFilenamePath(), pageSettings);

        File file = new File(docSettings.getFilenamePath());

        try (PDDocument document = PDDocument.load(file, docSettings.getOwnerPassword())) {

            PDImageXObject image = PDImageXObject.createFromFile(pageSettings.getImageFilepath(), document);

            document.removePage(0);
            PDPage page = new PDPage(new PDRectangle(image.getWidth(), image.getHeight()));
            document.addPage(page);

            PDPageContentStream contentStream = contentStreamInit(page, document, null);

            contentStreamImage(
                    pageSettings.getImageFilepath(),
                    image.getWidth(),
                    image.getHeight(),
                    0,
                    0,
                    document,
                    contentStream);

            contentStream.close();
            document.save(docSettings.getFilenamePath());
            document.close();

            protectPDF(docSettings);

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

    /**
     * <h6 style="color: #FFFF00; font-size: 11px">pdfToImage</h6>
     *
     * <p style="color: #CDCDCD">Export a PDF file to image</p>
     *
     * To export whole PDF document to IMAGE file you can pass the value 0
     * in the argument pageSettings.pageNumber
     *
     * @param docSettings (EasyPdfDocumentSettings)
     * @param pageSettings (EasyPdfPageSettings)
     * @param imageSettings (EasyPdfImageSettings)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void pdfToImage(
            JEasyPdfDocument docSettings,
            JEasyPdfPage pageSettings,
            JEasyPdfImage imageSettings
    ) {
        File file = new File(docSettings.getFilenamePath());

        try (PDDocument document = PDDocument.load(file, docSettings.getOwnerPassword())) {

            if (imageSettings.getImageQuality() == null) {
                imageSettings.setImageQuality(ImageQualityToJEasyPdf.NORMAL);
            }

            if (imageSettings.getImageType() == null) {
                imageSettings.setImageType(ImageTypeToJEasyPdf.JPEG);
            }

            if (pageSettings.getPageNumber() <= 0) {
                pageSettings.setPageNumber(1);
            }

            PDFRenderer renderer = new PDFRenderer(document);
            BufferedImage image = renderer.renderImageWithDPI(
                    pageSettings.getPageNumber()-1,
                    imageQuality(imageSettings.getImageQuality()),
                    ImageType.RGB);

            File fileImage = new File(imageSettings.getFilenamePath());
            ImageIO.write(image, imageType(imageSettings.getImageType()), fileImage);

            document.close();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

    /**
     * <h6 style="color: #FFFF00; font-size: 11px">pdfSplitter</h6>
     *
     * <p style="color: #CDCDCD">Split a PDF file into many files</p>
     *
     * @param docSettings (EasyPdfDocumentSettings)
     * @param pathToSave (String)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void pdfSplitter(JEasyPdfDocument docSettings, String pathToSave) {

        File file = new File(docSettings.getFilenamePath());

        try (PDDocument document = PDDocument.load(file, docSettings.getOwnerPassword())) {

            Splitter splitter = new Splitter();
            List<PDDocument> pages = splitter.split(document);
            Iterator<PDDocument> iterator = pages.listIterator();

            String prefix = docSettings.getFilenamePath()
                    .replaceFirst("^\\./", "")
                    .split("\\.")[0];

            String[] arPrefix = prefix.split("/");
            String pdfPrefix = arPrefix[arPrefix.length-1];

            pathToSave = pathToSave.replaceFirst("/$", "")+"/"+pdfPrefix;

            int i = 0;
            while (iterator.hasNext()) {
                try (PDDocument pd = iterator.next()) {

                    i++;
                    String filename = pathToSave+"-"+i+".pdf";

                    pd.save(filename);
                    docSettings.setFilenamePath(filename);
                    protectPDF(docSettings);

                } catch (IOException iox) {
                    throw new RuntimeException(iox.getMessage());
                }
            }

            document.close();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

    /**
     * <h6 style="color: #FFFF00; font-size: 11px">pdfMerge</h6>
     *
     * <p style="color: #CDCDCD">Merge pdf files in a single PDF file</p>
     *
     * @param docSettings (EasyPdfDocumentSettings)
     * @param pdfListToMerge (List<String>)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void pdfMerger(JEasyPdfDocument docSettings, List<String> pdfListToMerge) {

        PDFMergerUtility pdfMerger = new PDFMergerUtility();
        pdfMerger.setDestinationFileName(docSettings.getFilenamePath());

        try {

            try (PDDocument finalPDF = new PDDocument()) {
                for (String pdfToMerge : pdfListToMerge) {
                    File pdfFile = new File(pdfToMerge);
                    try (PDDocument document = PDDocument.load(pdfFile, docSettings.getOwnerPassword())) {
                        pdfMerger.appendDocument(finalPDF, document);
                    }
                }

                finalPDF.save(docSettings.getFilenamePath());
                protectPDF(docSettings);
            }

        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }

    }

    /**
     * <h6 style="color: #FFFF00; font-size: 11px">pdfScanner</h6>
     *
     * <p style="color: #CDCDCD">Scanner a PDF file to get some barcode in it</p>
     *
     * @param docSettings (EasyPdfDocumentSettings)
     * @return List (PdfBarcodeScannerResults)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public List<BarcodeScanner> pdfScanner(JEasyPdfDocument docSettings) {

        File file = new File(docSettings.getFilenamePath());

        try (PDDocument document = PDDocument.load(file, docSettings.getOwnerPassword())) {

            int numPages = document.getNumberOfPages();

            JEasyBarcodeScanner pdfScanner = new JEasyBarcodeScanner();

            for (int page = 0; page < numPages; page++) {
                PDPage pdPage = document.getPage(page);
                pdfScanner.scanner(pdPage, page, 20);
            }

            return pdfScanner.results();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }
    }

    /**
     * TODO
     * <h6 style="color: #FFFF00; font-size: 11px">pdfAssign</h6>
     *
     * <p style="color: #CDCDCD">Assign a PDF file with a keystore, date and md5sum|sha256</p>
     *
     * @param docPath (String: Doc path to PDF create)
     * @param filenamePath (String: Path filename to save file)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     * @author huntercodexs (powered by jereelton-devel)
     * @implNote For Windows + MS Office Word
     * */
    public void pdfAssign(String docPath, String filenamePath) {
        /*Code here !*/
    }

    /**
     * TODO
     * <h6 style="color: #FFFF00; font-size: 11px">pdfFromDoc</h6>
     *
     * <p style="color: #CDCDCD">Create a PDF file from doc</p>
     *
     * @param docPath (String: Doc path to PDF create)
     * @param filenamePath (String: Path filename to save file)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     * @author huntercodexs (powered by jereelton-devel)
     * @implNote For Windows + MS Office Word
     * */
    public void pdfFromDoc(String docPath, String filenamePath) {
        /*Code here !*/
    }

}

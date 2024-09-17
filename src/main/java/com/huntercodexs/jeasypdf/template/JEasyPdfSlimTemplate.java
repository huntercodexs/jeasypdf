package com.huntercodexs.jeasypdf.template;

import com.huntercodexs.jeasypdf.core.dto.JEasyPdfContainer;
import com.huntercodexs.jeasypdf.core.dto.JEasyPdfImage;
import com.huntercodexs.jeasypdf.core.dto.JEasyPdfPage;
import com.huntercodexs.jeasypdf.core.enumerator.ColorsToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.FontNameToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.FontSizeToJEasyPdf;
import com.huntercodexs.jeasypdf.template.setting.JEasyPdfTemplateSettings;
import com.huntercodexs.jeasypdf.template.setting.slim.SlimDataContent;
import com.huntercodexs.jeasypdf.template.setting.slim.SlimTemplateSettings;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.krysalis.barcode4j.HumanReadablePlacement;

import java.util.ArrayList;
import java.util.List;

import static com.huntercodexs.jeasypdf.core.dto.JEasyPdfPage.OFFSET_Y_ADJUST_A4;
import static com.huntercodexs.jeasypdf.core.dto.JEasyPdfPage.WIDTH_ADJUST_A4;
import static com.huntercodexs.jeasypdf.template.setting.slim.SlimTemplateSettings.*;

/**
 * @author huntercodexs (powered by jereelton-devel)
 * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
 * @implNote This class use as "pdfbox 2.0.0" from org.apache.pdfbox base process to PDF files handler
 * */
public class JEasyPdfSlimTemplate extends JEasyPdfBuilderTemplate {

    private JEasyPdfPage jeasyPdfPage;

    private int correctOffsetY(int box, String pageSize, JEasyPdfContainer rectSettings) {
        int adjustOffsetY = 0;

        if (pageSize.contains("A4")) {
            adjustOffsetY = OFFSET_Y_ADJUST_A4;
        }

        if (box == 0) {
            rectSettings.setOffsetY(OFFSET_Y_BLOCK1+(adjustOffsetY));
        } else if (box == 1) {
            rectSettings.setOffsetY(OFFSET_Y_BLOCK2+(adjustOffsetY));
        } else if (box == 2) {
            rectSettings.setOffsetY(OFFSET_Y_BLOCK3+(adjustOffsetY));
        } else if (box == 3) {
            rectSettings.setOffsetY(OFFSET_Y_BLOCK4+(adjustOffsetY));
        } else {
            rectSettings.setOffsetY(OFFSET_Y_BLOCK5+(adjustOffsetY));
        }
        return rectSettings.getOffsetY();
    }

    private void drawContainer(
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        JEasyPdfContainer rectSettings = settings.getContainer();

        int widthAdjustA4 = 0;
        int offsetYAdjustA4 = 0;

        if (this.jeasyPdfPage.getPageSize().name().contains("A4")) {
            widthAdjustA4 = WIDTH_ADJUST_A4;
            offsetYAdjustA4 = OFFSET_Y_ADJUST_A4;
        }

        for (int box = 0; box < BOX_QUANTITY; box++) {

            rectSettings.setOffsetX(DEFAULT_OFFSET_X);
            rectSettings.setWidth(DEFAULT_WIDTH);
            rectSettings.setHeight(DEFAULT_HEIGHT);

            rectSettings.setOffsetY(correctOffsetY(box, this.jeasyPdfPage.getPageSize().name(), rectSettings));

            if (settings.getSlim().boxWidth[box] != 0) {
                rectSettings.setWidth(settings.getSlim().boxWidth[box]+(widthAdjustA4));
            }

            if (settings.getSlim().boxAdjustOffsetX[box] != 0) {
                rectSettings.setOffsetX(DEFAULT_OFFSET_X+(settings.getSlim().boxAdjustOffsetX[box])+(widthAdjustA4));
            }

            if (settings.getSlim().boxAdjustOffsetY[box] != 0) {
                rectSettings.setOffsetY(rectSettings.getOffsetY()+(settings.getSlim().boxAdjustOffsetY[box])+(offsetYAdjustA4));
            }

            rectSettings.setBorder(settings.getSlim().boxBorderEnabled[box]);

            if (settings.getSlim().boxBackColor[box] != null) {
                rectSettings.setBackColor(settings.getSlim().boxBackColor[box]);
            }

            if (rectSettings.getBackColor() == null) {
                contentStreamEmptyRect(contentStream);

            } else if (rectSettings.getBackColor().getColorName().equals(ColorsToJEasyPdf.NONE.getColorName())) {
                contentStreamEmptyRect(contentStream);

            } else {
                contentStreamFillRect(rectSettings, contentStream);
            }

            if (rectSettings.isBorder()) {
                contentStreamBorderRect(rectSettings, contentStream);
            }
        }
    }

    private void drawTemplateTitle(PDPageContentStream contentStream) {
        try {

            int offsetYAdjustA4 = 0;
            if (this.jeasyPdfPage.getPageSize().name().contains("A4")) {
                offsetYAdjustA4 = OFFSET_Y_ADJUST_A4;
            }

            this.jeasyPdfPage.setFontSize(FontSizeToJEasyPdf.LARGE);
            this.jeasyPdfPage.setFontName(FontNameToJEasyPdf.HELVETICA_BI);
            this.jeasyPdfPage.setFontColor(ColorsToJEasyPdf.LIGHT_GRAY);

            this.jeasyPdfPage.setOffsetX(50);
            this.jeasyPdfPage.setOffsetY(700+(offsetYAdjustA4));

            contentStreamText("Slim", this.jeasyPdfPage, contentStream);

        } catch (Exception ioe) {
            throw new RuntimeException(ioe.getMessage());
        }
    }

    private void drawBackground(
            PDDocument document,
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        if (settings.getImageBackground() == null) return;

        try {

            contentStreamImage(
                    settings.getImageBackground(),
                    this.jeasyPdfPage.getPageWidth(settings.getPage().getPageSize().name()),
                    this.jeasyPdfPage.getPageHeight(settings.getPage().getPageSize().name()),
                    0,
                    0,
                    document,
                    contentStream);

        } catch (Exception ioe) {
            throw new RuntimeException(ioe.getMessage());
        }
    }

    private void slimContainerBackgroundCreate(
            PDDocument document,
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        drawBackground(document, settings, contentStream);
    }

    private void slimContainerCreate(
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        drawContainer(settings, contentStream);

        if (settings.getSlim().templateTitleEnabled) {
            drawTemplateTitle(contentStream);
        }
    }

    private void slimContainerTitleCreate(
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        SlimTemplateSettings slimSettings = new SlimTemplateSettings();
        SlimDataContent slimData = settings.getSlimContent();

        if (settings.getSlim() != null) {
            slimSettings = settings.getSlim();
        }

        for (int n = 0; n < BOX_QUANTITY; n++) {

            //Left Title
            if (slimSettings.leftTitleEnable[n]) {
                this.jeasyPdfPage.setOffsetX(slimSettings.titleOffsetX[0]+(slimSettings.leftTitleAdjustmentX));
                this.jeasyPdfPage.setOffsetY(slimSettings.titleOffsetY[n]+(slimSettings.leftTitleAdjustmentY));

                this.jeasyPdfPage.setFontColor(slimSettings.getLeftTitleColor());
                this.jeasyPdfPage.setFontName(slimSettings.getLeftTitleFont());
                this.jeasyPdfPage.setFontSize(slimSettings.getLeftTitleSize());

                String title = slimData.getLeftTitleContent();
                titleBuild(title, this.jeasyPdfPage, contentStream);
            }

            //Center Title
            if (slimSettings.centerTitleEnable[n]) {
                this.jeasyPdfPage.setOffsetX(slimSettings.titleOffsetX[1]+(slimSettings.centerTitleAdjustmentX));
                this.jeasyPdfPage.setOffsetY(slimSettings.titleOffsetY[n]+(slimSettings.centerTitleAdjustmentY));

                this.jeasyPdfPage.setFontColor(slimSettings.getCenterTitleColor());
                this.jeasyPdfPage.setFontName(slimSettings.getCenterTitleFont());
                this.jeasyPdfPage.setFontSize(slimSettings.getCenterTitleSize());

                String title = slimData.getCenterTitleContent();
                titleBuild(title, this.jeasyPdfPage, contentStream);
            }

            //Right Title
            if (slimSettings.rightTitleEnable[n]) {
                this.jeasyPdfPage.setOffsetX(slimSettings.titleOffsetX[2]+(slimSettings.rightTitleAdjustmentX));
                this.jeasyPdfPage.setOffsetY(slimSettings.titleOffsetY[n]+(slimSettings.rightTitleAdjustmentY));

                this.jeasyPdfPage.setFontColor(slimSettings.getRightTitleColor());
                this.jeasyPdfPage.setFontName(slimSettings.getRightTitleFont());
                this.jeasyPdfPage.setFontSize(slimSettings.getRightTitleSize());

                String title = slimData.getRightTitleContent();
                titleBuild(title, this.jeasyPdfPage, contentStream);
            }

        }

        //Reset Color
        this.jeasyPdfPage.setPageColor(ColorsToJEasyPdf.WHITE);
        this.jeasyPdfPage.setFontColor(ColorsToJEasyPdf.BLACK);

    }

    private void slimContainerColumnCreate(
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        SlimTemplateSettings slimSettings = new SlimTemplateSettings();

        if (settings.getSlim() != null) {
            slimSettings = settings.getSlim();
        }

        for (int box = 0; box < BOX_QUANTITY; box++) {
            columnBoxBuild(box, slimSettings, contentStream);
        }
    }

    private void slimContainerColumnContentCreate(
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        /*
         * [NOTE]
         * In the below looping "for" the flow it will be executed running the number of BOX_QUANTITY(5) for the
         * SLIM template jumping from 3 on 3 item inside one box, it means that the loop it will be executed five times
         * running in each box that could be 3x1=3boxes, 3x2=6boxes, 3x3=9boxes, 3x4=12boxes or 3x5=15boxes.
         * Another point is that even though the boxes are jumped from 3 on 3, each one can be hidden by informing
         * the border=false, and in this case it will not show in the pdf document because there is one flag checker
         * in this code flow.
         * */
        for (int box = 0; box < BOX_QUANTITY; box++) {

            List<String[]> listLines = new ArrayList<>();

            if (settings.getSlimContent().getColumnContent().get(box*3) != null) {
                listLines.add(settings.getSlimContent().getColumnContent().get(box * 3)
                        .replaceAll("\n", "")
                        .replaceAll("\r", "")
                        .split("(?<=\\G.{" + settings.getSlim().columnBoxChars + "})"));
            }

            if (settings.getSlimContent().getColumnContent().get(box*3+1) != null) {
                listLines.add(settings.getSlimContent().getColumnContent().get(box * 3 + 1)
                        .replaceAll("\n", "")
                        .replaceAll("\r", "")
                        .split("(?<=\\G.{" + settings.getSlim().columnBoxChars + "})"));
            }

            if (settings.getSlimContent().getColumnContent().get(box*3+2) != null) {
                listLines.add(settings.getSlimContent().getColumnContent().get(box * 3 + 2)
                        .replaceAll("\n", "")
                        .replaceAll("\r", "")
                        .split("(?<=\\G.{" + settings.getSlim().columnBoxChars + "})"));
            }

            columnContentBuild(box, listLines, settings, contentStream);
        }
    }

    private void slimContainerTableCreate(
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        SlimTemplateSettings slimSettings = new SlimTemplateSettings();

        if (settings.getSlim() != null) {
            slimSettings = settings.getSlim();
        }

        for (int box = 0; box < BOX_QUANTITY; box++) {

            if (slimSettings.tableEnable[box]) {

                tableContainerBuild(box, slimSettings, contentStream);

                for (int col = 0; col < slimSettings.getTableSize().getTableColumns(); col++) {
                    tableHeaderBuild(box, col, slimSettings, contentStream);
                }

                /*Auto Fix: Prevent incorrect settings*/
                int swapHeight = slimSettings.tableColumnHeight;
                slimSettings.tableDataOffsetY[box] = correctTableOffsetY(box, 54, slimSettings);
                slimSettings.tableColumnHeight = correctTableHeight(slimSettings);

                int initialX = slimSettings.tableOffsetX;
                int initialY = slimSettings.tableDataOffsetY[box];
                int celWidth = slimSettings.tableColumnWidth;
                int celHeight = slimSettings.tableColumnHeight;

                //tableLines-1: to remove the first line (because was used in the table header)
                int tableLines = slimSettings.getTableSize().getTableLines()-1;
                int tableColumns = slimSettings.getTableSize().getTableColumns();

                for (int row = 0; row < tableLines; row++) {

                    for (int col = 0; col < tableColumns; col++) {
                        tableBodyBuild(initialX, initialY, celWidth, celHeight, slimSettings, contentStream);
                        initialX += celWidth; //move to the next column
                    }

                    initialX = slimSettings.tableOffsetX; //reset offset-x position
                    initialY -= celHeight; //move to the next line
                }

                slimSettings.tableColumnHeight = swapHeight;
            }
        }
    }

    private void slimContainerTableContentCreate(
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        SlimTemplateSettings slimSettings = new SlimTemplateSettings();

        if (settings.getSlim() != null) {
            slimSettings = settings.getSlim();
        }

        for (int box = 0; box < BOX_QUANTITY; box++) {

            if (slimSettings.tableEnable[box]) {

                for (int col = 0; col < slimSettings.getTableSize().getTableColumns(); col++) {
                    tableHeaderContentBuild(box, col, settings, contentStream);
                }

                //tableLines-1: to remove the first line (because was used in the table header)
                int tableLines = slimSettings.getTableSize().getTableLines()-1;

                List<String> contentList = settings.getSlimContent().getTableBodyContent().get(box);
                int loopSize = settings.getSlimContent().getTableBodyContent().get(box).size()/tableLines;

                int contLoop = 0;
                int adjustY = 0;
                for (String content : contentList) {
                    if (contLoop == loopSize) {
                        contLoop = 0;
                        adjustY += slimSettings.tableColumnHeight;
                    }
                    tableBodyContentBuild(box, contLoop, adjustY, content, settings, contentStream);
                    contLoop++;
                }
            }
        }
    }

    private void slimContainerImageCreate(
            PDDocument document,
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        SlimTemplateSettings slimSettings = new SlimTemplateSettings();
        SlimDataContent slimData = settings.getSlimContent();

        if (settings.getSlim() != null) {
            slimSettings = settings.getSlim();
        }

        JEasyPdfImage imgSettings = settings.getImage();

        for (int n = 0; n < BOX_QUANTITY; n++) {

            String imgLeft = slimData.leftImagePaths[n];
            String imgCenter = slimData.centerImagePaths[n];
            String imgRight = slimData.rightImagePaths[n];

            imgSettings.setWidth(slimSettings.imageWidth);
            imgSettings.setHeight(slimSettings.imageHeight);

            //Image Left
            if (slimSettings.leftImageEnable[n] && imgLeft != null && !imgLeft.isEmpty()) {
                imgSettings.setOffsetX(slimSettings.imageOffsetX[0]+(slimSettings.imageAdjustOffsetX));
                imgSettings.setOffsetY(slimSettings.imageOffsetY[n]+(slimSettings.imageAdjustOffsetY));
                imgSettings.setFilenamePath(imgLeft);
                imageBuild(document, imgSettings, contentStream);
            }

            //Image Center
            if (slimSettings.centerImageEnable[n] && imgCenter != null && !imgCenter.isEmpty()) {
                imgSettings.setOffsetX(slimSettings.imageOffsetX[1]+(slimSettings.imageAdjustOffsetX));
                imgSettings.setOffsetY(slimSettings.imageOffsetY[n]+(slimSettings.imageAdjustOffsetY));
                imgSettings.setFilenamePath(imgCenter);
                imageBuild(document, imgSettings, contentStream);
            }

            //Image Right
            if (slimSettings.rightImageEnable[n] && imgRight != null && !imgRight.isEmpty()) {
                imgSettings.setOffsetX(slimSettings.imageOffsetX[2]+(slimSettings.imageAdjustOffsetX));
                imgSettings.setOffsetY(slimSettings.imageOffsetY[n]+(slimSettings.imageAdjustOffsetY));
                imgSettings.setFilenamePath(imgRight);
                imageBuild(document, imgSettings, contentStream);
            }
        }
    }

    private void slimContainerSignatureCreate(
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        SlimTemplateSettings slimSettings = new SlimTemplateSettings();
        SlimDataContent slimData = settings.getSlimContent();

        if (settings.getSlim() != null) {
            slimSettings = settings.getSlim();
        }

        //Left Signature
        if (slimSettings.isLeftSignatureBoxEnable()) {
            signatureBoxBuild(0, this.jeasyPdfPage, slimSettings, slimData, contentStream);
        }

        //Center Signature
        if (slimSettings.isCenterSignatureBoxEnable()) {
            signatureBoxBuild(1, this.jeasyPdfPage, slimSettings, slimData, contentStream);
        }

        //Right Signature
        if (slimSettings.isRightSignatureBoxEnable()) {
            signatureBoxBuild(2, this.jeasyPdfPage, slimSettings, slimData, contentStream);
        }
    }

    private void slimContainerSignatureTapeCreate(
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        SlimTemplateSettings slimSettings = new SlimTemplateSettings();
        SlimDataContent slimData = settings.getSlimContent();

        if (settings.getSlim() != null) {
            slimSettings = settings.getSlim();
        }

        JEasyPdfContainer rectSettings = settings.getContainer();

        if (slimSettings.isSignatureTapeEnable()) {
            signatureTapeBuild(this.jeasyPdfPage, slimSettings, slimData, contentStream);
        }
    }

    private void slimContainerTextCreate(
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        SlimTemplateSettings slimSettings = new SlimTemplateSettings();

        if (settings.getSlim() != null) {
            slimSettings = settings.getSlim();
        }

        this.jeasyPdfPage.setOffsetX(slimSettings.textOffsetX);
        this.jeasyPdfPage.setFontColor(slimSettings.getTextColor());
        this.jeasyPdfPage.setFontName(slimSettings.getTextFont());
        this.jeasyPdfPage.setFontSize(slimSettings.getTextSize());
        this.jeasyPdfPage.setLineHeight(slimSettings.lineHeight);

        List<String[]> listLines = new ArrayList<>();

        for (int box = 0; box < BOX_QUANTITY; box++) {

            if (slimSettings.textEnable[box] && settings.getSlimContent().getTextContent().get(box) != null) {

                listLines.add(settings.getSlimContent().getTextContent().get(box)
                        .replaceAll("\n", " ")
                        .replaceAll("\r", " ")
                        .split("(?<=\\G.{" + settings.getSlim().textChars + "})"));

                this.jeasyPdfPage.setOffsetY(slimSettings.textOffsetY[box]);
                textBuild(box, listLines, slimSettings, this.jeasyPdfPage, contentStream);

            } else {
                listLines.add(new String[]{});
            }
        }
    }

    private void slimContainerBarcodeCreate(
            PDDocument document,
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        for (int box = 0; box < BOX_QUANTITY; box++) {

            if (settings.getSlim().barcodeEnabled[box]) {

                String value = settings.getSlimContent().getBarcodeValue().get(box);

                if (value != null && !value.isEmpty()) {

                    int offsetY = settings.getSlim().barcodeOffsetY[box]+(settings.getSlim().barcodeAdjustOffsetY);

                    settings.getBarcode().setData(value);
                    settings.getBarcode().setOffsetX(barcodeOffsetX+(settings.getSlim().barcodeAdjustOffsetX));
                    settings.getBarcode().setOffsetY(offsetY);

                    settings.getBarcode().setWidth(settings.getSlim().barcodeWidth);
                    settings.getBarcode().setHeight(settings.getSlim().barcodeHeight);

                    if (!settings.getSlim().barcodeShowText) {
                        settings.getBarcode().setTextPosition(HumanReadablePlacement.HRP_NONE);
                    }

                    barcodeBuild(document, settings.getBarcode(), contentStream);
                    barcodeInfoBuild(box, settings.getPage(), settings, contentStream);
                }
            }
        }
    }

    private void slimContainerQrCodeCreate(
            PDDocument document,
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        for (int box = 0; box < BOX_QUANTITY; box++) {

            //Left
            if (settings.getSlim().qrCodeLeftEnable[box]) {
                settings.getQrCode().setOffsetX(settings.getSlim().qrCodeOffsetX[0]+(settings.getSlim().qrCodeAdjustOffsetX));
                settings.getQrCode().setOffsetY(settings.getSlim().qrCodeOffsetY[box]+(settings.getSlim().qrCodeAdjustOffsetY));
                settings.getQrCode().setData(settings.getSlimContent().getQrCodeValue().get(box*3));
                qrCodeBuild(document, settings.getQrCode(), contentStream);
                qrCodeInfoBuild(box, settings.getPage(), settings, contentStream);
            }

            //Center
            if (settings.getSlim().qrCodeCenterEnable[box]) {
                settings.getQrCode().setOffsetX(settings.getSlim().qrCodeOffsetX[1]+(settings.getSlim().qrCodeAdjustOffsetX));
                settings.getQrCode().setOffsetY(settings.getSlim().qrCodeOffsetY[box]+(settings.getSlim().qrCodeAdjustOffsetY));
                settings.getQrCode().setData(settings.getSlimContent().getQrCodeValue().get(box*3+1));
                qrCodeBuild(document, settings.getQrCode(), contentStream);
                qrCodeInfoBuild(box, settings.getPage(), settings, contentStream);
            }

            //Right
            if (settings.getSlim().qrCodeRightEnable[box]) {
                settings.getQrCode().setOffsetX(settings.getSlim().qrCodeOffsetX[2]+(settings.getSlim().qrCodeAdjustOffsetX));
                settings.getQrCode().setOffsetY(settings.getSlim().qrCodeOffsetY[box]+(settings.getSlim().qrCodeAdjustOffsetY));
                settings.getQrCode().setData(settings.getSlimContent().getQrCodeValue().get(box*3+2));
                qrCodeBuild(document, settings.getQrCode(), contentStream);
                qrCodeInfoBuild(box, settings.getPage(), settings, contentStream);
            }
        }
    }

    public void slimTemplateBuilder(
            PDDocument document,
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        this.jeasyPdfPage = settings.getPage();
        slimContainerBackgroundCreate(document, settings, contentStream);
        slimContainerCreate(settings, contentStream);
        slimContainerTitleCreate(settings, contentStream);
        slimContainerColumnCreate(settings, contentStream);
        slimContainerTableCreate(settings, contentStream);
        slimContainerImageCreate(document, settings, contentStream);
        /*NOTE: Text/Content should be in the final of the process*/
        slimContainerColumnContentCreate(settings, contentStream);
        slimContainerTableContentCreate(settings, contentStream);
        slimContainerTextCreate(settings, contentStream);
        slimContainerSignatureCreate(settings, contentStream);
        slimContainerSignatureTapeCreate(settings, contentStream);
        slimContainerBarcodeCreate(document, settings, contentStream);
        slimContainerQrCodeCreate(document, settings, contentStream);
    }

}

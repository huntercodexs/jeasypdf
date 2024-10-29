package com.huntercodexs.jeasypdf.template;

import com.huntercodexs.jeasypdf.core.dto.JEasyPdfContainer;
import com.huntercodexs.jeasypdf.core.dto.JEasyPdfPage;
import com.huntercodexs.jeasypdf.core.enumerator.ColorsToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.FontNameToJEasyPdf;
import com.huntercodexs.jeasypdf.core.enumerator.FontSizeToJEasyPdf;
import com.huntercodexs.jeasypdf.template.setting.JEasyPdfTemplateSettings;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPageContentStream;

import static com.huntercodexs.jeasypdf.core.dto.JEasyPdfPage.OFFSET_Y_ADJUST_A4;
import static com.huntercodexs.jeasypdf.template.setting.triplefall.TripleFallTemplateSettings.*;

/**
 * This class use as "pdfbox 2.0.0" from org.apache.pdfbox base process to PDF files handler
 *
 * @author huntercodexs (powered by jereelton-devel)
 * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
 * */
public class JEasyPdfTripleFallTemplate extends JEasyPdfBuilderTemplate {

    private JEasyPdfPage jeasyPdfPage;

    private void drawContainer(
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        JEasyPdfContainer rectSettings = settings.getContainer();
        rectSettings.setWidth(TRIPLE_FALL_DEFAULT_WIDTH);
        rectSettings.setHeight(TRIPLE_FALL_DEFAULT_HEIGHT);

        rectSettings.setOffsetY(20);

        int widthAdjustA4 = 0;
        int offsetXAdjustA4Col1 = 0;
        int offsetXAdjustA4Col2 = 0;
        int offsetXAdjustA4Col3 = 0;
        int offsetYAdjustA4 = 0;

        if (this.jeasyPdfPage.getPageSize().name().contains("A4")) {
            widthAdjustA4 = -7;
            offsetXAdjustA4Col1 = 1;
            offsetXAdjustA4Col2 = -7;
            offsetXAdjustA4Col3 = -14;
            offsetYAdjustA4 = OFFSET_Y_ADJUST_A4;
        }

        rectSettings.setWidth(TRIPLE_FALL_DEFAULT_WIDTH+(widthAdjustA4));
        rectSettings.setOffsetY(20+(offsetYAdjustA4));

        for (int rows = 1; rows <= TRIPLE_FALL_QUANTITY; rows++) {

            if (rows == 1) {
                rectSettings.setOffsetX(20+(offsetXAdjustA4Col1));
            } else if (rows == 2) {
                rectSettings.setOffsetX(213+(offsetXAdjustA4Col2));
            } else {
                rectSettings.setOffsetX(405+(offsetXAdjustA4Col3));
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

            contentStreamText("Triple Fall", this.jeasyPdfPage, contentStream);

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

    private void tripleFallContainerBackgroundCreate(
            PDDocument document,
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        drawBackground(document, settings, contentStream);
    }

    private void tripleFallContainerCreate(
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {

        drawContainer(settings, contentStream);

        if (settings.getTripleFall().templateTitleEnabled) {
            drawTemplateTitle(contentStream);
        }
    }

    public void tripleFallTemplateBuilder(
            PDDocument document,
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        this.jeasyPdfPage = settings.getPage();
        tripleFallContainerBackgroundCreate(document, settings, contentStream);
        tripleFallContainerCreate(settings, contentStream);
    }

}

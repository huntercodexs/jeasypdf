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
import static com.huntercodexs.jeasypdf.template.setting.box.BoxTemplateSettings.*;

/**
 * This class use as "pdfbox 2.0.0" from org.apache.pdfbox base process to PDF files handler
 *
 * @author huntercodexs (powered by jereelton-devel)
 * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
 * */
public class JEasyPdfBoxTemplate extends JEasyPdfBuilderTemplate {

    private JEasyPdfPage jeasyPdfPage;

    private void drawContainer(
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        JEasyPdfContainer rectSettings = settings.getContainer();
        rectSettings.setWidth(BOX_DEFAULT_WIDTH);
        rectSettings.setHeight(BOX_DEFAULT_HEIGHT);

        int widthAdjustA4 = 0;
        int offsetXAdjustA4 = 0;
        int offsetYAdjustA4 = 0;
        if (this.jeasyPdfPage.getPageSize().name().contains("A4")) {
            widthAdjustA4 = -10;
            offsetXAdjustA4 = -10;
            offsetYAdjustA4 = OFFSET_Y_ADJUST_A4;
        }

        rectSettings.setWidth(BOX_DEFAULT_WIDTH+(widthAdjustA4));

        for (int rows = 1; rows <= BOXES/2; rows++) {

            if (rows == 1) {
                rectSettings.setOffsetY(640+(offsetYAdjustA4));
            } else if (rows == 2) {
                rectSettings.setOffsetY(485+(offsetYAdjustA4));
            } else if (rows == 3) {
                rectSettings.setOffsetY(330+(offsetYAdjustA4));
            } else if (rows == 4) {
                rectSettings.setOffsetY(175+(offsetYAdjustA4));
            } else {
                rectSettings.setOffsetY(20+(offsetYAdjustA4));
            }

            for (int cols = 1; cols <= BOXES/5; cols++) {

                if (cols == 1) {
                    rectSettings.setOffsetX(20);
                } else {
                    rectSettings.setOffsetX(308+(offsetXAdjustA4));
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

            contentStreamText("Box", this.jeasyPdfPage, contentStream);

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

    private void boxContainerBackgroundCreate(
            PDDocument document,
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        drawBackground(document, settings, contentStream);
    }

    private void boxContainerCreate(
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        drawContainer(settings, contentStream);

        if (settings.getBox().isTemplateTitleEnabled()) {
            drawTemplateTitle(contentStream);
        }
    }

    public void boxTemplateBuilder(
            PDDocument document,
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        this.jeasyPdfPage = settings.getPage();
        boxContainerBackgroundCreate(document, settings, contentStream);
        boxContainerCreate(settings, contentStream);
    }

}

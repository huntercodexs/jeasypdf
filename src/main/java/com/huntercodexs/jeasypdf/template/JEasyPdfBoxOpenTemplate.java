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
import static com.huntercodexs.jeasypdf.template.setting.boxopen.BoxOpenTemplateSettings.*;
import static com.huntercodexs.jeasypdf.template.setting.slimbox.SlimBoxTemplateSettings.SLIM_BOX_DEFAULT_WIDTH;

/**
 * @author huntercodexs (powered by jereelton-devel)
 * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
 * @implNote This class use as "pdfbox 2.0.0" from org.apache.pdfbox base process to PDF files handler
 * */
public class JEasyPdfBoxOpenTemplate extends JEasyPdfBuilderTemplate {

    private JEasyPdfPage jeasyPdfPage;

    private void drawContainer(
            JEasyPdfContainer rectSettings,
            PDPageContentStream contentStream
    ) {
        rectSettings.setWidth(BOX_OPEN_DEFAULT_WIDTH);
        rectSettings.setHeight(BOX_OPEN_DEFAULT_HEIGHT);

        int widthAdjustA4 = 0;
        int offsetXAdjustA4 = 0;
        int offsetYAdjustA4 = 0;
        if (this.jeasyPdfPage.getPageSize().name().contains("A4")) {
            widthAdjustA4 = -10;
            offsetXAdjustA4 = -10;
            offsetYAdjustA4 = OFFSET_Y_ADJUST_A4;
        }

        rectSettings.setWidth(SLIM_BOX_DEFAULT_WIDTH+(widthAdjustA4));

        for (int rows = 1; rows <= BOX_OPEN_QUANTITY/2; rows++) {

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

            for (int cols = 1; cols <= BOX_OPEN_QUANTITY/5; cols++) {

                if (cols == 1) {
                    rectSettings.setOffsetX(20);
                } else {
                    rectSettings.setOffsetX(308+(offsetXAdjustA4));
                }

                if (cols == 2 && (rows == 2 || rows == 3)) {
                    continue;
                }

                if (cols == 2 && rows == 4) {
                    rectSettings.setHeight(BOX_OPEN_HEIGHT);
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

                rectSettings.setHeight(BOX_OPEN_DEFAULT_HEIGHT);
                rectSettings.setWidth(BOX_OPEN_DEFAULT_WIDTH+(widthAdjustA4));
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

            contentStreamText("Box Open", this.jeasyPdfPage, contentStream);

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

    private void boxOpenContainerBackgroundCreate(
            PDDocument document,
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        drawBackground(document, settings, contentStream);
    }

    private void boxOpenContainerCreate(
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        JEasyPdfContainer rectSettings = settings.getContainer();
        rectSettings.setWidth(BOX_OPEN_DEFAULT_WIDTH);
        rectSettings.setHeight(BOX_OPEN_DEFAULT_HEIGHT);

        drawContainer(rectSettings, contentStream);

        if (settings.getBoxOpen().isTemplateTitleEnabled()) {
            drawTemplateTitle(contentStream);
        }
    }

    public void boxOpenTemplateBuilder(
            PDDocument document,
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        this.jeasyPdfPage = settings.getPage();
        boxOpenContainerBackgroundCreate(document, settings, contentStream);
        boxOpenContainerCreate(settings, contentStream);
    }

}

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
import static com.huntercodexs.jeasypdf.core.dto.JEasyPdfPage.WIDTH_ADJUST_A4;
import static com.huntercodexs.jeasypdf.template.setting.headerbody.HeaderBodyTemplateSettings.*;

/**
 * @author huntercodexs (powered by jereelton-devel)
 * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
 * @implNote This class use as "pdfbox 2.0.0" from org.apache.pdfbox base process to PDF files handler
 * */
public class JEasyPdfHeaderBodyTemplate extends JEasyPdfBuilderTemplate {

    private JEasyPdfPage jeasyPdfPage;

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

        rectSettings.setWidth(HEADER_BODY_DEFAULT_WIDTH+(widthAdjustA4));
        rectSettings.setHeight(HEADER_BODY_DEFAULT_HEIGHT);

        /*Header*/
        rectSettings.setOffsetX(HEADER_BODY_DEFAULT_OFFSET_X);
        rectSettings.setOffsetY(HEADER_BODY_DEFAULT_OFFSET_Y+(offsetYAdjustA4));

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

        /*Body*/
        rectSettings.setHeight(HEADER_BODY_HEIGHT);
        rectSettings.setOffsetY(HEADER_BODY_OFFSET_Y+(offsetYAdjustA4));

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

            contentStreamText("Header Body", this.jeasyPdfPage, contentStream);

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

    private void headerBodyContainerBackgroundCreate(
            PDDocument document,
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        drawBackground(document, settings, contentStream);
    }

    private void headerBodyContainerCreate(
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {

        drawContainer(settings, contentStream);

        if (settings.getHeaderBody().templateTitleEnabled) {
            drawTemplateTitle(contentStream);
        }
    }

    public void headerBodyTemplateBuilder(
            PDDocument document,
            JEasyPdfTemplateSettings settings,
            PDPageContentStream contentStream
    ) {
        this.jeasyPdfPage = settings.getPage();
        headerBodyContainerBackgroundCreate(document, settings, contentStream);
        headerBodyContainerCreate(settings, contentStream);
    }

}

package com.huntercodexs.jeasypdf.template;

import com.huntercodexs.jeasypdf.JEasyPdf;
import com.huntercodexs.jeasypdf.core.JEasyPdfCore;
import com.huntercodexs.jeasypdf.core.enumerator.JEasyPdfTemplates;
import com.huntercodexs.jeasypdf.template.setting.JEasyPdfTemplateSettings;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;

import java.io.File;
import java.io.IOException;

import static com.huntercodexs.jeasypdf.core.enumerator.JEasyPdfTemplates.template;

/**
 * This class use as "pdfbox 2.0.0" from org.apache.pdfbox base process to PDF files handler
 *
 * @author huntercodexs (powered by jereelton-devel)
 * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
 * */
public class JEasyPdfTemplate extends JEasyPdfCore {

    private final JEasyPdf jEasyPdf;

    public JEasyPdfTemplate() {
        this.jEasyPdf = new JEasyPdf();
    }

    /**
     * <p style="color: #FFFF00; font-size: 11px">easyPdfTemplateSlim</p>
     *
     * <p style="color: #CDCDCD">Create a template file for PDF media types using Slim Template</p>
     *
     * @param settings (EasyPdfTemplateSettings: All template settings)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void easyPdfTemplateSlim(JEasyPdfTemplateSettings settings) {

        if (!settings.getTemplate().name().equals(template(JEasyPdfTemplates.SLIM))) {
            throw new RuntimeException("Invalid Template: Expected SLIM");
        }

        this.jEasyPdf.pdfCreate(settings.getDocument(), settings.getPage());

        File file = new File(settings.getDocument().getFilenamePath());

        try (PDDocument document = PDDocument.load(file, settings.getDocument().getOwnerPassword())) {

            PDPage page = document.getPage(settings.getPage().getPageNumber()-1);

            PDPageContentStream contentStream = contentStreamInit(page, document, null);

            JEasyPdfSlimTemplate template = new JEasyPdfSlimTemplate();
            template.slimTemplateBuilder(document, settings, contentStream);

            contentStream.close();
            document.save(settings.getDocument().getFilenamePath());
            document.close();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

    /**
     * <p style="color: #FFFF00; font-size: 11px">easyPdfTemplateBox</p>
     *
     * <p style="color: #CDCDCD">Create a template file for PDF media types using Box Template</p>
     *
     * @param settings (EasyPdfTemplateSettings: All template settings)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void easyPdfTemplateBox(JEasyPdfTemplateSettings settings) {

        if (!settings.getTemplate().name().equals(template(JEasyPdfTemplates.BOX))) {
            throw new RuntimeException("Invalid Template: Expected BOX");
        }

        this.jEasyPdf.pdfCreate(settings.getDocument(), settings.getPage());

        File file = new File(settings.getDocument().getFilenamePath());

        try (PDDocument document = PDDocument.load(file, settings.getDocument().getOwnerPassword())) {

            PDPage page = document.getPage(settings.getPage().getPageNumber()-1);

            PDPageContentStream contentStream = contentStreamInit(page, document, null);

            JEasyPdfBoxTemplate template = new JEasyPdfBoxTemplate();
            template.boxTemplateBuilder(document, settings, contentStream);

            contentStream.close();
            document.save(settings.getDocument().getFilenamePath());
            document.close();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

    /**
     * <p style="color: #FFFF00; font-size: 11px">easyPdfTemplateBoxOpen</p>
     *
     * <p style="color: #CDCDCD">Create a template file for PDF media types using Box Open Template</p>
     *
     * @param settings (EasyPdfTemplateSettings: All template settings)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void easyPdfTemplateBoxOpen(JEasyPdfTemplateSettings settings) {

        if (!settings.getTemplate().name().equals(template(JEasyPdfTemplates.BOX_OPEN))) {
            throw new RuntimeException("Invalid Template: Expected BOX_OPEN");
        }

        this.jEasyPdf.pdfCreate(settings.getDocument(), settings.getPage());

        File file = new File(settings.getDocument().getFilenamePath());

        try (PDDocument document = PDDocument.load(file, settings.getDocument().getOwnerPassword())) {

            PDPage page = document.getPage(settings.getPage().getPageNumber()-1);

            PDPageContentStream contentStream = contentStreamInit(page, document, null);

            JEasyPdfBoxOpenTemplate template = new JEasyPdfBoxOpenTemplate();
            template.boxOpenTemplateBuilder(document, settings, contentStream);

            contentStream.close();
            document.save(settings.getDocument().getFilenamePath());
            document.close();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

    /**
     * <p style="color: #FFFF00; font-size: 11px">easyPdfTemplateSlimBox</p>
     *
     * <p style="color: #CDCDCD">Create a template file for PDF media types using Slim Box Template</p>
     *
     * @param settings (EasyPdfTemplateSettings: All template settings)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void easyPdfTemplateSlimBox(JEasyPdfTemplateSettings settings) {

        if (!settings.getTemplate().name().equals(template(JEasyPdfTemplates.SLIM_BOX))) {
            throw new RuntimeException("Invalid Template: Expected SLIM_BOX");
        }

        this.jEasyPdf.pdfCreate(settings.getDocument(), settings.getPage());

        File file = new File(settings.getDocument().getFilenamePath());

        try (PDDocument document = PDDocument.load(file, settings.getDocument().getOwnerPassword())) {

            PDPage page = document.getPage(settings.getPage().getPageNumber()-1);

            PDPageContentStream contentStream = contentStreamInit(page, document, null);

            JEasyPdfSlimBoxTemplate template = new JEasyPdfSlimBoxTemplate();
            template.slimBoxTemplateBuilder(document, settings, contentStream);

            contentStream.close();
            document.save(settings.getDocument().getFilenamePath());
            document.close();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

    /**
     * <p style="color: #FFFF00; font-size: 11px">easyPdfTemplateTripleFall</p>
     *
     * <p style="color: #CDCDCD">Create a template file for PDF media types using Triple Fall Template</p>
     *
     * @param settings (EasyPdfTemplateSettings: All template settings)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void easyPdfTemplateTripleFall(JEasyPdfTemplateSettings settings) {

        if (!settings.getTemplate().name().equals(template(JEasyPdfTemplates.TRIPLE_FALL))) {
            throw new RuntimeException("Invalid Template: Expected TRIPLE_FALL");
        }

        this.jEasyPdf.pdfCreate(settings.getDocument(), settings.getPage());

        File file = new File(settings.getDocument().getFilenamePath());

        try (PDDocument document = PDDocument.load(file, settings.getDocument().getOwnerPassword())) {

            PDPage page = document.getPage(settings.getPage().getPageNumber()-1);

            PDPageContentStream contentStream = contentStreamInit(page, document, null);

            JEasyPdfTripleFallTemplate template = new JEasyPdfTripleFallTemplate();
            template.tripleFallTemplateBuilder(document, settings, contentStream);

            contentStream.close();
            document.save(settings.getDocument().getFilenamePath());
            document.close();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

    /**
     * <p style="color: #FFFF00; font-size: 11px">easyPdfTemplateFree</p>
     *
     * <p style="color: #CDCDCD">Create a template file for PDF media types using Free Template</p>
     *
     * @param settings (EasyPdfTemplateSettings: All template settings)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void easyPdfTemplateFree(JEasyPdfTemplateSettings settings) {

        if (!settings.getTemplate().name().equals(template(JEasyPdfTemplates.FREE))) {
            throw new RuntimeException("Invalid Template: Expected FREE");
        }

        this.jEasyPdf.pdfCreate(settings.getDocument(), settings.getPage());

        File file = new File(settings.getDocument().getFilenamePath());

        try (PDDocument document = PDDocument.load(file, settings.getDocument().getOwnerPassword())) {

            PDPage page = document.getPage(settings.getPage().getPageNumber()-1);

            PDPageContentStream contentStream = contentStreamInit(page, document, null);

            JEasyPdfFreeTemplate template = new JEasyPdfFreeTemplate();
            template.freeTemplateBuilder(document, settings, contentStream);

            contentStream.close();
            document.save(settings.getDocument().getFilenamePath());
            document.close();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

    /**
     * <p style="color: #FFFF00; font-size: 11px">easyPdfTemplateHeaderBody</p>
     *
     * <p style="color: #CDCDCD">Create a template file for PDF media types using HeaderBody Template</p>
     *
     * @param settings (EasyPdfTemplateSettings: All template settings)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void easyPdfTemplateHeaderBody(JEasyPdfTemplateSettings settings) {

        if (!settings.getTemplate().name().equals(template(JEasyPdfTemplates.HEADER_BODY))) {
            throw new RuntimeException("Invalid Template: Expected HEADER_BODY");
        }

        this.jEasyPdf.pdfCreate(settings.getDocument(), settings.getPage());

        File file = new File(settings.getDocument().getFilenamePath());

        try (PDDocument document = PDDocument.load(file, settings.getDocument().getOwnerPassword())) {

            PDPage page = document.getPage(settings.getPage().getPageNumber()-1);

            PDPageContentStream contentStream = contentStreamInit(page, document, null);

            JEasyPdfHeaderBodyTemplate template = new JEasyPdfHeaderBodyTemplate();
            template.headerBodyTemplateBuilder(document, settings, contentStream);

            contentStream.close();
            document.save(settings.getDocument().getFilenamePath());
            document.close();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

    /**
     * <p style="color: #FFFF00; font-size: 11px">easyPdfTemplateBigBurger</p>
     *
     * <p style="color: #CDCDCD">Create a template file for PDF media types using BigBurger Template</p>
     *
     * @param settings (EasyPdfTemplateSettings: All template settings)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void easyPdfTemplateBigBurger(JEasyPdfTemplateSettings settings) {

        if (!settings.getTemplate().name().equals(template(JEasyPdfTemplates.BIG_BURGER))) {
            throw new RuntimeException("Invalid Template: Expected BIG_BURGER");
        }

        this.jEasyPdf.pdfCreate(settings.getDocument(), settings.getPage());

        File file = new File(settings.getDocument().getFilenamePath());

        try (PDDocument document = PDDocument.load(file, settings.getDocument().getOwnerPassword())) {

            PDPage page = document.getPage(settings.getPage().getPageNumber()-1);

            PDPageContentStream contentStream = contentStreamInit(page, document, null);

            JEasyPdfBigBurgerTemplate template = new JEasyPdfBigBurgerTemplate();
            template.bigBurgerTemplateBuilder(document, settings, contentStream);

            contentStream.close();
            document.save(settings.getDocument().getFilenamePath());
            document.close();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }

    }

}

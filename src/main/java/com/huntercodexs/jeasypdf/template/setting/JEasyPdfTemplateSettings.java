package com.huntercodexs.jeasypdf.template.setting;

import com.huntercodexs.jeasypdf.core.dto.*;
import com.huntercodexs.jeasypdf.core.enumerator.JEasyPdfTemplates;
import com.huntercodexs.jeasypdf.template.setting.bigburger.BigBurgerDataContent;
import com.huntercodexs.jeasypdf.template.setting.bigburger.BigBurgerTemplateSettings;
import com.huntercodexs.jeasypdf.template.setting.box.BoxDataContent;
import com.huntercodexs.jeasypdf.template.setting.box.BoxTemplateSettings;
import com.huntercodexs.jeasypdf.template.setting.boxopen.BoxOpenDataContent;
import com.huntercodexs.jeasypdf.template.setting.boxopen.BoxOpenTemplateSettings;
import com.huntercodexs.jeasypdf.template.setting.free.FreeDataContent;
import com.huntercodexs.jeasypdf.template.setting.free.FreeTemplateSettings;
import com.huntercodexs.jeasypdf.template.setting.headerbody.HeaderBodyDataContent;
import com.huntercodexs.jeasypdf.template.setting.headerbody.HeaderBodyTemplateSettings;
import com.huntercodexs.jeasypdf.template.setting.slim.SlimDataContent;
import com.huntercodexs.jeasypdf.template.setting.slim.SlimTemplateSettings;
import com.huntercodexs.jeasypdf.template.setting.slimbox.SlimBoxDataContent;
import com.huntercodexs.jeasypdf.template.setting.slimbox.SlimBoxTemplateSettings;
import com.huntercodexs.jeasypdf.template.setting.triplefall.TripleFallDataContent;
import com.huntercodexs.jeasypdf.template.setting.triplefall.TripleFallTemplateSettings;

public class JEasyPdfTemplateSettings {
    /*Template Name*/
    public JEasyPdfTemplates template = null;

    /*Template Background*/
    public String imageBackground = null;

    /*Template Elements*/
    public JEasyPdfDocument document = null;
    public JEasyPdfPage page = null;
    public JEasyPdfContainer container = null;
    public JEasyPdfText text = null;
    public JEasyPdfImage image = null;
    public JEasyPdfTable table = null;
    public JEasyPdfBarcode barcode = null;
    public JEasyPdfQrCode qrCode = null;

    /*Template Behavior*/
    public SlimTemplateSettings slim = null;
    public BoxTemplateSettings box = null;
    public BoxOpenTemplateSettings boxOpen = null;
    public SlimBoxTemplateSettings slimBox = null;
    public TripleFallTemplateSettings tripleFall = null;
    public FreeTemplateSettings free = null;
    public HeaderBodyTemplateSettings headerBody = null;
    public BigBurgerTemplateSettings bigBurger = null;

    /*Template Content*/
    public SlimDataContent slimContent = null;
    public BoxDataContent boxContent = null;
    public BoxOpenDataContent boxOpenContent = null;
    public SlimBoxDataContent slimBoxContent = null;
    public TripleFallDataContent tripleFallContent = null;
    public FreeDataContent freeContent = null;
    public HeaderBodyDataContent headerBodyContent = null;
    public BigBurgerDataContent bigBurgerContent = null;

    public JEasyPdfTemplates getTemplate() {
        return template;
    }

    public void setTemplate(JEasyPdfTemplates template) {
        this.template = template;
    }

    public String getImageBackground() {
        return imageBackground;
    }

    public void setImageBackground(String imageBackground) {
        this.imageBackground = imageBackground;
    }

    public JEasyPdfDocument getDocument() {
        return document;
    }

    public void setDocument(JEasyPdfDocument document) {
        this.document = document;
    }

    public JEasyPdfPage getPage() {
        return page;
    }

    public void setPage(JEasyPdfPage page) {
        this.page = page;
    }

    public JEasyPdfContainer getContainer() {
        return container;
    }

    public void setContainer(JEasyPdfContainer container) {
        this.container = container;
    }

    public JEasyPdfText getText() {
        return text;
    }

    public void setText(JEasyPdfText text) {
        this.text = text;
    }

    public JEasyPdfImage getImage() {
        return image;
    }

    public void setImage(JEasyPdfImage image) {
        this.image = image;
    }

    public JEasyPdfTable getTable() {
        return table;
    }

    public void setTable(JEasyPdfTable table) {
        this.table = table;
    }

    public JEasyPdfBarcode getBarcode() {
        return barcode;
    }

    public void setBarcode(JEasyPdfBarcode barcode) {
        this.barcode = barcode;
    }

    public JEasyPdfQrCode getQrCode() {
        return qrCode;
    }

    public void setQrCode(JEasyPdfQrCode qrCode) {
        this.qrCode = qrCode;
    }

    public SlimTemplateSettings getSlim() {
        return slim;
    }

    public void setSlim(SlimTemplateSettings slim) {
        this.slim = slim;
    }

    public BoxTemplateSettings getBox() {
        return box;
    }

    public void setBox(BoxTemplateSettings box) {
        this.box = box;
    }

    public BoxOpenTemplateSettings getBoxOpen() {
        return boxOpen;
    }

    public void setBoxOpen(BoxOpenTemplateSettings boxOpen) {
        this.boxOpen = boxOpen;
    }

    public SlimBoxTemplateSettings getSlimBox() {
        return slimBox;
    }

    public void setSlimBox(SlimBoxTemplateSettings slimBox) {
        this.slimBox = slimBox;
    }

    public TripleFallTemplateSettings getTripleFall() {
        return tripleFall;
    }

    public void setTripleFall(TripleFallTemplateSettings tripleFall) {
        this.tripleFall = tripleFall;
    }

    public FreeTemplateSettings getFree() {
        return free;
    }

    public void setFree(FreeTemplateSettings free) {
        this.free = free;
    }

    public HeaderBodyTemplateSettings getHeaderBody() {
        return headerBody;
    }

    public void setHeaderBody(HeaderBodyTemplateSettings headerBody) {
        this.headerBody = headerBody;
    }

    public BigBurgerTemplateSettings getBigBurger() {
        return bigBurger;
    }

    public void setBigBurger(BigBurgerTemplateSettings bigBurger) {
        this.bigBurger = bigBurger;
    }

    public SlimDataContent getSlimContent() {
        return slimContent;
    }

    public void setSlimContent(SlimDataContent slimContent) {
        this.slimContent = slimContent;
    }

    public BoxDataContent getBoxContent() {
        return boxContent;
    }

    public void setBoxContent(BoxDataContent boxContent) {
        this.boxContent = boxContent;
    }

    public BoxOpenDataContent getBoxOpenContent() {
        return boxOpenContent;
    }

    public void setBoxOpenContent(BoxOpenDataContent boxOpenContent) {
        this.boxOpenContent = boxOpenContent;
    }

    public SlimBoxDataContent getSlimBoxContent() {
        return slimBoxContent;
    }

    public void setSlimBoxContent(SlimBoxDataContent slimBoxContent) {
        this.slimBoxContent = slimBoxContent;
    }

    public TripleFallDataContent getTripleFallContent() {
        return tripleFallContent;
    }

    public void setTripleFallContent(TripleFallDataContent tripleFallContent) {
        this.tripleFallContent = tripleFallContent;
    }

    public FreeDataContent getFreeContent() {
        return freeContent;
    }

    public void setFreeContent(FreeDataContent freeContent) {
        this.freeContent = freeContent;
    }

    public HeaderBodyDataContent getHeaderBodyContent() {
        return headerBodyContent;
    }

    public void setHeaderBodyContent(HeaderBodyDataContent headerBodyContent) {
        this.headerBodyContent = headerBodyContent;
    }

    public BigBurgerDataContent getBigBurgerContent() {
        return bigBurgerContent;
    }

    public void setBigBurgerContent(BigBurgerDataContent bigBurgerContent) {
        this.bigBurgerContent = bigBurgerContent;
    }
}

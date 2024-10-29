package com.huntercodexs.jeasypdf.core.enumerator;

import org.apache.pdfbox.pdmodel.common.PDRectangle;

public enum PageSizeToJEasyPdf {
    A4_LAYOUT(PDRectangle.A4),
    LETTER_LAYOUT(PDRectangle.LETTER),

    A0(PDRectangle.A0),
    A1(PDRectangle.A1),
    A2(PDRectangle.A2),
    A3(PDRectangle.A3),
    A4(PDRectangle.A4),
    A5(PDRectangle.A5),
    A6(PDRectangle.A6),
    LEGAL(PDRectangle.LEGAL),
    LETTER(PDRectangle.LETTER),
    A4_LANDSCAPE(new PDRectangle(842.0F, 595.5F)),
    LETTER_LANDSCAPE(new PDRectangle(792.0F, 612.0F));

    private final PDRectangle pageSize;

    PageSizeToJEasyPdf(PDRectangle pageSize) {
        this.pageSize = pageSize;
    }

    public PDRectangle getPageSize() {
        return pageSize;
    }

    public static PDRectangle pageSize(PageSizeToJEasyPdf pageSize) {
        return pageSize.getPageSize();
    }
}

package com.huntercodexs.jeasypdf.core.enumerator;

import org.apache.pdfbox.pdmodel.font.PDType1Font;

public enum FontNameToJEasyPdf {
    ZAP(PDType1Font.ZAPF_DINGBATS),
    SYMBOL(PDType1Font.SYMBOL),

    TIMES(PDType1Font.TIMES_ROMAN),
    TIMES_B(PDType1Font.TIMES_BOLD),
    TIMES_I(PDType1Font.TIMES_ITALIC),
    TIMES_BI(PDType1Font.TIMES_BOLD_ITALIC),

    COURIER(PDType1Font.COURIER),
    COURIER_B(PDType1Font.COURIER_BOLD),
    COURIER_I(PDType1Font.COURIER_OBLIQUE),
    COURIER_BI(PDType1Font.COURIER_BOLD_OBLIQUE),

    HELVETICA(PDType1Font.HELVETICA),
    HELVETICA_B(PDType1Font.HELVETICA_BOLD),
    HELVETICA_I(PDType1Font.HELVETICA_OBLIQUE),
    HELVETICA_BI(PDType1Font.HELVETICA_BOLD_OBLIQUE);

    private final PDType1Font fontName;

    FontNameToJEasyPdf(PDType1Font fontName) {
        this.fontName = fontName;
    }

    public PDType1Font getFontName() {
        return fontName;
    }

    public static PDType1Font fontName(FontNameToJEasyPdf fontName) {
        return fontName.getFontName();
    }
}

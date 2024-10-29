package com.huntercodexs.jeasypdf.core.enumerator;

public enum ImageTypeToJEasyPdf {
    JPEG("JPEG"),
    JPG("JPEG"),
    PNG("PNG"),
    GIF("GIF"),
    TIFF("TIFF"),
    BMP("BMP");

    private final String imageType;

    ImageTypeToJEasyPdf(String imageType) {
        this.imageType = imageType;
    }

    public String getImageType() {
        return imageType;
    }

    public static String imageType(ImageTypeToJEasyPdf imageType) {
        return imageType.getImageType();
    }
}

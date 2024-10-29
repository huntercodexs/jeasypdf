package com.huntercodexs.jeasypdf.core.enumerator;

import java.awt.*;

public enum ColorsToJEasyPdf {
    NONE(new Color(255, 255, 255, 0)),
    BLACK(new Color(0, 0, 0)),
    GRAY(new Color(128, 128, 128)),
    LIGHT_GRAY(new Color(192, 192, 192)),
    ICE(new Color(235, 235, 235)),
    WHITE(new Color(255, 255, 255)),
    RED(new Color(255, 0, 0)),
    RED_DARK(new Color(162, 22, 43)),
    RED_BRIGHT(new Color(243, 75, 75)),
    RED_LIGHT(new Color(243, 160, 160)),
    ORANGE(new Color(250, 123, 24)),
    GREEN(new Color(0, 255, 0)),
    GREEN_SEA(new Color(26, 188, 156)),
    GREEN_DARK(new Color(9, 112, 28)),
    BLUE(new Color(0, 0, 255)),
    BLUE_DARK(new Color(17, 17, 155)),
    BLUE_SEA(new Color(51,181,255)),
    BLUE_SAD(new Color(78, 120, 149)),
    CYAN(new Color(0, 255, 255)),
    YELLOW(new Color(255, 255, 0)),
    GOLD(new Color(255, 215, 0)),
    GOLD_DARK(new Color(194, 175, 13)),
    PINK(new Color(231, 6, 176)),
    MAGENTA(new Color(255,0,255)),
    PURPLE(new Color(173, 108, 227));

    private final Color colorName;

    ColorsToJEasyPdf(Color colorName) {
        this.colorName = colorName;
    }

    public Color getColorName() {
        return colorName;
    }

    public static Color color(ColorsToJEasyPdf colorName) {
        if (colorName == null) {
            return ColorsToJEasyPdf.NONE.getColorName();
        }
        return colorName.getColorName();
    }
}

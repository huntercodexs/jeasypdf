package com.huntercodexs.jeasypdf.barcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.huntercodexs.jeasypdf.barcode.setting.BarcodeSettings;
import com.huntercodexs.jeasypdf.barcode.setting.QrCodeSettings;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.JPEGFactory;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.impl.code39.Code39Bean;
import org.krysalis.barcode4j.impl.pdf417.PDF417Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class JEasyBarcode {

    /**
     * <p style="color: #FFFF00; font-size: 11px">barcode128</p>
     *
     * <p style="color: #CDCDCD">Create one barcode for 128 format</p>
     *
     * @param bcOverwrite (BarcodeSettings)
     * @param document (PDDocument)
     * @param contentStream (PDPageContentStream)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void barcode128(
            BarcodeSettings bcOverwrite,
            PDDocument document,
            PDPageContentStream contentStream
    ) {
        try {

            BarcodeSettings bcSettings = new BarcodeSettings();
            if (bcOverwrite != null) {
                bcSettings = bcOverwrite;
            }

            BitmapCanvasProvider canvas = new BitmapCanvasProvider(
                    bcSettings.getDpi(), BufferedImage.TYPE_BYTE_BINARY, false, bcSettings.getOrientation());

            Code128Bean code128Bean = new Code128Bean();
            code128Bean.setFontSize(bcSettings.getFontSize());
            code128Bean.setHeight(bcSettings.getLineHeight());
            code128Bean.setVerticalQuietZone(0);
            code128Bean.setFontName(bcSettings.getFontName());
            code128Bean.doQuietZone(bcSettings.isDoQuiteZone());
            code128Bean.setMsgPosition(bcSettings.getTextPosition());
            code128Bean.generateBarcode(canvas, bcSettings.getData());
            canvas.finish();

            BufferedImage bImage = canvas.getBufferedImage();

            PDImageXObject image = JPEGFactory.createFromImage(document, bImage, 1, bcSettings.getDpi());
            contentStream.drawImage(image, bcSettings.getOffsetX(), bcSettings.getOffsetY(), bcSettings.getWidth(), bcSettings.getHeight());

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    /**
     * <p style="color: #FFFF00; font-size: 11px">barcode39</p>
     *
     * <p style="color: #CDCDCD">Create a template file for PDF media types</p>
     *
     * @param bcOverwrite (BarcodeSettings)
     * @param document (PDDocument)
     * @param contentStream (PDPageContentStream)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void barcode39(
            BarcodeSettings bcOverwrite,
            PDDocument document,
            PDPageContentStream contentStream
    ) {
        try {

            BarcodeSettings bcSettings = new BarcodeSettings();
            if (bcOverwrite != null) {
                bcSettings = bcOverwrite;
            }

            BitmapCanvasProvider canvas = new BitmapCanvasProvider(
                    bcSettings.getDpi(), BufferedImage.TYPE_BYTE_BINARY, false, bcSettings.getOrientation());

            Code39Bean code39Bean = new Code39Bean();
            code39Bean.setFontName(bcSettings.getFontName());
            code39Bean.setFontSize(bcSettings.getFontSize());
            code39Bean.setQuietZone(bcSettings.getFixQuiteZone());
            code39Bean.setMsgPosition(bcSettings.getTextPosition());
            code39Bean.generateBarcode(canvas, bcSettings.getData());
            canvas.finish();

            BufferedImage bImage = canvas.getBufferedImage();

            PDImageXObject image = JPEGFactory.createFromImage(document, bImage, 1, bcSettings.getDpi());
            contentStream.drawImage(image, bcSettings.getOffsetX(), bcSettings.getOffsetY(), bcSettings.getWidth(), bcSettings.getHeight());

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    /**
     * <p style="color: #FFFF00; font-size: 11px">barcodePdf417</p>
     *
     * <p style="color: #CDCDCD">Create a template file for PDF media types</p>
     *
     * @param bcOverwrite (BarcodeSettings)
     * @param document (PDDocument)
     * @param contentStream (PDPageContentStream)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void barcodePdf417(
            BarcodeSettings bcOverwrite,
            PDDocument document,
            PDPageContentStream contentStream
    ) {
        try {

            BarcodeSettings bcSettings = new BarcodeSettings();
            if (bcOverwrite != null) {
                bcSettings = bcOverwrite;
            }

            BitmapCanvasProvider canvas = new BitmapCanvasProvider(
                    bcSettings.getDpi(), BufferedImage.TYPE_BYTE_BINARY, false, bcSettings.getOrientation());

            PDF417Bean pdf417Bean = new PDF417Bean();
            pdf417Bean.setFontName(bcSettings.getFontName());
            pdf417Bean.setFontSize(bcSettings.getFontSize());
            pdf417Bean.setQuietZone(bcSettings.getFixQuiteZone());
            pdf417Bean.setMsgPosition(bcSettings.getTextPosition());
            pdf417Bean.generateBarcode(canvas, bcSettings.getData());
            canvas.finish();

            BufferedImage bImage = canvas.getBufferedImage();

            PDImageXObject image = JPEGFactory.createFromImage(document, bImage, 1, bcSettings.getDpi());
            contentStream.drawImage(image, bcSettings.getOffsetX(), bcSettings.getOffsetY(), bcSettings.getWidth(), bcSettings.getHeight());

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    /**
     * <p style="color: #FFFF00; font-size: 11px">qrCode</p>
     *
     * <p style="color: #CDCDCD">Create a template file for PDF media types</p>
     *
     * @param qrOverwrite (CodeQRSettings)
     * @param document (PDDocument)
     * @param contentStream (PDPageContentStream)
     * @author huntercodexs (powered by jereelton-devel)
     * @see <a href="https://github.com/huntercodexs/jeasypdf">JEasyPdf (GitHub)</a>
     */
    public void qrCode(
            QrCodeSettings qrOverwrite,
            PDDocument document,
            PDPageContentStream contentStream
    ) {
        try {

            QrCodeSettings qrCodeSettings = new QrCodeSettings();
            if (qrOverwrite != null) {
                qrCodeSettings = qrOverwrite;
            }

            Map<EncodeHintType, Object> hintMap = new HashMap<>();
            hintMap.put(EncodeHintType.MARGIN, qrCodeSettings.getMargin());
            hintMap.put(EncodeHintType.QR_COMPACT, true);
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);

            BitMatrix bitMatrix = new MultiFormatWriter().encode(
                    new String(qrCodeSettings.getData().getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8),
                    BarcodeFormat.QR_CODE,
                    qrCodeSettings.getMatrix(),
                    qrCodeSettings.getMatrix(),
                    hintMap);

            MatrixToImageConfig config = new MatrixToImageConfig(qrCodeSettings.getOnColor(), qrCodeSettings.getOffColor());
            BufferedImage bImage = MatrixToImageWriter.toBufferedImage(bitMatrix, config);
            PDImageXObject image = JPEGFactory.createFromImage(document, bImage, 1, qrCodeSettings.getDpi());

            contentStream.drawImage(
                    image, qrCodeSettings.getOffsetX(), qrCodeSettings.getOffsetY(), qrCodeSettings.getSize(), qrCodeSettings.getSize());

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    public void barcodeScanner() {

        /*TODO*/

    }

}

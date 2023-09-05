package com.example.springboothttp.comment.qRCodeReader;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.HybridBinarizer;


/**
 * 扫描二维码进行网址跳转
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/5 14:56
 */
public class QRCodeReader {

    //读取二维码，跳转网址
    public void scanQRCode(String filePath) {
        try {
            File file = new File(filePath);
            BufferedImage image = ImageIO.read(file);
            LuminanceSource source = new RGBLuminanceSource(image.getWidth(), image.getHeight(), getPixels(image));
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
            Result result = new MultiFormatReader().decode(bitmap);
            String url = result.getText();
            System.out.println("二维码中的网址为：" + url);
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | ReaderException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取图像的像素数据
    private int[] getPixels(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        int[] pixels = new int[width * height];
        image.getRGB(0, 0, width, height, pixels, 0, width);
        return pixels;
    }


    public static void main(String[] args) {
        QRCodeReader scanner = new QRCodeReader();
        //二维码图片地址(这里直接拿刚生成的二维码地址)
        String filePath = "./template/csdnQrcode.png";
        scanner.scanQRCode(filePath);
    }


}

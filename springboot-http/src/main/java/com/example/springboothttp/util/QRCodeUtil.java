package com.example.springboothttp.util;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import javax.imageio.ImageIO;

import com.google.zxing.*;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeWriter;


/**
 * 二维码相关工具方法
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/5 15:25
 */
public class QRCodeUtil {

    /**
     * 生成指定网址大小及图片格式的二维码
     *
     * @param url      网址
     * @param size     尺寸
     * @param fileType 二维码图片格式
     * @param qrFile   生成图片保存地址
     */
    private static void createQRCode(String url, int size, String fileType, File qrFile)
            throws WriterException, IOException {

        HashMap<EncodeHintType, Object> hintMap = new HashMap<EncodeHintType, Object>();
        hintMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");

        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(url, BarcodeFormat.QR_CODE, size, size, hintMap);

        int matrixWidth = bitMatrix.getWidth();
        BufferedImage image = new BufferedImage(matrixWidth, matrixWidth, BufferedImage.TYPE_INT_RGB);
        image.createGraphics();

        Graphics2D graphics = (Graphics2D) image.getGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, matrixWidth, matrixWidth);
        graphics.setColor(Color.BLACK);

        for (int i = 0; i < matrixWidth; i++) {
            for (int j = 0; j < matrixWidth; j++) {
                if (bitMatrix.get(i, j)) {
                    graphics.fillRect(i, j, 1, 1);
                }
            }
        }

        ImageIO.write(image, fileType, qrFile);
    }


    /**
     * 测试生成一张指定地址的二维码
     *
     */
/*    public static void main(String[] args) {

        String url = "https://blog.csdn.net/weixin_43970743?type=blog";
        int size = 300;
        String fileType = "png";
        File qrFile = new File("./template/csdnQrcode.png");

        try {
            //调用生成二维码
            createQRCode(url, size, fileType, qrFile);
            System.out.println("QR code generated successfully!");
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    /**
     * 读取二维码网址
     */
    public static String scanQRCode(String filePath) {
        String url = "";
        try {
            File file = new File(filePath);
            BufferedImage image = ImageIO.read(file);
            LuminanceSource source = new RGBLuminanceSource(image.getWidth(), image.getHeight(), getPixels(image));
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
            Result result = new MultiFormatReader().decode(bitmap);
            url = result.getText();
            System.out.println("二维码中的网址为：" + url);
        } catch (IOException | ReaderException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return url;
    }

    /**
     * 根据网址跳转
     */
    public static void dropUrl(String url) {
        try {
            //调用系统默认浏览器打开指定URL
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }


    //获取图像的像素数据
    private static int[] getPixels(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        int[] pixels = new int[width * height];
        image.getRGB(0, 0, width, height, pixels, 0, width);
        return pixels;
    }

    /**
     * 测试二维码读取url进行跳转
     */
    public static void main(String[] args) {
        //传入一张二维码图片地址
        String filePath = "./template/csdnQrcode.png";
        //读取二维码url
        String url = QRCodeUtil.scanQRCode(filePath);
        //浏览器打开
        QRCodeUtil.dropUrl(url);
    }


}

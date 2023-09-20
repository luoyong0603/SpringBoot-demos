package com.example.javaDesignPattern.proxy;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 16:31
 */
public class ProxyImage implements ImageProxy {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

    @Override
    public void showImageInfo() {
        System.out.println("Image file: " + fileName);
    }
}

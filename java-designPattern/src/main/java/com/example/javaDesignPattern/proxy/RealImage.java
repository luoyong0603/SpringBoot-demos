package com.example.javaDesignPattern.proxy;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 16:31
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}

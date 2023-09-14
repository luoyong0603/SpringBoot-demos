package com.example.javase.rabbitEatMoonCake;

import javax.swing.*;

/**
 * 游戏素材
 *
 * @Author bug菌
 * @Date 2023-09-13 21:39
 */
public class ImageData {

    public static ImageIcon up;
    public static ImageIcon down;
    public static ImageIcon left;
    public static ImageIcon right;
    public static ImageIcon body;
    public static ImageIcon food;
    public static ImageIcon moon;

    static {
        String basePath = "/rabbitImage25/";
        up = new ImageIcon(ImageData.class.getResource(basePath + "up.png"));
        down = new ImageIcon(ImageData.class.getResource(basePath + "down.png"));
        left = new ImageIcon(ImageData.class.getResource(basePath + "left.png"));
        right = new ImageIcon(ImageData.class.getResource(basePath + "right.png"));
        body = new ImageIcon(ImageData.class.getResource(basePath + "cake.png"));
        food = new ImageIcon(ImageData.class.getResource(basePath + "cake.png"));
        moon = new ImageIcon(ImageData.class.getResource(basePath + "moon.png"));
    }

}
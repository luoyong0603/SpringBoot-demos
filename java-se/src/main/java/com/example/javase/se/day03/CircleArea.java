package com.example.javase.se.day03;

import java.util.Scanner;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/10/9 11:09
 */
public class CircleArea {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入半径：");
        double radius = reader.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("圆的面积是：" + area);
    }
}

package com.example.javase.cy;

import java.util.Scanner;

/**
 * 月饼制作-游戏
 *
 * @Author bug菌
 * @Date 2023-09-12 23:02
 */
public class MoonCakeMaker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 选择月饼外皮
        System.out.println("请选择月饼外皮：1. 油皮 2. 莲蓉皮");
        int skinChoice = sc.nextInt();
        String skin = "";
        double skinRatio = 0;
        switch (skinChoice) {
            case 1:
                skin = "油皮";
                skinRatio = 0.3;
                break;
            case 2:
                skin = "莲蓉皮";
                skinRatio = 0.5;
                break;
            default:
                System.out.println("无效的选择！");
                return;
        }

        // 选择月饼馅料
        System.out.println("请选择月饼馅料：1. 豆沙馅 2. 莲蓉馅 3. 奶黄馅");
        int fillingChoice = sc.nextInt();
        String filling = "";
        double fillingRatio = 0;
        switch (fillingChoice) {
            case 1:
                filling = "豆沙馅";
                fillingRatio = 0.4;
                break;
            case 2:
                filling = "莲蓉馅";
                fillingRatio = 0.5;
                break;
            case 3:
                filling = "奶黄馅";
                fillingRatio = 0.6;
                break;
            default:
                System.out.println("无效的选择！");
                return;
        }

        // 选择月饼装饰物
        System.out.println("请选择月饼装饰物：1. 蛋黄 2. 坚果 3. 果蓉");
        int decorationChoice = sc.nextInt();
        String decoration = "";
        double decorationRatio = 0;
        switch (decorationChoice) {
            case 1:
                decoration = "蛋黄";
                decorationRatio = 0.2;
                break;
            case 2:
                decoration = "坚果";
                decorationRatio = 0.3;
                break;
            case 3:
                decoration = "果蓉";
                decorationRatio = 0.4;
                break;
            default:
                System.out.println("无效的选择！");
                return;
        }

        // 计算比例
        double totalRatio = skinRatio + fillingRatio + decorationRatio;
        if (totalRatio != 1) {
            System.out.println("比例错误！");
            return;
        }

        // 输出月饼制作结果
        System.out.println("月饼制作成功！");
        System.out.println("外皮：" + skin);
        System.out.println("馅料：" + filling);
        System.out.println("装饰物：" + decoration);
    }

}

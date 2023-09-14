package com.example.javase.rabbitEatMoonCake;

import javax.swing.*;
import java.awt.*;

/**
 * 创建主窗口
 *
 * @Author bug菌
 * @Date 2023-09-13 21:39
 */
public class MainFrame {

    private static final int FRAME_WIDTH = 915;
    private static final int FRAME_HEIGHT = 745;

    public MainFrame() {
        initUI();
    }

    private void initUI() {
        //创建GUI应用程序的主窗口
        JFrame frame = new JFrame();

        // 窗口居中显示
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - FRAME_WIDTH) / 2;
        int y = (screenSize.height - FRAME_HEIGHT) / 2;
        frame.setBounds(x, y, FRAME_WIDTH, FRAME_HEIGHT);

        // 设置窗口标题
        frame.setTitle("兔饼大作战");

        //表示窗口被关闭时，直接终止游戏；
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 禁止调整窗口大小
        frame.setResizable(false);

        // 添加面板
        frame.add(new GamePanel());

        // 设置窗口可见
        frame.setVisible(true);
    }
}

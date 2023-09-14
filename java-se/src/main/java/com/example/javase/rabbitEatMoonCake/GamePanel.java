package com.example.javase.rabbitEatMoonCake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;


/**
 * 游戏面板
 *
 * @Author bug菌
 * @Date 2023-09-13 21:40
 */
public class GamePanel extends JPanel implements ActionListener {

    //定义游戏数据
    int panelWidth = 850;
    int panelHeight = 600;

    //移动速度
    int snakeSpeed = 300;

    //定义兔子的数据结构
    int length = 1;
    int[] snakeX = new int[600];
    int[] snakeY = new int[600];
    //兔子头朝向
    String snakeOrientation = "right";

    //食物的坐标
    int foodX;
    int foodY;
    //食物分数
    int foodValue = 1;

    //月亮的坐标
    int moonX;
    int moonY;
    //定义月亮状态
    boolean hasMoon = false;
    //倒计时，10s
    int moonCountdown = 10000;
    //吃月亮增加身体格数
    int eatMoonAddLen = 3;

    //游戏状态
    boolean isStart = false; //默认暂停状态
    boolean isFail = false;
    int score = 0;
    //历史最高得分
    int higtScore = 0;
    int level = 1;
    //头碰身体结束游戏。
    boolean cheat = false;

    //随机器
    Random random = new Random();

    //定时器
    Timer gameTimer = new Timer(snakeSpeed, this);
    Timer moonTimer = new Timer(1000, e -> {
        if (hasMoon) {
            moonCountdown -= 1000;
            if (moonCountdown <= 0) {
                moonCountdown = 10000;
                hasMoon = false;
            }
        }
    });

    //构造器
    public GamePanel() {
        init();
        //获得焦点和键盘事件
        setFocusable(true);
        //监听键盘事件
        addKeyListener(new keyboardListener());
        //游戏一开始，定时器就启动
        gameTimer.start();
        //月亮障碍物启动。
        moonTimer.start();
    }

    //初始化
    public void init() {
        //初始长度为1
        length = 1;
        //初始兔子头坐标
        snakeX[0] = 100;
        snakeY[0] = 100;
        foodX = 25 + 25 * random.nextInt(33);//生成1到34的随机数
        foodY = 75 + 25 * random.nextInt(23);
        //初始头的方向为右
        snakeOrientation = "right";
        //食物随机分布在界面上
        foodX = 25 + 25 * random.nextInt(33);//生成1到34的随机数
        foodY = 75 + 25 * random.nextInt(23);
        score = 0;
        foodValue = 1;
        level = 1;
        snakeSpeed = 300;
    }

    //绘制界面
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//清屏

        //绘制静态面板
        this.setBackground(Color.lightGray);

        //画下方游戏界面
        g.fillRect(25, 75, panelWidth, panelHeight);

        //画积分
        g.setColor(Color.white);
        g.setFont(new Font("微软雅黑", Font.BOLD, 15));
        g.drawString("长度：" + length, 770, 20);
        g.drawString("当前得分：" + score + "分", 770, 35);
        g.drawString("历史最高分：" + higtScore + "分", 770, 50);
        g.drawString("难度：" + level + "级", 770, 65);
        g.drawString("操作说明：", 10, 30);
        g.drawString("↑ ↓ ← → 分别控制兔子上、下、左、右移动。", 30, 50);


        //画食物
        ImageData.food.paintIcon(this, g, foodX, foodY);

        //画月亮
        if (hasMoon) {
            ImageData.moon.paintIcon(this, g, moonX, moonY);
        }

        //画小兔子
        switch (snakeOrientation) {
            case "right":
                ImageData.right.paintIcon(this, g, snakeX[0], snakeY[0]);//画朝右的头部
                break;
            case "left":
                ImageData.left.paintIcon(this, g, snakeX[0], snakeY[0]);//画朝左的头部
                break;
            case "up":
                ImageData.up.paintIcon(this, g, snakeX[0], snakeY[0]);//画朝上的头部
                break;
            case "down":
                ImageData.down.paintIcon(this, g, snakeX[0], snakeY[0]);//画朝下的头部
                break;
        }

        //画每一节身体
        for (int i = 1; i < length; i++) {
            ImageData.body.paintIcon(this, g, snakeX[i], snakeY[i]);
        }

        //游戏状态
        if (!isStart) {
            g.setColor(Color.white);
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("按下空格开始/暂停游戏！", 220, 375);
        }

        //游戏失败
        if (isFail) {
            g.setColor(Color.red);
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("Game Over! 按下空格重新开始", 220, 375);
        }
    }

    //键盘监听
    protected class keyboardListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();//获得按下的键

            if (keyCode == KeyEvent.VK_SPACE) {
                if (isFail) {
                    //空格控制重新开始
                    isFail = false;
                    //更新历史最高分
                    if (score > higtScore) {
                        higtScore = score;
                    }
                    init();
                } else {
                    //空格控制游戏暂停
                    isStart = !isStart;    //isStart取反
                }
                repaint();
                //控制兔子移动
            } else if (keyCode >= KeyEvent.VK_LEFT && keyCode <= KeyEvent.VK_DOWN) {
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        if (!snakeOrientation.equals("down")) {
                            snakeOrientation = "up";
                        }
                        break;
                    case KeyEvent.VK_DOWN:
                        if (!snakeOrientation.equals("up")) {
                            snakeOrientation = "down";
                        }
                        break;
                    case KeyEvent.VK_LEFT:
                        if (!snakeOrientation.equals("right")) {
                            snakeOrientation = "left";
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (!snakeOrientation.equals("left")) {
                            snakeOrientation = "right";
                        }
                        break;
                }
            } else if (keyCode == KeyEvent.VK_C) {
                cheat = !cheat;
            }
        }
    }

    //事件监听，通过固定的时间来刷新
    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStart && !isFail) {
            //游戏开始，小兔子运动
            //身体跟随移动
            for (int i = length - 1; i > 0; i--) {
                //新生成的身体不可见,否则有bug
                snakeX[length] = -50;
                snakeY[length] = -50;

                snakeX[i] = snakeX[i - 1];
                snakeY[i] = snakeY[i - 1];
            }

            //头部运动判断，只需要控制头部的运动，其他身体都会跟着动
            if (snakeOrientation.equals("up")) {
                snakeY[0] -= 25;
                if (snakeY[0] < 75) {
                    snakeY[0] = panelHeight + 50;
                }
            } else if (snakeOrientation.equals("down")) {
                snakeY[0] += 25;
                if (snakeY[0] > panelHeight + 50) {
                    snakeY[0] = 75;
                }
            } else if (snakeOrientation.equals("left")) {
                snakeX[0] -= 25;
                if (snakeX[0] < 25) {
                    snakeX[0] = panelWidth;
                }
            } else if (snakeOrientation.equals("right")) {
                snakeX[0] += 25;
                if (snakeX[0] > panelWidth) {
                    snakeX[0] = 25;
                }
            }

            //吃食物
            if (snakeX[0] == foodX && snakeY[0] == foodY) {
                length++;
                score += foodValue;
                //重新生成食物
                foodX = 25 + 25 * random.nextInt(34);
                foodY = 75 + 25 * random.nextInt(24);
            }

            //吃月亮
            if (snakeX[0] == moonX && snakeY[0] == moonY) {
                //防止得分不够扣
                length += eatMoonAddLen;
                if (score < eatMoonAddLen) {
                    score = 0;
                } else {
                    //扣3分
                    score -= eatMoonAddLen;
                }
                //月亮隐藏
                hasMoon = false;
                //10s后再次刷新
                moonCountdown = 10000;
                //刷新食物
                foodX = 25 + 25 * random.nextInt(34);
                foodY = 75 + 25 * random.nextInt(24);
            }

            //失败判定,头碰到身体就算失败
            if (!cheat) {
                for (int i = 1; i < length; i++) {
                    if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                        isFail = true;
                        break;
                    }
                }
            }

            //控制移动速度并提示当前关卡难度等级
            if (length > 5 && length <= 10) {
                level = 2;
                snakeSpeed = 250;
            } else if (length > 10 && length <= 20) {
                level = 3;
                snakeSpeed = 150;
            } else if (length > 20 && length <= 30) {
                level = 4;
                snakeSpeed = 100;
            } else if (length > 30) {
                level = 5;
                snakeSpeed = 50;
            }


            //生成月亮
            if (length > 5 && !hasMoon) {
                moonX = 25 + 25 * random.nextInt(34);
                moonY = 75 + 25 * random.nextInt(24);
                hasMoon = true;
            }

            repaint();
        }
        //修改速度并重新设置定时器延迟时间
        gameTimer.setDelay(snakeSpeed);
        gameTimer.start();
    }


}
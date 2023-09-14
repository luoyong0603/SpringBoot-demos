package com.example.javase.cy;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜灯谜游戏
 *
 * @Author bug菌
 * @Date 2023-09-12 21:38
 */
public class LanternRiddleGame {

    //灯谜题库
    private static final String[] RIDDLES = {"燃烧的小太阳", "红花绿叶紫花白", "打开它，没人敢吃它", "小姑娘打扮俊，头上戴着双宝钗", "四十九个门（1—49），走进一个留作难"};
    //灯谜答案
    private static final String[] ANSWERS = {"蜡烛", "草莓", "月饼", "梳子", "口香糖"};
    //玩家拥有的机会数
    private static final int CHANCE = 3;
    //正确猜对的灯谜数量
    private static int count = 0;

    //游戏启动入口
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis();

        //游戏规则
        printWelcomeMessage();

        // 随机生成3个灯谜
        for (int i = 0; i < 3; i++) {
            int randomIndex = getRandomIndex(RIDDLES.length);
            String riddle = RIDDLES[randomIndex];
            String answer = ANSWERS[randomIndex];
            printRiddleMessage(i + 1, riddle);
            int remainingChance = CHANCE;
            boolean isAnswerCorrect = false;
            while (remainingChance > 0) {
                String input = scanner.nextLine();
                //判断玩家是否答对
                if (isAnswerCorrect(input, answer)) {
                    printCorrectMessage();
                    isAnswerCorrect = true;
                    //猜对次数+1
                    count++;
                    break;
                } else {
                    //玩家机会数-1
                    remainingChance--;
                    //如果机会用尽，则结束游戏。
                    if (remainingChance == 0) {
                        printAnswerMessage(answer);
                    } else {
                        printWrongMessage(remainingChance);
                    }
                }
            }
            if (!isAnswerCorrect) {
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        printResultMessage(count, endTime - startTime);
    }

    private static void printWelcomeMessage() {
        System.out.println("欢迎参加猜灯谜游戏！");
        System.out.println("你需要在规定时间内猜对所有的灯谜才能通过游戏，每个灯谜有3次机会。");
    }

    private static int getRandomIndex(int length) {
        Random random = new Random();
        return random.nextInt(length);
    }

    private static void printRiddleMessage(int index, String riddle) {
        System.out.println(String.format("第%d个灯谜：%s", index, riddle));
        System.out.print("请输入答案：");
    }

    private static boolean isAnswerCorrect(String input, String answer) {
        return input.equalsIgnoreCase(answer);
    }

    private static void printCorrectMessage() {
        System.out.println("恭喜你，答对了！");
    }

    private static void printWrongMessage(int remainingChance) {
        System.out.println(String.format("答案不对，你还有%d次机会！", remainingChance));
        System.out.print("请再次输入答案：");
    }

    private static void printAnswerMessage(String answer) {
        System.out.println(String.format("机会用尽，答案是：%s", answer));
    }

    //输出游戏结果
    private static void printResultMessage(int count, long usedTime) {
        if (count == 3 && usedTime <= 60 * 1000) {
            System.out.println("恭喜你，通过了猜灯谜游戏！");
        } else {
            System.out.println("很遗憾，你没有通过猜灯谜游戏！");
        }
        System.out.println(String.format("用时：%d秒，共答对了%d个灯谜！", usedTime / 1000, count));
    }
}
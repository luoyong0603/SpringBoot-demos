package com.example.javase.cy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

/**
 * 可视化猜灯谜游戏
 *
 * @Author bug菌
 * @Date 2023-09-12 22:02
 */
public class GuessTheRiddleGame extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    // 存储所有的谜语、提示、答案
    private static final List<String> riddles = Arrays.asList(
            "月上中秋分外明，愿你人在长安，心在天涯。",
            "团圆之夜思乡心，曲院花枝笑春风。",
            "清水流过秋千去，隔江犹唱后庭花。",
            "小楼昨夜又东风，故国不堪回首月明中。",
            "十五的月亮，照着我家门，门前有个小姐姐，正在弹琵琶。",
            "桂花满城香，中秋佳气浓。",
            "喜上眉梢，忧下心头。",
            "良辰美景，应须好好珍惜。",
            "家和万事兴，中秋快乐。",
            "中秋之夜，团圆永恒。"
    );
    private static final List<String> hints = Arrays.asList(
            "一句中秋佳节的祝福话。",
            "一句形容中秋夜景的诗句。",
            "一句形容中秋夜景的诗句。",
            "一句表达思乡之情的句子。",
            "一首古诗词的开头部分。",
            "一句形容中秋桂花的诗句。",
            "一句概括中秋节的话。",
            "一句表达爱与忧的句子。",
            "一句表达对美好时光的珍惜之情。",
            "一句表达团聚重要性的话。"
    );
    private static final List<String> answers = Arrays.asList(
            "中秋快乐",
            "月上柳梢头，人约黄昏后",
            "庭院深深，独自凝望",
            "明月几时有，把酒问青天",
            "静夜思",
            "桂花",
            "喜忧参半",
            "好时光",
            "家和万事兴",
            "团圆永恒"
    );

    private JLabel riddleLabel;         // 显示谜语的标签
    private JLabel hintLabel;           // 显示提示的标签
    private JTextField answerField;     // 输入答案的文本框
    private JButton guessButton;        // 确认答案的按钮
    private JButton nextButton;         // 进入下一题的按钮
    private JButton resetButton;        // 重置按钮
    private JButton startButton;        // 开始游戏按钮
    private int currentRiddleIndex;     // 当前显示的谜语的索引
    private int score = 0;              // 玩家得分
    private JLabel scoreLabel;          // 显示玩家得分的标签
    private Timer timer;                // 计时器
    private JLabel timeLabel;           // 显示用时的标签
    private long startTime;             // 计时器开始时间
    private JLabel startLabel;          // 显示游戏开始的标签

    // 创建游戏窗口
    public GuessTheRiddleGame() {
        //设置游戏名
        setTitle("灯谜猜猜乐");
        //设置游戏界面大小
        setSize(900, 300);
        //设置窗口关闭时的默认操作
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //让窗口居中显示
        setLocationRelativeTo(null);

        //创建输入框和按钮的面板
        JPanel answerPanel = new JPanel(new GridLayout(1, 1));
        riddleLabel = new JLabel();
        hintLabel = new JLabel();

        startButton = new JButton("开始游戏");
        // 添加按钮监听器
        startButton.addActionListener(this);

        answerField = new JTextField();
        guessButton = new JButton("猜");
        //添加按钮的监听器
        guessButton.addActionListener(this);
        //将输入框添加到面板中
        answerPanel.add(answerField);

        //创建下一题按钮的面板
        JPanel nextPanel = new JPanel();
        nextButton = new JButton("下一题");
        //触发下一题
        nextButton.addActionListener(this);
        // 将如下按钮添加到同面板中
        nextPanel.add(startButton);
        nextPanel.add(guessButton);
        nextPanel.add(nextButton);

        // 创建startLabel并将其添加到主面板中
        startLabel = new JLabel();

        // 创建计时器标签
        timeLabel = new JLabel("用时：0秒");

        //玩家得分
        scoreLabel = new JLabel("玩家得分：" + score);
        JPanel mainPanel = new JPanel(new GridLayout(7, 1));

        // 创建重置按钮面板
        resetButton = new JButton("重新游戏");
        //触发监听
        resetButton.addActionListener(this);
        nextPanel.add(resetButton);

        mainPanel.add(riddleLabel);
        mainPanel.add(hintLabel);
        mainPanel.add(answerPanel);
        mainPanel.add(nextPanel);
        mainPanel.add(startLabel);
        mainPanel.add(timeLabel);
        mainPanel.add(scoreLabel);

        //将面板添加到GUI容器中
        getContentPane().add(mainPanel);
        //初始化谜底序号
        currentRiddleIndex = -1;
        //出题
        nextRiddle();
    }

    // 监听按钮事件
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {

            // 创建计时器，每1秒更新一次计时器标签
            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // 计算用时
                    long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
                    // 更新计时器标签
                    timeLabel.setText("用时：" + elapsedTime + "秒");
                }
            });
            // 启动计时器
            timer.start();

            //提示开始计时
            startLabel.setText("游戏已开始，计时中...");
            startLabel.setForeground(Color.RED);
            startLabel.setHorizontalAlignment(JLabel.CENTER);
            //重置游戏
            resetGame();
            startButton.setEnabled(false);
        } else if (e.getSource() == guessButton) {
            checkAnswer();
        } else if (e.getSource() == nextButton) {
            nextRiddle();
        } else if (e.getSource() == timer) {
            long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
            timeLabel.setText("用时：" + elapsedTime + "秒");
        } else if (e.getSource() == resetButton) {
            resetGame();
        }
    }

    //重置游戏
    private void resetGame() {

        currentRiddleIndex = -1; // 激活“猜”按钮
        guessButton.setEnabled(true);
        score = 0;
        scoreLabel.setText("玩家得分：" + score);
        startTime = System.currentTimeMillis();
        timeLabel.setText("用时：0秒");
        // 禁用startButton
        startButton.setEnabled(false);
        // 启动下一题挑战
        nextButton.setEnabled(true);
        nextRiddle(); // 添加出题逻辑
    }


    // 显示下一道谜语
    private void nextRiddle() {
        if (timer == null || !timer.isRunning()) {
            JOptionPane.showMessageDialog(this, "请先点击开始游戏按钮开始游戏！");
            return;
        }

        currentRiddleIndex = (currentRiddleIndex + 1) % riddles.size();
        riddleLabel.setText("谜面：" + riddles.get(currentRiddleIndex));
        hintLabel.setText("提示：" + hints.get(currentRiddleIndex));
        answerField.setText("");
        guessButton.setEnabled(true);

        startTime = System.currentTimeMillis();
        if (timer != null) {
            timer.stop();
        }
        timer = new Timer(1000, this);
        //开始计时
        timer.start();
    }

    // 检查答案是否正确
    private void checkAnswer() {
        // 获取用户输入的答案
        String answer = answerField.getText().trim();
        // 获取正确的答案
        String correctAnswer = answers.get(currentRiddleIndex);
        // 判断回答是否答对返回对应提示
        boolean isCorrect = answer.equals(correctAnswer);

        if (isCorrect) {
            // 得分+1
            score++;
            if (score == 10) {
                JOptionPane.showMessageDialog(this, "恭喜你！挑战成功！");
                // 更新得分显示
                scoreLabel.setText("玩家得分：" + score);
                long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
                timeLabel.setText("用时：" + elapsedTime + "秒");
                //禁用
                guessButton.setEnabled(false);
                nextButton.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(this, "回答正确！");
                // 更新得分显示
                scoreLabel.setText("玩家得分：" + score);
                long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
                timeLabel.setText("用时：" + elapsedTime + "秒");
                //自动跳转下一题。
                nextRiddle();
            }
        } else {
            JOptionPane.showMessageDialog(this, "回答错误！");
            guessButton.setEnabled(false);
        }
    }

    //游戏启动入口
    public static void main(String[] args) {
        GuessTheRiddleGame game = new GuessTheRiddleGame();
        game.setVisible(true);
    }


}
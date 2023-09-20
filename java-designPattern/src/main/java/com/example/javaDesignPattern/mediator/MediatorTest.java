package com.example.javaDesignPattern.mediator;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:48
 */
public class MediatorTest {

    public static void main(String[] args) {
        // 创建中介者
        ConcreteMediator mediator = new ConcreteMediator();

        // 创建用户
        User user1 = new User("张三");
        User user2 = new User("李四");
        User user3 = new User("王五");

        // 注册用户到中介者
        mediator.registerUser(user1);
        mediator.registerUser(user2);
        mediator.registerUser(user3);

        // 用户发送消息
        user1.sendMessage("大家好，我是张三");
        user2.sendMessage("你们好，我是李四");
        user3.sendMessage("大家好，我是王五");
    }
}


package com.example.javaDesignPattern.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:47
 */
public class ConcreteMediator implements Mediator {

    // 所有的用户
    private final Map<String, User> userMap;

    public ConcreteMediator() {
        this.userMap = new HashMap<>();
    }

    /**
     * 注册用户
     * @param user 待注册用户
     */
    public void registerUser(User user) {
        String userId = user.getUserId();
        if (!userMap.containsKey(userId)) {
            userMap.put(userId, user);
            user.setMediator(this);
        }
    }

    /**
     * 发送消息给指定用户
     * @param message 消息内容
     * @param user 接收用户
     */
    @Override
    public void sendMessage(String message, Colleague user) {
        String userId = user.getUserId();
        if (userMap.containsKey(userId)) {
            user.receiveMessage(message);
        } else {
            System.out.println("用户不存在");
        }
    }
}

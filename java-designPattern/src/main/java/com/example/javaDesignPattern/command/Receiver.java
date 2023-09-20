package com.example.javaDesignPattern.command;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:05
 */
public class Receiver {
    public void action() {
        System.out.println("执行命令");
    }
    public void undo() {
        System.out.println("撤销命令");
    }
}

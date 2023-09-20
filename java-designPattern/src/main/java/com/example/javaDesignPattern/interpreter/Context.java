package com.example.javaDesignPattern.interpreter;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:16
 */
public class Context {
    private String input;
    private String output;

    public Context(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
package com.example.javaDesignPattern.interpreter;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:17
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        String input = context.getInput();
        context.setOutput(input.toLowerCase());
    }
}

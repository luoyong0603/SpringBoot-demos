package com.example.javaDesignPattern.interpreter;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:18
 */
public class InterpreterTest {
    public static void main(String[] args) {
        String input1 = "HELLO WORLD";
        String input2 = "HELLO WORLD, I AM JAVA";

        AbstractExpression expression1 = new TerminalExpression();
        AbstractExpression expression2 = new NonterminalExpression(new TerminalExpression(), new TerminalExpression());

        Context context1 = new Context(input1);
        expression1.interpret(context1);
        System.out.println(context1.getOutput());

        Context context2 = new Context(input2);
        expression2.interpret(context2);
        System.out.println(context2.getOutput());
    }
}

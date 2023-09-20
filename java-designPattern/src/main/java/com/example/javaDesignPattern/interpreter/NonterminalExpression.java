package com.example.javaDesignPattern.interpreter;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:17
 */
public class NonterminalExpression extends AbstractExpression {
    private AbstractExpression expression1;
    private AbstractExpression expression2;

    public NonterminalExpression(AbstractExpression expression1, AbstractExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public void interpret(Context context) {
        expression1.interpret(context);
        expression2.interpret(context);
    }
}

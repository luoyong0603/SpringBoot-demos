package com.example.javaDesignPattern.memento;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 11:21
 */
public class TextEditorMemento {
    private final String text;

    public TextEditorMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

package com.example.javaDesignPattern.memento;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 11:22
 */
public class TextEditor {
    private String text;

    public TextEditor() {
        this.text = "";
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public TextEditorMemento createMemento() {
        return new TextEditorMemento(text);
    }

    public void restoreMemento(TextEditorMemento memento) {
        this.text = memento.getText();
    }
}
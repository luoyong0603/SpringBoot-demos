package com.example.javaDesignPattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 11:22
 */
public class TextEditorHistory {
    private List<TextEditorMemento> history = new ArrayList<>();

    public void push(TextEditorMemento memento) {
        history.add(memento);
    }

    public TextEditorMemento pop() {
        return history.remove(history.size() - 1);
    }
}
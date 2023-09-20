package com.example.javaDesignPattern.memento;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 11:22
 */
public class MementoPatternTest {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextEditorHistory history = new TextEditorHistory();

        editor.setText("Hello World!");
        history.push(editor.createMemento());

        editor.setText("Goodbye World!");
        history.push(editor.createMemento());

        editor.restoreMemento(history.pop());
        System.out.println(editor.getText());

        editor.restoreMemento(history.pop());
        System.out.println(editor.getText());

    }
}

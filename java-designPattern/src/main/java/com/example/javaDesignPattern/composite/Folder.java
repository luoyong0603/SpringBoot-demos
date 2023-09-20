package com.example.javaDesignPattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 14:33
 */
public class Folder extends Component {
    private List<Component> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display() {
        System.out.println("Folder Name: " + name);
        for (Component c : children) {
            c.display();
        }
    }
}

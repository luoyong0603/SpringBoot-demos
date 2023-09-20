package com.example.javaDesignPattern.composite;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 14:33
 */
public class File extends Component {
    public File(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("File cannot add any component");
    }

    @Override
    public void remove(Component c) {
        System.out.println("File cannot remove any component");
    }

    @Override
    public void display() {
        System.out.println("File Name: " + name);
    }
}

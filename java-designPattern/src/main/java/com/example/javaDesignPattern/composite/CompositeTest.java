package com.example.javaDesignPattern.composite;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 14:34
 */
public class CompositeTest {
    public static void main(String[] args) {
        Component root = new Folder("root");
        Component folder1 = new Folder("folder1");
        Component folder2 = new Folder("folder2");
        Component folder3 = new Folder("folder3");

        Component file1 = new File("file1");
        Component file2 = new File("file2");
        Component file3 = new File("file3");

        folder1.add(file1);
        folder2.add(file2);
        folder3.add(file3);

        root.add(folder1);
        root.add(folder2);
        root.add(folder3);

        root.display();
    }
}

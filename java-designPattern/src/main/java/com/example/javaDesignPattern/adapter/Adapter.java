package com.example.javaDesignPattern.adapter;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 11:04
 */
public class Adapter implements NewService {
    private OldServiceImpl oldServiceImpl;

    public Adapter(OldServiceImpl oldServiceImpl) {
        this.oldServiceImpl = oldServiceImpl;
    }

    @Override
    public void newMethod() {
        oldServiceImpl.oldMethod();
    }
}

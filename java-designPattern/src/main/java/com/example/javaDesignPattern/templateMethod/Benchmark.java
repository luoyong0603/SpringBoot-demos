package com.example.javaDesignPattern.templateMethod;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 15:44
 */
public abstract class Benchmark {
    public void runBenchmark() {
        start();
        for (int i = 0; i < 10; i++) {
            run();
        }
        stop();
    }

    public abstract void start();

    public abstract void run();

    public abstract void stop();
}
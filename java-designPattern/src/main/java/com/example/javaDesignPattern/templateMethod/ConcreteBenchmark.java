package com.example.javaDesignPattern.templateMethod;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 15:44
 */
public class ConcreteBenchmark extends Benchmark {
    @Override
    public void start() {
        System.out.println("启动基准测试");
    }

    @Override
    public void run() {
        System.out.println("执行基准测试");
    }

    @Override
    public void stop() {
        System.out.println("结束基准测试");
    }
}

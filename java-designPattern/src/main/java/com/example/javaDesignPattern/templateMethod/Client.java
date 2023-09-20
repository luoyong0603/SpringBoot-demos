package com.example.javaDesignPattern.templateMethod;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 15:45
 */
public class Client {
    public static void main(String[] args) {
        Benchmark benchmark = new ConcreteBenchmark();
        benchmark.runBenchmark();
    }
}

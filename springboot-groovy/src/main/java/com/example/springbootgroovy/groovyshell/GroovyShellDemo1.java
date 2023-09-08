package com.example.springbootgroovy.groovyshell;

import groovy.lang.GroovyShell;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/8 15:39
 */
public class GroovyShellDemo1 {

    //GroovyShell 测试无参数demo
    public static void main(String[] args) {
        String groovyStr = "package script\n" +
                "def helloWord() {\n" +
                "    return \"hello groovy\"\n" +
                "}\n" +
                "helloWord()\n";

        // 创建GroovyShell实例
        GroovyShell shell = new GroovyShell();
        //执行groovy脚本
        Object res = shell.evaluate(groovyStr);
        //获取结果
        System.out.println(res);
    }

}

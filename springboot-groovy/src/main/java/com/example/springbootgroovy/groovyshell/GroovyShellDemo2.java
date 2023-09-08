package com.example.springbootgroovy.groovyshell;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import groovy.lang.Script;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/8 15:39
 */
public class GroovyShellDemo2 {

    //GroovyShell 测试有参数demo
    public static void main(String[] args) {
        String groovyStr = "package script\n" +
                "\n" +
                "import com.example.springbootgroovy.groovyshell.ShellGroovyDTO\n" +

                "def cal(int a, int b) {\n" +
                "    ShellGroovyDTO dto = new ShellGroovyDTO()\n" +
                "    dto.setA(a)\n" +
                "    dto.setB(b)\n" +
                "    dto.setNum(a + b)\n" +
                "    return dto\n" +
                "};\n" +
                "cal(a , b)";


        // 创建Binding对象，用于传递参数和接收结果
        Binding binding = new Binding();
        // 设置参数
        binding.setVariable("a", 100);
        binding.setVariable("b", 150);
        // 创建GroovyShell实例
        GroovyShell shell = new GroovyShell(binding);

        // 执行Groovy脚本
        Object result = shell.evaluate(groovyStr);

        // 获取结果
        ShellGroovyDTO res = (ShellGroovyDTO) result;
        System.out.println(res);
    }


}

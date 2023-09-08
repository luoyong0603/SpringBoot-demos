package com.example.springbootgroovy.controller;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/8 15:37
 */
@RestController
@RequestMapping("/groovy")
public class GroovyInvokeJavaSpringController {

    @RequestMapping("/groovy-shell/spring")
    public String groovyInvokeJavaMethodTest() {
        String groovyStr = "package script\n" +
                "import com.example.springbootgroovy.service.GroovyInvokeJavaDemo\n" +
                "import com.example.springbootgroovy.utils.SpringContextUtil\n" +

                "def groovyInvokeJavaMethod(int a, int b) {\n" +
                "    GroovyInvokeJavaDemo groovyInvokeJavaDemo = SpringContextUtil.getBean(\"groovyInvokeJavaDemo\")\n" +
                "    return groovyInvokeJavaDemo.groovyInvokeJavaParam(a, b);\n" +
                "}\n" +
                "groovyInvokeJavaMethod(a, b)";

        Binding binding = new Binding();
        binding.setVariable("a", 1314);
        binding.setVariable("b", 520);

        //传入参数
        GroovyShell groovyShell = new GroovyShell(binding);
        //执行Groovy脚本
        Object evaluate = groovyShell.evaluate(groovyStr);

        //清除类加载器缓存
        groovyShell.getClassLoader().clearCache();

        return (String) evaluate;
    }

}

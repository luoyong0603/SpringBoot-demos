package com.example.springbootgroovy.groovyshell;

import groovy.transform.builder.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/8 15:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShellGroovyDTO {
    private Integer a;
    private Integer b;
    private Integer num;
}

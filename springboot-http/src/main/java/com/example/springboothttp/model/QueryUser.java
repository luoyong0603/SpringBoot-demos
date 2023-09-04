package com.example.springboothttp.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/4 17:14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryUser {

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty("年龄")
    private Integer age;

}

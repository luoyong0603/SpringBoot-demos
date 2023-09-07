package com.example.springboothttp.controller;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * 通过Jersey提供restful Api
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/7 15:58
 */
@Path("/hello")
@Component
public class JerseyHttp {

    @GET
    public String sayHello() {
        return "Hello World!";
    }
}

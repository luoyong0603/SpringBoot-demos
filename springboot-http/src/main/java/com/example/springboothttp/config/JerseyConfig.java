package com.example.springboothttp.config;

import com.example.springboothttp.controller.JerseyHttp;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/7 15:57
 */
@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(JerseyHttp.class);
    }
}

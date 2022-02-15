package com.spacetime.spacetime2;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// 打包war [4] 增加war的启动类
public class WarStarterApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 指向Spacetime2Application这个springboot启动类
        return builder.sources(Spacetime2Application.class);
    }
}
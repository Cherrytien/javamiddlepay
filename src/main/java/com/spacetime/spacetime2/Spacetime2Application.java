package com.spacetime.spacetime2;

import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;
//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com")
// 扫描所有包以及相关组件包
@ComponentScan(basePackages = {"com", "org.n3r.idworker"})
@MapperScan("com.mapper")
@SpringBootApplication
//引入Spring Task
@EnableScheduling
public class Spacetime2Application {

    public static void main(String[] args) {
        SpringApplication.run(Spacetime2Application.class, args);
    }

}

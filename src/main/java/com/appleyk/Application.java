package com.appleyk;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

/**
 * @Description
 * @author 苏州中科蓝迪公司所有(c)2016-2021
 * @date Appleyk Created on 上午 8:36 2018-11-6
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    /**

     * @return 初始化信息* Spring-Boot启动的时候，加载、创建、初始化数据
     */
    @Bean
    CommandLineRunner demo() {
        return args -> {
            System.out.println("<<<<<<<<<    Hello,Spring Boot !    >>>>>>>>");
        };
    }

}

package com.zxq.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//声明该类是springboot的引导类
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
//        程序启动的入口
//        启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class);
    }
}

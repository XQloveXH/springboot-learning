package com.zxq;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zxq.dao")
public class SpringbootMutilDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMutilDatasourceApplication.class, args);
    }

}

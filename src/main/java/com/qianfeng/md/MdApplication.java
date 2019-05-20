package com.qianfeng.md;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qianfeng.md.dao")
public class MdApplication {
    public static void main(String[] args) {
        SpringApplication.run(MdApplication.class, args);
    }
}

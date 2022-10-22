package com.example.fgoauto;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.example.fgoauto.mybaits.mapper")
public class FgoAutoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FgoAutoApplication.class, args);
    }

}

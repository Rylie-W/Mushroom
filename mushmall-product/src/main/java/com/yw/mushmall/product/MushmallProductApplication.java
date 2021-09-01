package com.yw.mushmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com/yw/mushmall/product/dao")
@SpringBootApplication
public class MushmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MushmallProductApplication.class, args);
    }

}

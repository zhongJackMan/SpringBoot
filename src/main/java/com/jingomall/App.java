package com.jingomall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zhongchunyan
 *
 * @Date 2017/9/6 10:06
 */
@SpringBootApplication
@MapperScan("com.jingomall.*.mapper")
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }
}

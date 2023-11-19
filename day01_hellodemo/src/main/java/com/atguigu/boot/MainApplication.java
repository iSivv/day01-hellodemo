package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: MainApplication
 * Package: com.atguigu.boot
 * Description:启动SpringBoot项目的主入口程序
 *
 * @Author SoSo
 * @Create 2023/11/18 23:45
 * @Version 1.0
 */

@SpringBootApplication //这是一个SpringBoot应用
public class MainApplication {

    public static void main(String[] args){

        SpringApplication.run(MainApplication.class,args);

    }

}

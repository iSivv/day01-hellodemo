package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @Author SoSo
 * @Create 2023/11/19 0:02
 * @Version 1.0
 */

//@Controller
//@ResponseBody
@RestController  //@RestController为 @Controller、@ResponseBody的合成注解
public class HelloController {

    @GetMapping("/hello")  //处理浏览器请求的注解
    public String hello(){
        return "Hello,Spring Boot 3!";
    }

}

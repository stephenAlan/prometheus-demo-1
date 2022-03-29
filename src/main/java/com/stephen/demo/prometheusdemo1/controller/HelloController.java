package com.stephen.demo.prometheusdemo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="shishouchao@corp.netease.com">shouchao.shi</a>
 * @version 1.0.0
 * @date 2022/03/07 15:45
 * @Description
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }


}

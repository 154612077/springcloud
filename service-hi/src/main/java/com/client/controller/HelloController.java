package com.client.controller;

import com.client.entity.User;
import com.client.service.impl.HelloServiceInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author xzk
 * @Date 2019/7/19
 **/
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String getDemo(@RequestParam(value = "name", defaultValue = "") String name) {
        return "get:hi " + name + " ,i am from port:" + port;
    }

    @PostMapping("/hello")
    public String postDemo(@RequestParam String name){
        return "post:hello " + name + " ,i am from port:" + port;
    }

    @PostMapping("/hello2")
    public String postJson(@RequestBody User user){
        return "post:hello " + user.getName() + " ,i am from port:" + port;
    }
}

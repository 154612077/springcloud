package com.feign.controller;

import com.feign.entity.User;
import com.feign.method.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xzk
 * @date 2019/7/18
 **/
@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;
    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        System.out.println(schedualServiceHi.sayHiFromClientOne(name));
        System.out.println(schedualServiceHi.sayHello(name));
        User user = new User();
        user.setName(name);
        System.out.println(schedualServiceHi.sayHello2(user));
        return "success";
    }
}

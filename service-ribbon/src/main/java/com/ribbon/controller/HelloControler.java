package com.ribbon.controller;

import com.ribbon.entity.User;
import com.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xzk
 * @Date 2019/7/16
 **/
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name){
        System.out.println(helloService.hiService(name));
        User user = new User();
        user.setName(name);
        System.out.println(helloService.hello2Service(user));
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("name", name);
        String result = helloService.helloService(map);
        System.out.println(result);
        return "success";
    }

}

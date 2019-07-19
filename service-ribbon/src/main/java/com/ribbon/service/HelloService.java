package com.ribbon.service;

import com.ribbon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @author xzk
 * @Date 2019/7/16
 **/
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }

    public String helloService(MultiValueMap<String, String> map) {
        return restTemplate.postForObject("http://service-hi/hello",map,String.class);
    }

    public String hello2Service(User user) {
        return restTemplate.postForObject("http://service-hi/hello2",user,String.class);
    }

}

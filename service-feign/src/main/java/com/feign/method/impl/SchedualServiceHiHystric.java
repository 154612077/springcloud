package com.feign.method.impl;

import com.feign.entity.User;
import com.feign.method.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author xzk
 * @date 2019/7/19
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "error";
    }

    @Override
    public String sayHello(String name) {
        return "error";
    }

    @Override
    public String sayHello2(User user) {
        return "error";
    }
}

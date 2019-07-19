package com.feign.method;

import com.feign.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author xzk
 */
@FeignClient(value = "service-hi")
public interface SchedualServiceHi {

    @GetMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @PostMapping(value = "/hello")
    String sayHello(@RequestParam(value = "name") String name);

    @PostMapping(value = "/hello2")
    String sayHello2(@RequestBody User user);
}

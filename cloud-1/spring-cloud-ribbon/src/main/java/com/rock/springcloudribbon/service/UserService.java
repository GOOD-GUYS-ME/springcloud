package com.rock.springcloudribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "error")
    public String sayHi(String name){
        return restTemplate.getForObject("http://SPRING-CLOUD-PROVIDER/hi?name="+name,String.class);
    }
    public String error(String name){
        return "sorry,you have an error";
    }
}

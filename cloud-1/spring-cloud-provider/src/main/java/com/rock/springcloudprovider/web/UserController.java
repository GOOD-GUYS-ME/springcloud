package com.rock.springcloudprovider.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String sayHi(String name){
        return "各位帅哥美女，大家好，我叫"+name+"，来自"+port+",祝大家开心每一天！";
    }
}

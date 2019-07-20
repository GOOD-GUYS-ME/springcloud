package com.rock.springcloudfeign.web;

import com.rock.springcloudfeign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/hi")
    public String sayHi(String name){
        return userService.feignSayHi(name);
    }
}

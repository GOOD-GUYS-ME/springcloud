package com.rock.springcloudribbon.web;

import com.rock.springcloudribbon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/hi")
    public String test(String name){
        return userService.sayHi(name);
    }
}

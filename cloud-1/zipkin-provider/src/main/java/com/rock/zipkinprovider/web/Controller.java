package com.rock.zipkinprovider.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Controller {
    public String hi(String name){
        System.out.println("name:"+name);
        return "hi,baby ,i am rock";
    }
}

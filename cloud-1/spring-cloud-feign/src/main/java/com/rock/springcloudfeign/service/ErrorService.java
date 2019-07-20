package com.rock.springcloudfeign.service;

import org.springframework.stereotype.Component;

@Component
public class ErrorService implements UserService {
    @Override
    public String feignSayHi(String name) {
        return "sorry,you have an feign error";
    }
}

package com.rock.springcloudfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-provider",fallback = ErrorService.class)
public interface UserService {
    @RequestMapping("/hi")
    public String feignSayHi(@RequestParam("name") String name);
}

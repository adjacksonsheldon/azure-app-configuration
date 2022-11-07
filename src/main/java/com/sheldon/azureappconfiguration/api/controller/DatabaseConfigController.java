package com.sheldon.azureappconfiguration.api.controller;

import com.sheldon.azureappconfiguration.infrastructure.properties.DbProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/db")
public class DatabaseConfigController {

    private final DbProperties properties;

    @GetMapping("/user")
    public String getUser(){
        return properties.getUser();
    }
    @GetMapping("/password")
    public String getPassword(){
        return properties.getPassword();
    }

    @GetMapping("/url")
    public String getUrl(){
        return properties.getUrl();
    }

}

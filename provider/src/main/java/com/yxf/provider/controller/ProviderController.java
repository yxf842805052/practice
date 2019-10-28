package com.yxf.provider.controller;

import com.yxf.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProviderController {
    @Autowired
    private ProviderService providerService;

    @RequestMapping("/sel")
    public Map<String, Object> selAll(int page, int rows) {
        return providerService.selAll(page, rows);
    }

    @GetMapping("/test")
    public String test(){
        System.out.println("进入测试");
        return "test str";

    }


}

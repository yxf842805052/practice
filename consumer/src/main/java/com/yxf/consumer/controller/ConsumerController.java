package com.yxf.consumer.controller;

import com.yxf.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("/sel")
    public Map<String,Object> sel(@RequestParam(defaultValue = "1") int page,@RequestParam(defaultValue = "3") int rows){
        return consumerService.sel(page,rows);
    }

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/test")
    public String tt(){
        String serviceID = "provider";
        return restTemplate.getForObject("http://" + serviceID + "/test",String.class );
    }

}

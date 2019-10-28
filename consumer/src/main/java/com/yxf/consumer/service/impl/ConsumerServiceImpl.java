package com.yxf.consumer.service.impl;

import com.yxf.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public Map<String, Object> sel(int page, int rows) {
//        String url = "http://localhost:1112/sel?page=" + page + "&rows=" + rows;
        System.out.println(page+"   "+rows);
        String url = "http://provider/sel?page=" + page + "&rows=" + rows;
        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
        Map body = response.getBody();
        body.put("page",page);
        return body;
    }
}

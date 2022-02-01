package com.springboot.connectionpool.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ResourceClient {

    @Autowired RestTemplate restTemplate;

    @GetMapping("/client")
    public String clientCall() throws InterruptedException {

        String result = restTemplate.getForObject("http://localhost:8091/api/server", String.class);
        return "Response from " + result;
    }
}

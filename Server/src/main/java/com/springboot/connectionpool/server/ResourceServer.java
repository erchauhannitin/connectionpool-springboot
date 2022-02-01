package com.springboot.connectionpool.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ResourceServer {

    @GetMapping("/server")
    public String serverCall() throws InterruptedException {

        Thread.sleep(150);
        return "Shalom from Server";
    }
}

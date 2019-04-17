package com.neusoft.springcloudclient.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value="/greet", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String sayHello(){
        String result = restTemplate.getForEntity("http://server/hello",String.class).getBody();
        return result;
    }

    public String helloFallback(String param, Throwable e){
        return "hello-service is error! Param is " + param + ". Exception is " + e.getMessage();
    }
}

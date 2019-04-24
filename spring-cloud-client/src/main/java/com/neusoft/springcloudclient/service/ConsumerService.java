package com.neusoft.springcloudclient.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.neusoft.springcloudutils.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String sayHello(String param){
        if("hystrix".equals(param)){
            throw new RuntimeException("consumer  throw exception ");
        }
        String result = restTemplate.getForEntity("http://server/hello",String.class).getBody();
        return result;
    }

    public String helloFallback(String param, Throwable e){
        return "hello-service is error! Param is " + param + ". Exception is " + e.getMessage();
    }

    @HystrixCommand(fallbackMethod = "helloUserFallback")
    public String sayHello(User user){
        String result = restTemplate.getForEntity("http://server/helloUser",String.class).getBody();
        //String result ="my id is "+user1.getId();
        return result;
    }

    public String helloUserFallback(String param, Throwable e){
        return "sayHello is error! Param is " + param + ". Exception is " + e.getMessage();
    }
}

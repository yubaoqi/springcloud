package com.neusoft.springcloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudClientApplication {

    //@LoadBalanced
    //RestTemplate restTemplate(){
    //    return new RestTemplate();
    //}
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudClientApplication.class, args);
    }

}


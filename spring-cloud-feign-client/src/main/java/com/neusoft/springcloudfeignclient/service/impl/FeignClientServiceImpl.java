package com.neusoft.springcloudfeignclient.service.impl;

import com.neusoft.springcloudfeignclient.service.FeignClientService;
import org.springframework.stereotype.Component;

@Component
public class FeignClientServiceImpl implements FeignClientService {
    @Override
    public String sayHello() {
        return "something bad happened !";
    }

    @Override
    public String sayHello(String name) {
        return "OMG! I do not know you, "+name;
    }
}

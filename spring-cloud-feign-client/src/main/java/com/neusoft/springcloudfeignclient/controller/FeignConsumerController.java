package com.neusoft.springcloudfeignclient.controller;

import com.neusoft.springcloudfeignclient.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignConsumerController {

    @Autowired
    FeignClientService feignClientService;

    @RequestMapping(value="/greet", method = RequestMethod.GET)
    public String sayHello(){
        return feignClientService.sayHello();
    }

    @RequestMapping(value="/greetTo", method = RequestMethod.GET)
    public String sayHello(@RequestParam String name){
        return feignClientService.sayHello(name);
    }

}

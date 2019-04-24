package com.neusoft.springcloudclient.controller;

import com.neusoft.springcloudclient.service.ConsumerService;
import com.neusoft.springcloudutils.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value="/greet", method = RequestMethod.GET)
    public String sayHello(){
        //String param = "hystrix";
        String param = "good";
        String result = consumerService.sayHello(param);
        return result;
    }

    @RequestMapping(value="/user/{id}")
    public String sayHello(@PathVariable String id){
        User user = new User();
        user.setId(id);
        return consumerService.sayHello(user);
    }

}

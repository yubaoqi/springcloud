package com.neusoft.springcloudserver.controller;

import com.neusoft.springcloudutils.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "测试一下";
    }

    @RequestMapping(value="/helloTo", method = RequestMethod.GET)
    public String sayHello(@RequestParam String name){
        return "hello,"+name;
    }

    @RequestMapping(value="/helloUser", method = RequestMethod.GET)
    public String helloUser(@RequestParam User user){
        //User us = new User();
        return "hello,user:"+user.getId();
    }




}

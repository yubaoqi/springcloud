package com.neusoft.springcloudserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value="/hello", method = RequestMethod.GET)

    public String sayHello(){
        return "测试一下";
    }

}

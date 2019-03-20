package com.neusoft.springcloudclient.controller;

import com.neusoft.springcloudutils.util.DateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/test")
public class TestController {

    @ResponseBody
    @RequestMapping(value="/date")
    public String getDate(){
        return DateUtil.getCurrentDate();
    }
}

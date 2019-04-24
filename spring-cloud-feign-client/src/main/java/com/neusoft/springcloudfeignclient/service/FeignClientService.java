package com.neusoft.springcloudfeignclient.service;

import com.neusoft.springcloudfeignclient.service.impl.FeignClientServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "server",fallback = FeignClientServiceImpl.class)
public interface FeignClientService {
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String sayHello();

    @RequestMapping(value="/helloTo", method = RequestMethod.GET)
    public String sayHello(@RequestParam String name);
}

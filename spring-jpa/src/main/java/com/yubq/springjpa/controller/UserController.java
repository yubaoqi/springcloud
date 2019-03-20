package com.yubq.springjpa.controller;

import com.yubq.springjpa.jpa.UserJpa;
import com.yubq.springjpa.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    private UserJpa userJpa;

    @ResponseBody
    @RequestMapping(value="/list",method = RequestMethod.GET)
    public List<User> list(){
        return userJpa.findAll();
    }

    @ResponseBody
    @RequestMapping(value="/save",method = RequestMethod.GET)
    public List<User> save(User user){
        userJpa.save(user);
        return userJpa.findAll();
    }

    @ResponseBody
    @RequestMapping(value="/delete")
    public List<User> delete(User user){
        userJpa.delete(user);
        return userJpa.findAll();
    }

}

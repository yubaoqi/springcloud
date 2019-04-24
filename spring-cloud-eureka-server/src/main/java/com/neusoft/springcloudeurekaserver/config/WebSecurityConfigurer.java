package com.neusoft.springcloudeurekaserver.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * security默认启用了csrf检验，要在eureka服务端配置security的csrf检验为false
 * 否则eureka客户端无法连接注册中心
 */
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        super.configure(http);
    }
}

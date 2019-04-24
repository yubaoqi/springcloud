package com.neusoft.springcloudeurekaserver;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudEurekaServerApplicationTests {
    @Autowired
    StringEncryptor stringEncryptor;
    @Test
    public void contextLoads() {
        //encode();
    }

    @Test
    public void encode(){
        String result = stringEncryptor.encrypt("yubaoqi");
        System.out.println("==================");
        System.out.println(result);
        System.out.println("==================");
    }

}

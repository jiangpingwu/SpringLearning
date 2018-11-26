package com.alan.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoApplicationTests {

    @Test
    public void contextLoads() {
        int num = 9001;
        int size = 1000;
        int r = num/1000;
        System.out.println("name="+r);
    }

}

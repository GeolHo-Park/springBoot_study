package com.springboot.study.springboot_study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class SpringBootStudyApplicationTests {

    @Test
    void contextLoads() {
        int a = 1;
        int b = 2;
        Assertions.assertEquals(4, a+b); //false
    }

}

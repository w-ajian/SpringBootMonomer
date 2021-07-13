package com.wenjian.monomer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class MybatisApplicationTests {

    @Test
    void contextLoads() {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.print(i);
        }
        long end = new Date().getTime();
        System.out.println();
        System.out.println("共耗时毫秒：" + (end - start));

    }

}

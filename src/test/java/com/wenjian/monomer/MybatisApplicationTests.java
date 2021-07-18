package com.wenjian.monomer;

import com.wenjian.test.TicketThread;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.PrintStream;
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
        System.out.println((end - start));
    }

    @Test
    void testThread() {
        TicketThread ticketThread = new TicketThread("取票线程:");
        ticketThread.start();
        for (int i = 0; i <= 100; i++) {
            System.out.println("主线程:"+i);
        }
    }

    @Test
    void testRunnable() {
        new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                System.out.println("匿名内部类:"+i);
            }
        }).start();
        for (int i = 0; i <= 100; i++) {
            System.out.println("主线程:"+i);
        }
    }

    @Test
    void testIo() throws IOException {
        // 创建打印流,指定文件的名称
//        PrintStream ps = new PrintStream("");
        // 设置系统的打印流流向,输出到ps.txt
//        System.setOut(ps);
        // 调用系统的打印流,ps.txt中输出97
        System.out.println("测试");
    }
}


















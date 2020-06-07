package com.example.task;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @ClassName Task1
 * @Author User
 * @date 2020.06.07 12:24
 */
@Component
@EnableScheduling
public class Task1 {

    @Scheduled(cron ="*/1 * * * * ?")
    public void sayWord() {
        System.out.println("world");
    }


    @Scheduled(fixedDelay = 3000)
    private void myTask1() {
        System.out.println("I do myself per third seconds");
    }

    //每10秒执行一次
    @Scheduled(fixedRate = 10000)
    private void myTask2() {
        System.out.println("我是一个定时任务");
    }

    //容器启动后,延迟10秒后再执行一次定时器,以后每10秒再执行一次该定时器。
    @Scheduled(initialDelay = 10000, fixedRate = 10000)
    private void myTask3() {
        System.out.println("我是一个延时10s的定时任务");
    }

}

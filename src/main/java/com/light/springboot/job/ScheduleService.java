package com.light.springboot.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User: LiWenC
 * Date: 18-4-11
 */
@Component
public class ScheduleService {

    private int count = 0;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron = "*/3 * * * * ?")
    private void process() {
        System.out.println(Thread.currentThread().getName() + "\tthis is job task running  " + (count++));
    }

    @Scheduled(fixedRate = 3000)
    public void reportCurrentTime() {
        System.out.println(Thread.currentThread().getName() + "\t当前时间：" + dateFormat.format(new Date()));
    }
}
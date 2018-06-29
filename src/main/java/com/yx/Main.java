package com.yx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * User: LiWenC
 * Date: 18-4-11
 */
@SpringBootApplication
@EnableScheduling
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    /**
     * 多线程执行定时任务
     *
     * @return
     */
    @Bean
    public TaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        taskScheduler.setPoolSize(5);//线程池大小
        taskScheduler.setThreadNamePrefix("spring-boot-task");
        return taskScheduler;
    }
    
    /**
     * 返回数据显示驼峰标示
     * @return
     */
    @Bean
    public MappingJackson2HttpMessageConverter jsonConverter() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        ObjectMapper mapper = new ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy strategy = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy();
        mapper.setPropertyNamingStrategy(strategy);
        converter.setObjectMapper(mapper);
        List<MediaType> list = new ArrayList<MediaType>();
        list.add(MediaType.parseMediaType("text/html;charset=UTF-8"));
        list.add(MediaType.parseMediaType("application/json; charset=UTF-8"));
        converter.setSupportedMediaTypes(list);
        return converter;
    }
}

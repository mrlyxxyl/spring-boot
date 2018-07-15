package net.ys.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.util.ArrayList;
import java.util.List;

/**
 * 基础组件
 *
 * @author NMY
 */
@Configuration
public class BaseComponent {

    /**
     * 多线程执行定时任务
     *
     * @return
     */
    @Bean
    public TaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        taskScheduler.setPoolSize(5);
        taskScheduler.setThreadNamePrefix("spring-boot-task");
        return taskScheduler;
    }

    /**
     * 返回数据显示驼峰标示
     *
     * @return
     */
    @Bean
    public MappingJackson2HttpMessageConverter jsonConverter() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        ObjectMapper mapper = new ObjectMapper();
        com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy strategy = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy();
        mapper.setPropertyNamingStrategy(strategy);
        converter.setObjectMapper(mapper);
        List<MediaType> list = new ArrayList<>();
        list.add(MediaType.parseMediaType("application/json; charset=UTF-8"));
        converter.setSupportedMediaTypes(list);
        return converter;
    }
}

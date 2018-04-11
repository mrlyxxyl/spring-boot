package com.light.springboot.controller;

import com.light.springboot.constant.GenResult;
import com.light.springboot.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * User: LiWenC
 * Date: 18-4-11
 */
@RestController
@RequestMapping("person")
public class PersonController {

    private static Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Value("${server.id}")
    private String serverId;//读取application.properties文件中的配置

    @Resource
    private PersonService personService;

    @GetMapping("count")
    @ResponseBody
    public Map<String, Object> count() {
        int count = personService.count();
        logger.info("person count: " + count);
        logger.info("server id: " + serverId);
        return GenResult.SUCCESS.genResult(count);
    }
}

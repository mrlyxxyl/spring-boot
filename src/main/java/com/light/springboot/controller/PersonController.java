package com.light.springboot.controller;

import com.light.springboot.bean.Person;
import com.light.springboot.constant.GenResult;
import com.light.springboot.constant.SysProperties;
import com.light.springboot.service.PersonService;
import com.light.springboot.util.LogUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * User: LiWenC
 * Date: 18-4-11
 */
@RestController
@RequestMapping("person")
public class PersonController {

    @Resource
    private PersonService personService;

    @Resource
    private SysProperties sysProperties;

    @GetMapping("count")
    public Map<String, Object> count() {
        try {
            int count = personService.count();
            LogUtil.info(count);
            LogUtil.info("server id: " + sysProperties.getServerId());
            return GenResult.SUCCESS.genResult(count);
        } catch (Exception e) {
            LogUtil.error(e);
            return GenResult.UNKNOWN_ERROR.genResult();
        }
    }

    @GetMapping("persons")
    public Map<String, Object> persons() {
        try {
            List<Person> persons = personService.queryPersons();
            return GenResult.SUCCESS.genResult(persons);
        } catch (Exception e) {
            LogUtil.error(e);
            return GenResult.UNKNOWN_ERROR.genResult();
        }
    }
}

package com.yx.controller;

import com.yx.bean.Person;
import com.yx.constant.GenResult;
import com.yx.service.PersonService;
import com.yx.util.LogUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Date: 18-4-11
 *
 * @author NMY
 */
@RestController
@RequestMapping("person")
public class PersonController {

    @Resource
    private PersonService personService;

    @GetMapping("count")
    public Map<String, Object> count() {
        try {
            int count = personService.count();
            LogUtil.info(count);
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

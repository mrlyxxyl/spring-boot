package com.light.springboot.service;


import com.light.springboot.dao.PersonDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * User: LiWenC
 * Date: 18-4-11
 */
@Service
public class PersonService {
    @Resource
    private PersonDao personDao;

    public int count() {
        return personDao.count();
    }
}

package net.ys.service;


import net.ys.bean.Person;
import net.ys.dao.PersonDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Date: 18-4-11
 *
 * @author NMY
 */
@Service
public class PersonService {
    @Resource
    private PersonDao personDao;

    public int count() {
        return personDao.count();
    }

    public List<Person> queryPersons() {
        return personDao.queryPersons();
    }
}

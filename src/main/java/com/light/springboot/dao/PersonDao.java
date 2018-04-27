package com.light.springboot.dao;

import com.light.springboot.bean.Person;
import com.light.springboot.mapper.PersonMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: LiWenC
 * Date: 18-4-11
 */
@Repository
public class PersonDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public int count() {
        String sql = "select count(*) from person";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    public List<Person> queryPersons() {
        String sql = "SELECT id, user_name, age FROM person";
        return jdbcTemplate.query(sql, new PersonMapper());
    }
}

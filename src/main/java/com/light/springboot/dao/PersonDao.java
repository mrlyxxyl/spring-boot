package com.light.springboot.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

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
}

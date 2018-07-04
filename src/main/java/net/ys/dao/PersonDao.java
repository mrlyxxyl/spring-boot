package net.ys.dao;

import net.ys.bean.Person;
import net.ys.mapper.PersonMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Date: 18-4-11
 *
 * @author NMY
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

package com.yx.mapper;

import com.yx.bean.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();
        person.setId(resultSet.getInt("id"));
        person.setUserName(resultSet.getString("user_name"));
        person.setAge(resultSet.getInt("age"));
        return person;
    }
}
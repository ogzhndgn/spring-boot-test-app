package org.thepoet.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.thepoet.model.User;

import java.util.List;

/**
 * @author the Poet <dogan_oguzhan@hotmail.com>
 * @date 22.08.2017
 */
@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<User> getAll() {
        String sql = "SELECT * FROM springboot.users";
        List<User> userList = jdbcTemplate.query(sql,
                (resultSet, i) -> {
                    User user = new User();
                    user.setId(resultSet.getInt("id"));
                    user.setName(resultSet.getString("name"));
                    user.setBirthDate(resultSet.getDate("birthdate"));
                    user.setCity(resultSet.getString("city"));
                    return user;
                });
        return userList;
    }
}
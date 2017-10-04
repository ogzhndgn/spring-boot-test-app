package org.thepoet.dao;

import org.springframework.stereotype.Repository;
import org.thepoet.model.User;

import java.util.List;

/**
 * @author the Poet <dogan_oguzhan@hotmail.com>
 * @date 22.08.2017
 */
@Repository
public class UserDao extends DatabaseObject {


    public List<User> getAll() {
        String sql = "SELECT * FROM springboot.users ORDER BY id";
        List<User> userList = getJdbcTemplate().query(sql,
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
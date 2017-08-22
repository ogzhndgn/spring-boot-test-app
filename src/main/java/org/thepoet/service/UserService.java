package org.thepoet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thepoet.dao.UserDao;
import org.thepoet.model.User;

import java.util.List;

/**
 * @author the Poet <dogan_oguzhan@hotmail.com>
 * @date 22.08.2017
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<User> getUsers() {
        return userDao.getAll();
    }
}
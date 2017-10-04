package org.thepoet.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author the Poet <dogan_oguzhan@hotmail.com>
 * @date 5.10.2017
 */
public class DatabaseObject {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
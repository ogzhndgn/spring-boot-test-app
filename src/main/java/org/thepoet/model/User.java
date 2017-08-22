package org.thepoet.model;

import java.util.Date;

/**
 * @author the Poet <dogan_oguzhan@hotmail.com>
 * @date 22.08.2017
 */
public class User {
    private int id;
    private String name;
    private Date birthDate;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
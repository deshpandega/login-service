package com.gd.app.dao.entity;

import com.datastax.driver.mapping.annotations.Table;

import java.io.Serializable;

/**
 * @author Gaurang Deshpande
 */
@Table(keyspace = "app", name = "login")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String email;
    private String name;
    private String imageUrl;

    public UserEntity() {
    }

    public UserEntity(final String id, final String email, final String name, final String imageUrl) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {

        return "UserEntity [id=" + id + ", email="+ email +", " +
                "name="+ name +", imageUrl="+ imageUrl +"]";
    }
}

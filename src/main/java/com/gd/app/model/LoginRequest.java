package com.gd.app.model;

import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Gaurang Deshpande
 */
@XmlRootElement
@Produces("application/json")
public class LoginRequest {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

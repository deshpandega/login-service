package com.gd.app.service;

import com.gd.app.model.LoginRequest;
import com.gd.app.model.User;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;

/**
 * @author Gaurang Deshpande
 */
public class LoginWithFacebookApiTest extends LoginServiceImplTest {

    private LoginRequest loginRequest;
    private User user;

    @Before
    public void init() {
        loginRequest = new LoginRequest();
        loginRequest.setId("12345678");
        loginRequest.setEmail("email@gmail.com");
        loginRequest.setName("name");
        loginRequest.setImageUrl("url");

        user = new User("id", "email", "name", "url");
    }

    @Test
    public void loginWithGoogleTestSuccess() {
        Response response = loginServiceImpl.loginWithFacebookApi(loginRequest);
        assertEquals("Error in response", 200, response.getStatus());
    }
}

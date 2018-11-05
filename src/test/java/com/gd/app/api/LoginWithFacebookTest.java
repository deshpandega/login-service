package com.gd.app.api;

import com.gd.app.model.LoginRequest;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;

/**
 * @author Gaurang Deshpande
 */
public class LoginWithFacebookTest extends LoginApiResponseTest {
    private LoginRequest loginRequest;
    private LoginRequest loginRequestWithoutId;

    @Before
    public void init() {
        loginRequest = new LoginRequest();
        loginRequest.setId("12345678");
        loginRequest.setEmail("email@gmail.com");
        loginRequest.setName("name");
        loginRequest.setImageUrl("url");

        loginRequestWithoutId = new LoginRequest();
        loginRequestWithoutId.setEmail("email@gmail.com");
        loginRequestWithoutId.setName("name");
        loginRequestWithoutId.setImageUrl("url");
    }

    @Test
    public void testLoginWithGoogleSuccess() {
        final Response response = apiResponse.loginWithFacebook(loginRequest, null);
        assertEquals("login with google is not success", 200, response.getStatus());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLoginWithGoogleWithoutRequestBody() {
        apiResponse.loginWithFacebook(null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLoginWithGoogleWithoutIDInRequest() {
        apiResponse.loginWithFacebook(loginRequestWithoutId, null);
    }
}

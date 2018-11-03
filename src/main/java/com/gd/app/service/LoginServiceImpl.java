package com.gd.app.service;

import com.gd.app.model.LoginRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.gd.app.util.ResponseBuilder;

import javax.ws.rs.core.Response;

/**
 * @author Gaurang Deshpande
 */
public class LoginServiceImpl implements LoginService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginServiceImpl.class);

    public Response loginWithGoogleApi(final LoginRequest loginRequest) {
        LOGGER.info("Starting login call to Google API with request: [{}]", loginRequest);

        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();
        LOGGER.info("Creds opbatiner [{}] and [{}]", username, password);
        return Response.ok().entity(ResponseBuilder.buildLoginResponse()).build();
    }

    public Response loginWithFacebookApi(final LoginRequest loginRequest) {
        LOGGER.info("Starting login call to Facebook API with request: [{}]", loginRequest);
        return Response.ok().entity(ResponseBuilder.buildLoginResponse()).build();
    }
}

package com.gd.app.api;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.gd.app.model.LoginRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.gd.app.service.LoginService;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;

/**
 * @author Gaurang Deshpande
 */
public class LoginApiResponse implements ApiResponse{

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginApiResponse.class);
    private final LoginService loginService;

    @Inject
    public LoginApiResponse(LoginService loginService){
        this.loginService = loginService;
    }

    public Response loginWithGoogle(LoginRequest loginRequest, HttpServletRequest request) {
        Preconditions.checkArgument(loginRequest != null, "Missing request body");
        Preconditions.checkArgument(StringUtils.isNotBlank(loginRequest.getId()), "Missing id");
        Preconditions.checkArgument(StringUtils.isNotBlank(loginRequest.getEmail()), "Missing email");
        Preconditions.checkArgument(StringUtils.isNotBlank(loginRequest.getName()), "Missing name");
        Preconditions.checkArgument(StringUtils.isNotBlank(loginRequest.getImageUrl()), "Missing image url");
        LOGGER.info("Starting login with google");
        return loginService.loginWithGoogleApi(loginRequest);
    }


    public Response loginWithFacebook(LoginRequest loginRequest, HttpServletRequest request) {
        Preconditions.checkArgument(loginRequest != null, "Missing request body");
        Preconditions.checkArgument(StringUtils.isNotBlank(loginRequest.getId()), "Missing id");
        Preconditions.checkArgument(StringUtils.isNotBlank(loginRequest.getEmail()), "Missing email");
        Preconditions.checkArgument(StringUtils.isNotBlank(loginRequest.getName()), "Missing name");
        Preconditions.checkArgument(StringUtils.isNotBlank(loginRequest.getImageUrl()), "Missing image url");
        LOGGER.info("Starting login with google");
        return loginService.loginWithFacebookApi(loginRequest);
    }

    public Response helloUser(){
        LOGGER.info("Hitting the backend");
        return Response.ok().entity("Hello").build();
    }
}

package com.gd.app.api;

import com.gd.app.model.LoginRequest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;

/**
 * @author Gaurang Deshpande
 */
public interface ApiResponse {

    Response loginWithGoogle(LoginRequest loginRequest, HttpServletRequest request);

    Response loginWithFacebook(LoginRequest loginRequest, HttpServletRequest request);

    Response helloUser();
}

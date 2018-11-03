package com.gd.app.service;

import com.gd.app.model.LoginRequest;

import javax.ws.rs.core.Response;

/**
 * @author Gaurang Deshpande
 */
public interface LoginService {

    Response loginWithGoogleApi(final LoginRequest loginRequest);

    Response loginWithFacebookApi(final LoginRequest loginRequest);
}

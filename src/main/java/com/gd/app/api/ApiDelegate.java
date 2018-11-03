package com.gd.app.api;

import com.google.inject.Inject;
import com.gd.app.model.LoginRequest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

/**
 * @author Gaurang Deshpande
 */

@Path("/v1")
public class ApiDelegate {

    @Inject
    private ApiResponse apiResponse;

    public ApiDelegate() {
    }

    @POST
    @Path("/google")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public Response loginWithGoogle(LoginRequest loginRequest, @Context HttpServletRequest request){
        return this.apiResponse.loginWithGoogle(loginRequest, request);
    }

    @POST
    @Path("/facebook")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public Response loginWithFacebook(LoginRequest loginRequest, @Context HttpServletRequest request){
        return this.apiResponse.loginWithFacebook(loginRequest, request);
    }

    @GET
    @Path("/hello")
    @Consumes({"application/json"})
    public Response helloUser(){
        return this.apiResponse.helloUser();
    }
}

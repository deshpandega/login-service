package com.gd.app.util;

import com.gd.app.model.LoginResponse;

/**
 * @author Gaurang Deshpande
 */
public class ResponseBuilder {

    public static LoginResponse buildLoginResponse(){
        return new LoginResponse.Builder()
                .withName("Gaurang Deshpande")
                .withUsername("gaurangdeshpande89@gmail.com")
                .withProfileUrl("")
                .withResultCode(ResultCode.SUCCESS)
                .build();
    }
}

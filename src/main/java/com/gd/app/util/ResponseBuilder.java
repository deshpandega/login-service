package com.gd.app.util;

import com.gd.app.model.LoginResponse;

/**
 * @author Gaurang Deshpande
 */
public class ResponseBuilder {

    public static LoginResponse buildLoginResponse(){
        return new LoginResponse("gaurangdeshpande89@gmail.com","Gaurang Deshpande","",ResultCode.SUCCESS);
    }
}

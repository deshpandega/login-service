package com.gd.app.util;

import com.gd.app.model.LoginResponse;
import com.gd.app.model.User;

/**
 * @author Gaurang Deshpande
 */
public class ResponseBuilder {

    public static LoginResponse buildLoginResponse(User user){
        return new LoginResponse(user.getEmail(),user.getName(),user.getImageUrl(),ResultCode.SUCCESS);
    }
}

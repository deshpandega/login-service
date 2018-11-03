package com.gd.app.model;

import com.gd.app.util.ResultCode;

/**
 * @author Gaurang Deshpande
 */
public class LoginResponse {

    private final String username;
    private final String name;
    private final String profileUrl;
    private final ResultCode status;

    public LoginResponse(String username, String name, String profileUrl, ResultCode status) {
        this.username = username;
        this.name = name;
        this.profileUrl = profileUrl;
        this.status = status;
    }

    public static class Builder {
        private String username;
        private String name;
        private String profileUrl;
        private ResultCode status;

        public Builder withUsername(final String username){
            this.username=username;
            return this;
        }

        public Builder withName(final String name){
            this.name = name;
            return this;
        }

        public Builder withProfileUrl(final String profileUrl){
            this.profileUrl = profileUrl;
            return this;
        }

        public Builder withResultCode(final ResultCode status){
            this.status = status;
            return this;
        }

        public LoginResponse build(){
            return new LoginResponse(this.username, this.name, this.profileUrl, this.status);
        }
    }
}

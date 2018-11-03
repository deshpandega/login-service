package com.gd.app.model;

import com.gd.app.util.ResultCode;

import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Gaurang Deshpande
 */
@XmlRootElement
@Produces("application/json")
public class LoginResponse {

    private String username;
    private String name;
    private String profileUrl;
    private ResultCode status;

    public LoginResponse(){}

    public LoginResponse(String username, String name, String profileUrl, ResultCode status) {
        this.username = username;
        this.name = name;
        this.profileUrl = profileUrl;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public ResultCode getStatus() {
        return status;
    }

    public void setStatus(ResultCode status) {
        this.status = status;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginResponse {\n");
        sb.append("    ").append(this.indentValue(" ")).append("\n");
        sb.append("    code: ").append(this.indentValue(this.getStatus())).append("\n");
        sb.append("    username: ").append(this.indentValue(this.getUsername())).append("\n");
        sb.append("    name: ").append(this.indentValue(this.getName())).append("\n");
        sb.append("    profile url: ").append(this.indentValue(this.getProfileUrl())).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String indentValue(Object obj){
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }
}

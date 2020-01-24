package com.ama.prototipo.model.request;


public class JWTResponseRequest {
    private String Token;
    private String username;

    public JWTResponseRequest(){}


    public String getToken() {
        return this.Token;
    }

    public void setToken(String Token) {
        this.Token = Token;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
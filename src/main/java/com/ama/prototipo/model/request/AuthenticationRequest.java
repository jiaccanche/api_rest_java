package com.ama.prototipo.model.request;

import javax.validation.constraints.NotNull;

public class AuthenticationRequest{
    @NotNull(message = "No puede estar vacio el elemento.")
    private String username;
    @NotNull(message = "No puede estar vacio el elemento.")
    private String password;

    public AuthenticationRequest(){}

    public String getusername() {
        return this.username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
   

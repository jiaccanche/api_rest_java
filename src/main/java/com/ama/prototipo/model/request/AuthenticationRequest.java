package com.ama.prototipo.model.request;

import javax.validation.constraints.NotNull;

public class AuthenticationRequest{
    @NotNull(message = "No puede estar vacio el elemento.")
    private String email;
    @NotNull(message = "No puede estar vacio el elemento.")
    private String password;

    public AuthenticationRequest(){}

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
   

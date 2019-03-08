package com.henrique.HelpDesk.api.security.jwt;

import java.io.Serializable;

public class JwtAuthenticationRequest implements Serializable {

    public static final long serialVersionUID = 1L;

    private String email;
    private String password;

    public JwtAuthenticationRequest() {
        super();
    }

    public JwtAuthenticationRequest(String email, String password) {
        this.setEmail(email);
        this.setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

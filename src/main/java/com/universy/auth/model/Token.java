package com.universy.auth.model;

public class Token {
    private final String username;
    private final String token;

    public Token(String username, String token) {
        this.username = username;
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public String getToken() {
        return token;
    }
}

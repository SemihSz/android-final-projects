package com.example.semihprojects;

public class User {

    private String username;
    private String email;
    private String id;

    public User(String username, String email, String id) {
        this.username = username;
        this.email = email;
        this.id = id;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

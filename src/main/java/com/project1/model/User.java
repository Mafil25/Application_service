package com.project1.model;



public class User{

    private final Long id;
    private final String userName;
    private final String email;


    public User(Long id, String userName, String email) {

        if (id == null) {
            throw new IllegalArgumentException("Argument error, argumet is null|id");
        }

        if (userName == null || userName.isBlank()) {
            throw new IllegalArgumentException("Argument error, argumet is null/empty|ID");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Argument error, argumet is null/empty|email");
        }


        this.id = id;
        this.userName = userName;
        this.email = email;

    }

    public Long getId() {
        return this.id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    
}

package com.project1.model;

public class User {

    private Long ID;
    private String username;
    private String email;
    private Map<Long, Application> ActiveUserApplications = new HashMap<>();

    public User(Long ID, String username, String email) {

        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Argument error, argumet is null/empty|ID");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Argument error, argumet is null/empty|email");
        }

        this.username = username;
        this.email = email;


    }

    private Long getID() {
        return thsis.id;
    }

    private 



    
}

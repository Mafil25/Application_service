package com.project1.model;

import java.util.Objects;

public class Application {

    private final Long id;
    private User user;
    private String title;
    private ApplicationStatus status;
    private ApplicationPriority priority;

    public Application(Long id, User user, String title) {

        if (id == null) {
            throw new IllegalArgumentException("Argument error, argumet is null|id");
        }
        

        if (user == null) {
            throw new IllegalArgumentException("Argument error, argumet is null|user");
        }

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Argument error, argumet is null/empty|title");
        }

        this.id = id;
        this.user = user;
        this.title = title;
        this.status = ApplicationStatus.NEW;
        this.priority = ApplicationPriority.THIRD;
    }

    public Long getId(){
        return id;
    }

    public User getUser(){
        return user.clone();
    }

    public String getTitle(){
        return title;
    }

    public ApplicationStatus getStatus(){
        return status;
    }

    public ApplicationPriority getPriority(){
        return priority;
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Application other = (Application) o;
        return Objects.equals(title, other.title) && Objects.equals(id, other.id);
    }


    @Override
    public int hashCode() {
        return Object.hash(id, title);
    }


    
}

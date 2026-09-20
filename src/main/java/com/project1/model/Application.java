package com.project1.model;

import java.util.Objects;

public class Application {

    private static Long nextid = 0;

    private final Long id;
    private final Long UserID;
    private String title;
    private ApplicationStatus status;
    private ApplicationPriority priority;

    public Application(Long UserID, String title) {

        if (UserID == null) {
            throw new IllegalArgumentException("Argument error, argumet is null|UserID");
        }

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Argument error, argumet is null/empty|title");
        }

        this.id = Application.nextid ++;
        this.UserID = UserID;
        this.title = title;
        this.status = ApplicationStatus.NEW;
        this.priority = ApplicationPriority.THIRD;
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
        return Objects.equals(username, other.username) && Objects.equals(id, other.id);
    }


    @Override
    public int hashCode() {
        return Object.hash(id, title);
    }


    
}

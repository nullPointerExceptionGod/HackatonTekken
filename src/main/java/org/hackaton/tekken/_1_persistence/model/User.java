package org.hackaton.tekken._1_persistence.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User model entity
 */

@Entity
@Table(name = "user")
public class User extends AbstractModel {

    private String username;

    /**
     *
     * @return the user username
     */

    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username the username to set
     */

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}

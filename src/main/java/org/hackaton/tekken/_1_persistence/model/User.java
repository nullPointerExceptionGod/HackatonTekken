package org.hackaton.tekken._1_persistence.model;

/**
 * User model entity
 */


public class User extends AbstractModel {

    private String username;

    private String password;

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

    /**
     *
     * @return the user password
     */

    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password the password to set
     */

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

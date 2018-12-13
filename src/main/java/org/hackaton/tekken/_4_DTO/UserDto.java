package org.hackaton.tekken._4_DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * The {@link org.hackaton.tekken._1_persistence.model.User} data transfer object
 */


public class UserDto {

    private Integer id;

    @NotNull(message = "Name is mandatory")
    @NotBlank(message = "Name is mandatory")
    @Size(min = 3, max = 64)
    private String username;

    /**
     *
     * @return the user _4_DTO id
     */


    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id the id to set
     */

    public void setId(Integer id) {
        this.id = id;
    }

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
     * @see Object#toString()
     */

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}

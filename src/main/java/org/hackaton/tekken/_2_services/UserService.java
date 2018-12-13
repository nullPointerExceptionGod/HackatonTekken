package org.hackaton.tekken._2_services;

import org.hackaton.tekken._1_persistence.model.User;

/**
 * common interface for user services, provides methods to manage users
 */

public interface UserService {

    /**
     *
     * @param id the user id
     * @return the user
     */

    User get(Integer id);

    /**
     *
     * @param user the user to save
     * @return the saved user
     */


    User save(User user);


}

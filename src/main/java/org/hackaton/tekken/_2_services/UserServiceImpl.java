package org.hackaton.tekken._2_services;

import org.hackaton.tekken._1_persistence.dao.UserDAO;
import org.hackaton.tekken._1_persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * An {@link UserService} implementation
 */


@Service
public class UserServiceImpl implements UserService{

    public UserDAO userDAO;


    /**
     *
     * @param userDAO the user DAO to set
     */

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    /**
     *
     * @see UserService#get(Integer)
     */

    @Override
    public User get(Integer id) {
        return userDAO.findById(id);
    }

    /**
     *
     * @see UserService#save(User)
     */

    @Override
    public User save(User user) {
        return userDAO.saveOrUpdate(user);
    }


}

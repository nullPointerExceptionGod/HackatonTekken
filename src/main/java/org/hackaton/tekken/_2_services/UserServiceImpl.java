package org.hackaton.tekken._2_services;

import org.hackaton.tekken._1_persistence.dao.UserDao;
import org.hackaton.tekken._1_persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * An {@link UserService} implementation
 */

@Service
public class UserServiceImpl implements UserService{

    private UserDao userDAO;

    /**
     *
     * @param userDAO the user DAO to set
     */

    @Autowired
    public void setUserDAO(UserDao userDAO) {
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

    @Transactional
    @Override
    public User save(User user) {
        return userDAO.saveOrUpdate(user);
    }

    /**
     *
     * @see UserService#list()
     */

    @Override
    public List<User> list() {

        return userDAO.findAll();
    }
}

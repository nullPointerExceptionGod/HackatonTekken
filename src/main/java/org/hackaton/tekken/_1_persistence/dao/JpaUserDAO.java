package org.hackaton.tekken._1_persistence.dao;

import org.hackaton.tekken._1_persistence.model.User;

public class JpaUserDAO extends JpaGenericDAO<User> implements UserDAO {

    public JpaUserDAO() {
        super(User.class);
    }
}

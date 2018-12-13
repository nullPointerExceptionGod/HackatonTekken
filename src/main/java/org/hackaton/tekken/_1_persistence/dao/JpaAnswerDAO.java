package org.hackaton.tekken._1_persistence.dao;

import org.hackaton.tekken._1_persistence.model.Answer;
import org.springframework.stereotype.Repository;

/**
 * A JPA {@link AnswerDao} implementation
 */

@Repository
public class JpaAnswerDAO extends JpaGenericDAO<Answer> implements AnswerDao {

    public JpaAnswerDAO() {
        super(Answer.class);
    }
}

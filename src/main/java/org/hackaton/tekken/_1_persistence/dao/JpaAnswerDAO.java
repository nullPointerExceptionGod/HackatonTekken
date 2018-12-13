package org.hackaton.tekken._1_persistence.dao;

import org.hackaton.tekken._1_persistence.model.Answer;

public class JpaAnswerDAO extends JpaGenericDAO<Answer> implements AnswerDao {

    public JpaAnswerDAO() {
        super(Answer.class);
    }
}

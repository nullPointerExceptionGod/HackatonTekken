package org.hackaton.tekken._1_persistence.dao;

import org.hackaton.tekken._1_persistence.model.Question;

public class JpaQuestionDAO extends JpaGenericDAO<Question> implements QuestionDAO {

    public JpaQuestionDAO() {
        super(Question.class);
    }
}

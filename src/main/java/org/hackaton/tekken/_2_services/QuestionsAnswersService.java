package org.hackaton.tekken._2_services;

import org.hackaton.tekken._1_persistence.model.Answer;
import org.hackaton.tekken._1_persistence.model.Question;

/**
 * common interface of questions and answers service, provides methods to manage questions
 */

public interface QuestionsAnswersService {

    /**
     *
     * @param id the question id
     * @return the question
     */

    Question getQuestion(Integer id);

    Answer getAnswer(Integer id);





}

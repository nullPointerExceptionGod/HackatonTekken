package org.hackaton.tekken._2_services;

import org.hackaton.tekken._1_persistence.model.Answer;
import org.hackaton.tekken._1_persistence.model.Question;

import java.util.List;

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

    /**
     *
     * @param id the answer id
     * @return the answer
     */


    Answer getAnswer(Integer id);

    /**
     *
     * @return the questions list
     */

    List<Question> listQuestions();



}

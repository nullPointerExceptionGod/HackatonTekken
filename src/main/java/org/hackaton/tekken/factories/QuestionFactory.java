package org.hackaton.tekken.factories;

import org.hackaton.tekken._1_persistence.model.*;
import org.springframework.stereotype.Component;

/**
 * A factory for creating accounts of different types
 */
@Component
public class QuestionFactory {

    /**
     * Creates a new {@link org.hackaton.tekken._1_persistence.model.Question}
     *
     * @param difficulty the account type
     * @return the new account
     */
    public Question createQuestion(Difficulty difficulty) {

        Question newQuestion;

        switch (difficulty) {
            case EASY:
                newQuestion = new EasyQuestion();
                break;
            case MEDIUM:
                newQuestion = new MediumQuestion();
                break;
            /*case HARD:
                newQuestion = new HardQuestion();
                break;*/
            default:
                throw new IllegalArgumentException();
        }

        return newQuestion;
    }
}

package org.hackaton.tekken._1_persistence.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The answer model entity
 */

@Entity
@Table(name = "answer")
public class Answer extends AbstractModel {


   private String validation;
   private String description;

   @ManyToOne
   private Question question;


    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }

    /**
     *
     * @return description the description of answer
     */

    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description set the description of answer
     */

    public void setDescription(String description) {
        this.description = description;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "validation='" + validation + '\'' +
                ", description='" + description + '\'' +
                ", question=" + question +
                '}';
    }
}

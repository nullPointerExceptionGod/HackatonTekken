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


   private boolean isRight;
   private String description;

   @ManyToOne
   private Question question;


    /**
     *
     * @return isRight verifies if answer is right
     */

    public boolean isRight() {
        return isRight;
    }

    /**
     *
     * @param right
     */


    public void setRight(boolean right) {
        isRight = right;
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


    @Override
    public String toString() {
        return "Answer{" +
                "isRight=" + isRight +
                ", description='" + description + '\'' +
                '}';
    }
}

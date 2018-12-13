package org.hackaton.tekken._1_persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Question model entity
 */


@Entity
@Table(name = "question")
public class Question extends AbstractModel {

    private String description;
    private Difficulty difficulty;
    private boolean alreadyUsed;


    @OneToMany(
            // propagate changes on question entity to answer entity
            cascade = {CascadeType.ALL},

            // make sure to remove answers if unlinked from question
            orphanRemoval = true,

            // question foreign key on answer table to establish
            // the many-to-one relationship instead of a join table
            mappedBy = "question",

            // fetch answers from database together with user
            fetch = FetchType.EAGER
    )
    private List<Answer> answers = new ArrayList<>();


    /**
     *
     * @return the description of question
     */

    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }


    /**
     *
     * @return the difficulty of question
     */


    public Difficulty getDifficulty() {
        return difficulty;
    }

    /**
     *
     * @param difficulty the difficulty to set
     */

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    /**
     *
     * @return status of question
     */


    public boolean isAlreadyUsed() {
        return alreadyUsed;
    }

    /**
     *
     * @param alreadyUsed The status of question if was already used or not
     */

    public void setAlreadyUsed(boolean alreadyUsed) {
        this.alreadyUsed = alreadyUsed;
    }

    /**
     *
     * @return list of answers
     */


    public List<Answer> getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "description='" + description + '\'' +
                ", difficulty=" + difficulty +
                '}';
    }
}

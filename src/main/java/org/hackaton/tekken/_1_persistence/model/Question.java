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
     * @return description the description of question
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
     * @return difficulty the difficulty of question
     */


    public Difficulty getDifficulty() {
        return difficulty;
    }

    /**
     *
     * @param difficulty
     */

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Question{" +
                "description='" + description + '\'' +
                ", difficulty=" + difficulty +
                '}';
    }
}

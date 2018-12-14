package org.hackaton.tekken._1_persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Question model entity
 */


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "difficulty",discriminatorType = DiscriminatorType.STRING)
@Table(name = "question")
public abstract class Question extends AbstractModel {

    private String description;

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


    public abstract Difficulty getDifficulty();

    /**
     *
     * @param difficulty the difficulty to set
     */


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
                ", answers=" + answers +
                '}';
    }
}

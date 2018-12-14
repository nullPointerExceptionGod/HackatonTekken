package org.hackaton.tekken._4_DTO;

import org.hackaton.tekken._1_persistence.model.Difficulty;

/**
 * The {@link org.hackaton.tekken._1_persistence.model.Question} data transfer object
 */


public class QuestionDto {


    private Integer id;

    private String description;

    private Difficulty difficulty;

    private boolean alreadyUsed;


    /**
     *
     * @return the question id
     */

    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id the question id to set
     */

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return the difficulty type
     */

    public Difficulty getDifficulty() {
        return difficulty;
    }

    /**
     *
     * @param difficulty the difficulty type to set
     */

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    /**
     *
     * @return the state from question, if was already used or not
     */

    public boolean isAlreadyUsed() {
        return alreadyUsed;
    }

    /**
     *
     * @param alreadyUsed the state of question to set
     */

    public void setAlreadyUsed(boolean alreadyUsed) {
        this.alreadyUsed = alreadyUsed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "QuestionDto{" +
                "id=" + id +
                ", difficulty=" + difficulty +
                ", alreadyUsed=" + alreadyUsed +
                '}';
    }
}

package org.hackaton.tekken._1_persistence.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("medium")
public class MediumQuestion extends Question {

    @Override
    public Difficulty getDifficulty() {
        return Difficulty.MEDIUM;
    }
}

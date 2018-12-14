package org.hackaton.tekken._1_persistence.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("easy")
public class EasyQuestion extends Question{

    @Override
    public Difficulty getDifficulty() {
        return Difficulty.EASY;
    }
}

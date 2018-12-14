package org.hackaton.tekken._1_persistence.model;

import javax.persistence.Entity;

@Entity
public class HardQuestion extends Question {


    @Override
    public Difficulty getDifficulty() {
        return Difficulty.HARD;
    }
}

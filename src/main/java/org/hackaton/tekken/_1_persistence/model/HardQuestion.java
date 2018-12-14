package org.hackaton.tekken._1_persistence.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("hard")
public class HardQuestion extends Question{

    @Override
    public Difficulty getDifficulty() {
        return Difficulty.HARD;
    }
}

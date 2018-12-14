package org.hackaton.tekken._1_persistence.model;

import java.util.Arrays;
import java.util.List;

/**
 * The possible {@link Question} difficulties
 */

public enum Difficulty {

    EASY,
    MEDIUM,
    HARD;

    public static List<Difficulty> list() {
        return Arrays.asList(Difficulty.values());
    }

}

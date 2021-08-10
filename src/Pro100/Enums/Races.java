package Pro100.Enums;

import java.util.Random;

public enum Races {

    BLACK_DRAGON,
    BLUE_DRAGON,
    BRASS_DRAGON,
    BRONZE_DRAGON,
    COPPER_DRAGON,
    GOLD_DRAGON,
    GREEN_DRAGON,
    RED_DRAGON,
    SILVER_DRAGON,
    WHITE_DRAGON,
    WOOD_ELVES,
    HIGH_ELVES,
    DARK_ELVES,
    DEEP_GNOMES,
    FOREST_GNOMES,
    ROCK_GNOMES,
    HALF_ELF,
    LIGHTFOOT_HALFLING,
    STOUT_HALFLING,
    HALF_ORC,
    HUMAN,
    INFERNAL_TIEFLING;


    public static Races randomizeClass(){
        int pick = new Random().nextInt(Races.values().length);
        return Races.values()[pick];
    }

}


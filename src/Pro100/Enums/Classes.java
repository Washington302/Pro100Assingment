package Pro100.Enums;

import java.util.Random;

public enum Classes {
    ARTIFICER,
    BARBARIAN,
    BARD,
    CLERIC,
    DRUID,
    FIGHTER,
    MONK,
    PALADIN,
    RANGER,
    ROGUE,
    SORCERER,
    WARLOCK,
    WIZARD;

    public static Classes randomizeClass(){
        int pick = new Random().nextInt(Classes.values().length);
        return Classes.values()[pick];
    }
}

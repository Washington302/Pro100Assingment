package Pro100.Enums;

import java.util.Random;

public enum Races {

    DRAGONBORN,
    ELF,
    GNOME,
    HALF_ELF,
    HALFLING,
    HALF_ORC,
    HUMAN,
    INFERNAL_TIEFLING;


    public static Races randomizeRace(){
        int pick = new Random().nextInt(Races.values().length);
        return Races.values()[pick];
    }

    public enum Dragonborn{
        BLACK_DRAGON,
        BLUE_DRAGON,
        BRASS_DRAGON,
        BRONZE_DRAGON,
        COPPER_DRAGON,
        GOLD_DRAGON,
        GREEN_DRAGON,
        RED_DRAGON,
        SILVER_DRAGON,
        WHITE_DRAGON;

        public static Dragonborn randomizeClass(){
            int pick = new Random().nextInt(Dragonborn.values().length);
            return Dragonborn.values()[pick];
        }
    }

    public enum Elf{
        WOOD_ELVES,
        HIGH_ELVES,
        DARK_ELVES;

        public static Elf randomizeClass(){
            int pick = new Random().nextInt(Elf.values().length);
            return Elf.values()[pick];
        }
    }

    public enum Gnome{
        DEEP_GNOMES,
        FOREST_GNOMES,
        ROCK_GNOMES;

        public static Gnome randomizeClass(){
            int pick = new Random().nextInt(Gnome.values().length);
            return Gnome.values()[pick];
        }
    }

    public enum Halfling{
        LIGHTFOOT_HALFLING,
        STOUT_HALFLING;

        public static Halfling randomizeHafling(){
            int pick = new Random().nextInt(Halfling.values().length);
            return Halfling.values()[pick];
        }
    }
}



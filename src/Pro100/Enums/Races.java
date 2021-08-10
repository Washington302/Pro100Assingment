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


    public static String randomizeRace(){
        String retVal;
        int pick = new Random().nextInt(Races.values().length);
        Races race = Races.values()[pick];
        switch(race){
            case DRAGONBORN:
                retVal = Dragonborn.randomizeDragonborn();
                break;
            case ELF:
                retVal = Elf.randomizeElf();
                break;
            case GNOME:
                retVal = Gnome.randomizeGnome();
                break;
            case HALFLING:
                retVal =  Halfling.randomizeHafling();
                break;
            default:
                retVal = Races.values()[pick].toString();
        }
        return retVal;
    }

    public enum Dragonborn{
        BLACK_DRAGONBORN,
        BLUE_DRAGONBORN,
        BRASS_DRAGONBORN,
        BRONZE_DRAGONBORN,
        COPPER_DRAGONBORN,
        GOLD_DRAGONBORN,
        GREEN_DRAGONBORN,
        RED_DRAGONBORN,
        SILVER_DRAGONBORN,
        WHITE_DRAGONBORN;

        public static String randomizeDragonborn(){
            int pick = new Random().nextInt(Dragonborn.values().length);
            return Dragonborn.values()[pick].toString();
        }
    }

    public enum Elf{
        WOOD_ELF,
        HIGH_ELF,
        DARK_ELF;

        public static String randomizeElf(){
            int pick = new Random().nextInt(Elf.values().length);
            return Elf.values()[pick].toString();
        }
    }

    public enum Gnome{
        DEEP_GNOME,
        FOREST_GNOME,
        ROCK_GNOME;

        public static String randomizeGnome(){
            int pick = new Random().nextInt(Gnome.values().length);
            return Gnome.values()[pick].toString();
        }
    }

    public enum Halfling{
        LIGHTFOOT_HALFLING,
        STOUT_HALFLING;

        public static String randomizeHafling(){
            int pick = new Random().nextInt(Halfling.values().length);
            return Halfling.values()[pick].toString();
        }
    }
}



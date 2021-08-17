package Pro100.Enums;

import java.util.Random;

public enum Backgrounds {
    ACOLYTE,
    CHARLATAN,
    CRIMINAL,
    ENTERTAINER,
    FOLK_HERO,
    GUILD_ARTISAN,
    HERMIT,
    NOBLE,
    OUTLANDER,
    SAGE,
    SAILOR,
    SOLDIER,
    URCHIN;

    public static Backgrounds randomizeBackground(){
        int pick = new Random().nextInt(Backgrounds.values().length);
        return Backgrounds.values()[pick];
    }
}

//    CRIMINAL_SPY,
//    ENTERTAINER_GLADIATOR,
//    GUILD_MERCHANT,
//    NOBLE_KNIGHT,
//    SAILOR_PIRATE,
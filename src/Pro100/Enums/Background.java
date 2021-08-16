package Pro100.Enums;

import java.util.Random;

public enum Background {
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

    public static Background randomizeBackground(){
        int pick = new Random().nextInt(Background.values().length);
        return Background.values()[pick];
    }
}

//    CRIMINAL_SPY,
//    ENTERTAINER_GLADIATOR,
//    GUILD_MERCHANT,
//    NOBLE_KNIGHT,
//    SAILOR_PIRATE,
package Pro100.Enums;

import java.util.Random;

public class PlayerNames {

    private enum firstName{
        RHARDUR,
        NHEIRAN,
        RAE,
        GREKRADD,
        GRIBEL,
        EF,
        ZELCURTH,
        ZARTH,
        ZOTAEUS,
        DIOHVES,
        BRIMVOMZAD,
        RADJAK,
        MU,
        TALBALDIL,
        IRIE,
        AETTHOS,
        ARKRAKIR,
        AKRIAS,
        MALREUS,
        URINON,
        THETHOR,
        MERIUS,
        AMXIUS,
        ERROS,
        ARKADIDUS,
        LILGORIA,
        QULYPSIS,
        MARISSA,
        ZAGREA,
        ANILAIA,
        LILUPHIS,
        ARIXORI,
        YUZA,
        ORIMAIA,
        LEVTARI,
        SYLLAMIN,
        ELANAN,
        NORWARIN,
        YELCERAN,
        VAFAREN,
        YINSANDORAL,
        GENYARUS,
        ZINPETOR,
        RALOMAER,
        GLYNQUINAL,
        BHARTHRUM,
        DARRON,
        BUNDRAM ,
        THOKOHM,
        BELBREK,
        GRENREN,
        URMRAK,
        BENDAHR ,
        GREMDAR,
        BUNGARN;

        public static firstName randomizeFirstName(){
            int pick = new Random().nextInt(firstName.values().length);
            return firstName.values()[pick];
        }

    }

    private enum middleName{

    }

    private enum lastName{
        ROHU,
        CAHD,
        FOGBROW,
        RAVENGLOOM,
        SHETSK,
        SIKIRSK,
        HAVENWOUND,
        FILLHELM,
        DISCRELTALD,
        RENTHUHR,
        NULBYARADYE,
        TRYATHYALDYE,
        NAING,
        ZIAO,
        JANASCI,
        GANESTE,
        WOODSENSE,
        FIRSPELL,
        BIRCHSMILE,
        WOODWISH,
        ASPENPRIDE,
        AHORNANTHRIANT,
        OMOSAMA,
        HAELIRRESTRIENN,
        LAESHAN,
        YIAVOLKIPHASH,
        MOLTENGRIP,
        KEENSTRIKE,
        GOLDENBELT,
        MOLTENHAND,
        HAMMERWARD,
        THRODAHAR,
        LETGUM,
        BOMNURUM,
        DEMNEHUHK,
        DUZZUN;

        public static lastName randomizeFirstName(){
            int pick = new Random().nextInt(lastName.values().length);
            return lastName.values()[pick];
        }
    }

}

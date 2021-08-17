package Pro100.Enums;

import java.util.Random;

public class PlayerNames {

    public enum firstName{
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

    public enum middleName{
        A,
        B,
        C,
        D,
        E,
        F,
        G,
        H,
        I,
        J,
        K,
        L,
        M,
        N,
        O,
        P,
        Q,
        R,
        S,
        T,
        U,
        V,
        W,
        X,
        Y,
        Z;

        public static String randomizeMiddleName(){
            int pick = new Random().nextInt(middleName.values().length);
            return middleName.values()[pick].toString() + ".";
        }

    }

    public enum lastName{
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

        public static lastName randomizeLastName(){
            int pick = new Random().nextInt(lastName.values().length);
            return lastName.values()[pick];
        }
    }

}

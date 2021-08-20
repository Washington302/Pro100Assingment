package Pro100.Enums;
import java.util.Random;

public class Backstory {

    //25 for each enum
    //5 enums
    public enum origin{
        POOR        ("You grew up poor from"),
        RICH        ("You grew up rich from"),
        S_GOD       ("Your birth was gods second mistake, starting in"),
        MERCHANT    ("You grew up the child of a powerful merchant from"),
        ASSASSIN    ("You grew up the child of an assassin from"),
        //5
        SLAVE       ("At a young age you were enslaved and held captive in"),
        MAGE        ("The first thing you remember is when you accidentally found your way into a magic college in"),
        CHIEF       ("You grew up the pampered child of a village chief from"),
        BLACKSMITH  ("You grew up around the forge of your blacksmith father from"),
        NOBLE       ("You grew up the favorite child of a powerful noble from"),
        //10
        F_NOBLE     ("You grew up the child of a once powerful, now powerless Noble from"),
        PEASANT     ("You grew up the child of a poor farmer in"),
        FISHERMAN   ("You grew up the child of a small village fisherman from"),
        PIRATE      ("You grew up with a group of pirates from"),
        ORPHAN      ("You grew up an orphan with no money or will to live from"),
        //15
        ;

        private String desc;

        public String getDesc(){
            return this.desc;
        }

        private origin(String desc){
            this.desc = desc;
        }

        public static String randomizeOrigin(){
            int pick = new Random().nextInt(Backstory.origin.values().length);
            return Backstory.origin.values()[pick].getDesc();
        }
    }

    public enum location{
        FOREST      ("the forest"),
        DESERT      ("the desert"),
        TUNDRA      ("the tundra"),
        SNOW        ("the snowy plains"),
        PLAINS      ("the plains"),
        //5
        CITY        ("the city"),
        SWAMPS      ("the swamp"),
        CAVES       ("a massive cave"),
        MOUNTAIN    ("in the mountains"),
        SEWERS      ("in the sewers"),
        //10
        COAST       ("the coast of a great ocean"),
        OCEAN       ("the ocean"),
        PIRATES     ("on a pirate ship")
        ;

        private String desc;

        public String getDesc(){
            return this.desc;
        }

        private location(String desc){
            this.desc = desc;
        }

        public static String randomizeLocation() {
            int pick = new Random().nextInt(Backstory.location.values().length);
            return Backstory.location.values()[pick].getDesc();
        }
    }

    public enum majorEvent{
        M_DEAD      ("until your mother was murdered"),
        G_DEAD      ("until your grandparents where murdered"),
        D_DEAD      ("until your father was murdered"),
        S_GOD1      ("until you stubbed your toe on the side of a table when you woke up"),
        S_GOD2      ("until the sun woke you up earlier than you wanted in the morning"),
        //5
        DOG         ("until your dog ran away"),
        GOBLIN      ("until your pet goblin (for legal reasons its actually just a really big frog) ran away"),
        ASSASSIN    ("until someone attempted to assassinate you"),
        VAMPIRE     ("until a powerful vampire (or a normal bat) tried to suck your blood"),
        WEREWOLF    ("until your home was attack by werewolves"),
        //10
        VIBE        ("until you simply no longer vibed with the situation and left"),
        EZBAKE      ("until someone replaced your stomach with an ezbake oven"),
        ;


        private String desc;

        public String getDesc(){
            return this.desc;
        }

        private majorEvent(String desc){
            this.desc = desc;
        }

        public static String randomizeMajorEvent() {
            int pick = new Random().nextInt(Backstory.majorEvent.values().length);
            return Backstory.majorEvent.values()[pick].getDesc();
        }
    }

    public enum travel{
        FOREST          ("traveling through a great forest"),
        DESERT          ("traveling through a great desert"),
        TUNDRA          ("traveling through a great tundra"),
        SNOW            ("traveling through a great snowy plains"),
        PLAINS          ("traveling through a great plains"),
        //5
        CITY            ("traveling through a great city"),
        SWAMP           ("traveling through a great swamp"),
        CAVES           ("traveling through a large cave system"),
        MOUNTAIN        ("traveling through the mountains"),
        UNDERGROUND     ("traveling through the underground"),
        //10
        COAST           ("traveling along the coast of a great ocean"),
        OCEAN           ("sailing across a great ocean"),
        PIRATE          ("sailing across the ocean on a pirate ship")
        ;

        private String desc;

        public String getDesc(){
            return this.desc;
        }

        private travel(String desc){
            this.desc = desc;
        }

        public static String randomizeTravel(){
            int pick = new Random().nextInt(Backstory.travel.values().length);
            return Backstory.travel.values()[pick].getDesc();
        }
    }

    public enum goal{
        DRUNK       ("wanting to find the strongest booze and to get absolutely wasted"),
        STRONG      ("to become the strongest person in the world"),
        CHEESE_LORE ("to find the almighty Cheese Man"),
        CHEESE      ("to collect all the cheese in the world"),
        HORNY       ("to have sex with a creature of every race"),
        //5
        KILL_GOD    ("to slay god"),
        BECOME_GOD  ("to become god"),
        S_GOD       ("to get revenge on god"),
        POLITICS    ("to become a powerful politician"),
        EXPLORER    ("to explore the entire world"),
        //10
        ANIME       ("to find the one piece"),
        HERO        ("to become a world renown hero"),
        PIRATE      ("to become an infamous pirate")

        ;

        private String desc;

        public String getDesc(){
            return this.desc;
        }

        private goal(String desc){
            this.desc = desc;
        }

        public static String randomizeGoal(){
            int pick = new Random().nextInt(Backstory.goal.values().length);
            return Backstory.goal.values()[pick].getDesc();
        }
    }


    public static String randomizeBackstory(){
        return origin.randomizeOrigin() + " " + location.randomizeLocation() + " " + majorEvent.randomizeMajorEvent()
                + ", after which you started " + travel.randomizeTravel() + "\non a journey " + goal.randomizeGoal() + ".";
    }

}

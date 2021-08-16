package Pro100;

import Pro100.Enums.Classes;
import Pro100.Enums.PlayerNames;
import Pro100.Enums.Races;
import lib.ConsoleIO;

import java.sql.Time;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static java.time.chrono.JapaneseEra.values;

public class Menus {
    public  static String Race = null;
    public static String Class = null;
    public static String Background = null;
    public static String Name = null;
    //loop until quit
    public static void MainMenu() throws InterruptedException {
        System.out.println("\n\n");
        System.out.println("Welcome. Select an item below to begin making your character.");

        String[] menu = {
                "Start Fresh",
                "Roll random"
        };

        int choice = ConsoleIO.promptForMenuSelection(menu, true);

        switch (choice) {
            case 1 -> {
                System.out.println("Menu Selected: START FRESH");
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                StartCharacter();
                TimeUnit.SECONDS.sleep(1);
            }
            case 2 -> {
                System.out.println("Menu Selected: ROLL RANDOM");
                TimeUnit.SECONDS.sleep(1);
                CharacterGen.RandomCharacter();
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }

    public static void StartCharacter() throws InterruptedException {
        System.out.println("This has yet to be implemented fully. Check back later.");
        SelectRace();
        System.out.println("Your current race is: " + Race);
        SelectClass();
        System.out.println("Your current class is: " + Class);
        SelectBackground();
        System.out.println("Your current background is: " + Background);
        SelectName();
        System.out.println("Your current name is: " + Name);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("All done!");
        ConfirmCharacter();
    }
    public static void SelectRace() throws  InterruptedException{
        String[] menu = {
                "Dragonborn",
                "Elf",
                "Gnome",
                "Half Elf",
                "Halfling",
                "Half Orc",
                "Human",
                "Infernal Tiefling"
        };
        System.out.println();
        System.out.println();
        System.out.println("First things first, Race.");
        TimeUnit.SECONDS.sleep(1);
        int choice = ConsoleIO.promptForMenuSelection(menu, true);

        switch (choice) {
            case 1 -> {
                System.out.println("Race: Dragonborn");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Dragonborns.");
                System.out.println();
                FileIO.searchFileRace("Dragonborn");
                System.out.println();
                Race = "Dragonborn";
                TimeUnit.SECONDS.sleep(1);
            }
            case 2 -> {
                System.out.println("Race: Elf");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Elves.");
                System.out.println();
                FileIO.searchFileRace("Elf");
                System.out.println();
                Race = "Elf";
                TimeUnit.SECONDS.sleep(1);
            }
            case 3 -> {
                System.out.println("Race: Gnome");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Gnomes.");
                System.out.println();
                FileIO.searchFileRace("Gnome");
                System.out.println();
                Race = "Gnome";
                TimeUnit.SECONDS.sleep(1);
            }
            case 4 -> {
                System.out.println("Race: Half Elf");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Half Elves.");
                System.out.println();
                FileIO.searchFileRace("Half Elf");
                System.out.println();
                Race = "Half-Elf";
                TimeUnit.SECONDS.sleep(1);
            }
            case 5 -> {
                System.out.println("Race: Halfling");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Halflings.");
                System.out.println();
                FileIO.searchFileRace("Halfling");
                System.out.println();
                Race = "Halfling";
                TimeUnit.SECONDS.sleep(1);
            }
            case 6 -> {
                System.out.println("Race: Half Orc");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Half Orcs.");
                System.out.println();
                FileIO.searchFileRace("Half-Orc");
                System.out.println();
                Race = "Half-Orc";
                TimeUnit.SECONDS.sleep(1);
            }
            case 7 -> {
                System.out.println("Race: Human");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Humans.");
                System.out.println();
                FileIO.searchFileRace("Human");
                System.out.println();
                Race = "Human";
                TimeUnit.SECONDS.sleep(1);
            }
            case 8 -> {
                System.out.println("Race: Infernal Tiefling");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Tieflings.");
                System.out.println();
                FileIO.searchFileRace("Tiefling");
                System.out.println();
                Race = "Tiefling";
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }
    public static void SelectClass() throws InterruptedException {
        String[] menu = {
                "Artificer",
                "Barbarian",
                "Bard",
                "Cleric",
                "Druid",
                "Fighter",
                "Monk",
                "Paladin",
                "Ranger",
                "Rogue",
                "Sorcerer",
                "Warlock",
                "Wizard"
        };
        System.out.println();
        System.out.println();
        System.out.println("Next up, your Class.");
        TimeUnit.SECONDS.sleep(1);
        int choice = ConsoleIO.promptForMenuSelection(menu, true);

        switch (choice) {
            case 1 -> {
                System.out.println("Class: Artificer");
                TimeUnit.SECONDS.sleep(1);
                Class = "Artificer";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 2 -> {
                System.out.println("Class: Barbarian");
                TimeUnit.SECONDS.sleep(1);
                Class = "Barbarian";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 3 -> {
                System.out.println("Class: Bard");
                TimeUnit.SECONDS.sleep(1);
                Class = "Bard";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 4 -> {
                System.out.println("Class: Cleric");
                TimeUnit.SECONDS.sleep(1);
                Class = "Cleric";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 5 -> {
                System.out.println("Class: Druid");
                TimeUnit.SECONDS.sleep(1);
                Class = "Druid";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 6 -> {
                System.out.println("Class: Fighter");
                TimeUnit.SECONDS.sleep(1);
                Class = "Fighter";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 7 -> {
                System.out.println("Class: Monk");
                TimeUnit.SECONDS.sleep(1);
                Class = "Monk";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 8 -> {
                System.out.println("Class: Paladin");
                TimeUnit.SECONDS.sleep(1);
                Class = "Paladin";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 9 -> {
                System.out.println("Class: Ranger");
                TimeUnit.SECONDS.sleep(1);
                Class = "Ranger";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 10 -> {
                System.out.println("Class: Rogue");
                TimeUnit.SECONDS.sleep(1);
                Class = "Rogue";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 11 -> {
                System.out.println("Class: Sorcerer");
                TimeUnit.SECONDS.sleep(1);
                Class = "Sorcerer";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 12 -> {
                System.out.println("Class: Warlock");
                TimeUnit.SECONDS.sleep(1);
                Class = "Warlock";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 13 -> {
                System.out.println("Class: Wizard");
                TimeUnit.SECONDS.sleep(1);
                Class = "Wizard";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }
    public static void SelectBackground() throws InterruptedException {
        String[] menu = {
                "Acolyte",
                "Charlatan",
                "Criminal",
                "Entertainer",
                "Folk Hero",
                "Build Artisan",
                "Hermit",
                "Noble",
                "Outlander",
                "Sage",
                "Sailor",
                "Soldier",
                "Urchin"
        };
        System.out.println();
        System.out.println();
        System.out.println("And now you're background.");
        TimeUnit.SECONDS.sleep(1);
        int choice = ConsoleIO.promptForMenuSelection(menu, true);

        switch (choice) {
            case 1 -> {
                System.out.println("Background: Acolyte");
                TimeUnit.SECONDS.sleep(1);
                Background = "Acolyte";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 2 -> {
                System.out.println("Background: Charlatan");
                TimeUnit.SECONDS.sleep(1);
                Background = "Charlatan";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 3 -> {
                System.out.println("Background: Criminal");
                TimeUnit.SECONDS.sleep(1);
                Background = "Criminal";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 4 -> {
                System.out.println("Background: Entertainer");
                TimeUnit.SECONDS.sleep(1);
                Background = "Entertainer";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 5 -> {
                System.out.println("Background: Folk Hero");
                TimeUnit.SECONDS.sleep(1);
                Background = "Folk Hero";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 6 -> {
                System.out.println("Background: Build Artisan");
                TimeUnit.SECONDS.sleep(1);
                Background = "Build Artisan";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 7 -> {
                System.out.println("Background: Hermit");
                TimeUnit.SECONDS.sleep(1);
                Background = "Hermit";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 8 -> {
                System.out.println("Background: Noble");
                TimeUnit.SECONDS.sleep(1);
                Background = "Noble";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 9 -> {
                System.out.println("Background: Outlander");
                TimeUnit.SECONDS.sleep(1);
                Background = "Outlander";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 10 -> {
                System.out.println("Background: Sage");
                TimeUnit.SECONDS.sleep(1);
                Background = "Sage";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 11 -> {
                System.out.println("Background: Sailor");
                TimeUnit.SECONDS.sleep(1);
                Background = "Sailor";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 12 -> {
                System.out.println("Background: Soldier");
                TimeUnit.SECONDS.sleep(1);
                Background = "Soldier";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 13 -> {
                System.out.println("Background: Urchin");
                TimeUnit.SECONDS.sleep(1);
                Background = "Urchin";
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }
    public static void SelectName() throws  InterruptedException{
        System.out.println("\n\n");
        System.out.println("What should you be called?");

        String[] menu = {
                "Input Name",
                "Roll Random Name"
        };

        int choice = ConsoleIO.promptForMenuSelection(menu, true);

        switch (choice) {
            case 1 -> {
                System.out.println("Selected: Input Name");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright then, what should we call you?");
                Name = ConsoleIO.promptForString("What is your name?", false);
                TimeUnit.SECONDS.sleep(1);
            }
            case 2 -> {
                System.out.println("Menu Selected: ROLL RANDOM");
                TimeUnit.SECONDS.sleep(1);
                PlayerNames.firstName firstName = PlayerNames.firstName.randomizeFirstName();
                PlayerNames.lastName lastName = PlayerNames.lastName.randomizeLastName();
                Name = firstName + " " + lastName;
                System.out.println("Your name is " + firstName + " " + lastName);
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }
    public static void EditCharacter() throws InterruptedException{
        System.out.println("\n\n");
        System.out.println("What would you like to edit?");

        String[] menu = {
                "Race",
                "Class",
                "Background",
                "Name",
                "I changed my mind"
        };

        int choice = ConsoleIO.promptForMenuSelection(menu, true);

        switch (choice) {
            case 1 -> {
                System.out.println("Selected: Race");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Your current race is: " + Race.toUpperCase());
                SelectRace();
                TimeUnit.SECONDS.sleep(1);
            }
            case 2 -> {
                System.out.println("Selected: Class");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Your current class is: " + Class.toUpperCase());
                SelectClass();
                TimeUnit.SECONDS.sleep(1);
            }
            case 3 -> {
                System.out.println("Selected: Background");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Your current background is: " + Background.toUpperCase());
                SelectBackground();
                TimeUnit.SECONDS.sleep(1);
            }
            case 4 -> {
                System.out.println("Selected: Name");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Your current name is: " + Name.toUpperCase());
                SelectName();
                TimeUnit.SECONDS.sleep(1);
            }
            case 5 -> {
                System.out.println("Selected: Changed Mind");
                TimeUnit.SECONDS.sleep(1);
                ConfirmCharacter();
                TimeUnit.SECONDS.sleep(1);
            }
        }

        ConfirmCharacter();
    }
    public static void ConfirmCharacter() throws InterruptedException {
        System.out.println("You are " + Name + ", a " + Race + " " + Class + " who grew up as a " + Background + ".");
        System.out.println("Does this sound right?");

        String[] menu = {
                "Yes",
                "No"
        };

        int choice = ConsoleIO.promptForMenuSelection(menu, true);

        switch (choice) {
            case 1 -> {
                System.out.println("Selected: YES");
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println("\n\n");
                System.out.println("Would you like to make another character?");

                String[] menu01 = {
                        "Yes",
                        "No"
                };

                int choice01 = ConsoleIO.promptForMenuSelection(menu01, true);

                switch (choice01) {
                    case 1 -> {
                        System.out.println("Selected: Yes");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println();
                        MainMenu();
                        TimeUnit.SECONDS.sleep(1);
                    }
                    case 2 -> {
                        System.out.println("Selected: No");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Sweet! See ya later then ^w^");
                    }
                }
                TimeUnit.SECONDS.sleep(1);
            }
            case 2 -> {
                System.out.println("Selected: NO");
                TimeUnit.SECONDS.sleep(1);
                EditCharacter();
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }
}
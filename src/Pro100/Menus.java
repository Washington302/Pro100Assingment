package Pro100;

import Pro100.Enums.Classes;
import Pro100.Enums.Races;
import lib.ConsoleIO;

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
            }case 7 -> {
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
                "Claric",
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
                System.out.println("Race: Dragonborn");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Dragonborns.");
                System.out.println();
                FileIO.searchFileRace("Dragonborn");
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 2 -> {
                System.out.println("Race: Elf");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Elves.");
                System.out.println();
                FileIO.searchFileRace("Elf");
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 3 -> {
                System.out.println("Race: Gnome");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Gnomes.");
                System.out.println();
                FileIO.searchFileRace("Gnome");
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 4 -> {
                System.out.println("Race: Half Elf");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Half Elves.");
                System.out.println();
                FileIO.searchFileRace("Half Elf");
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 5 -> {
                System.out.println("Race: Halfling");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Halflings.");
                System.out.println();
                FileIO.searchFileRace("Halfling");
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 6 -> {
                System.out.println("Race: Half Orc");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Half Orcs.");
                System.out.println();
                FileIO.searchFileRace("Half-Orc");
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }case 7 -> {
                System.out.println("Race: Human");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Humans.");
                System.out.println();
                FileIO.searchFileRace("Human");
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 8 -> {
                System.out.println("Race: Infernal Tiefling");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Tieflings.");
                System.out.println();
                FileIO.searchFileRace("Tiefling");
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 9 -> {
                System.out.println("Race: InfTiefling");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Tieflings.");
                System.out.println();
                FileIO.searchFileRace("Tiefling");
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 10 -> {
                System.out.println("Race: Infrnal Tiefling");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Tieflings.");
                System.out.println();
                FileIO.searchFileRace("Tiefling");
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 11 -> {
                System.out.println("Race: Inrnal Tiefling");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Tieflings.");
                System.out.println();
                FileIO.searchFileRace("Tiefling");
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 12 -> {
                System.out.println("Race: Infern Tiefling");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Tieflings.");
                System.out.println();
                FileIO.searchFileRace("Tiefling");
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
            case 13 -> {
                System.out.println("Race: Inal Tiefling");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Alright, here's all we have on Tieflings.");
                System.out.println();
                FileIO.searchFileRace("Tiefling");
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }
}


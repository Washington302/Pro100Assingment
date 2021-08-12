package Pro100;

import Pro100.Enums.Background;
import Pro100.Enums.Classes;
import Pro100.Enums.PlayerNames;
import Pro100.Enums.Races;
import Pro100.Stats.Stats;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        FileIO file = new FileIO();

      /*  boolean cheese = true;
        file.searchFile("Dwarf");
        //testing
        Stats stats = new Stats();
        Background background;
        String race;
        Classes classes;
        PlayerNames.firstName firstName;
        PlayerNames.lastName lastName;

        for(int i = 0; i < 100; i++) {
            background = Background.randomizeBackground();
            race = Races.randomizeRace();
            classes = Classes.randomizeClass();
            firstName = PlayerNames.firstName.randomizeFirstName();
            lastName = PlayerNames.lastName.randomizeLastName();
            System.out.print("You are " + firstName + " " + lastName + ", the " + race + " " + classes + " you grew up as a " + background);
            int[] output = stats.getStatsOrdered(classes);
            System.out.print(", Your stats are: ");
            for(int l = 0; l <= 5; l++){
                System.out.print(output[l]);
                if(l != 5){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }*/
        file.searchFile("Gnome");
        file.searchFile("Dwarf");
        file.searchFile("Elf");
        file.searchFile("Dragonborn");
        file.searchFile("Half-Elf");
//        Menus.MainMenu();
    }
}

package Pro100;

import Pro100.Enums.Background;
import Pro100.Enums.Classes;
import Pro100.Enums.PlayerNames;
import Pro100.Enums.Races;
import Pro100.Stats.Stats;
import lib.ConsoleIO;

import java.util.concurrent.TimeUnit;

public class CharacterGen {
    public static void RandomCharacter() throws InterruptedException {
        //FileIO file = new FileIO();
        boolean cheese = true;
        //testing
        Stats stats = new Stats();
        Background background;
        String race;
        Classes classes;
        PlayerNames.firstName firstName;
        PlayerNames.lastName lastName;

        int maxCharacters = ConsoleIO.promptForInt("How many characters would you like to make?: ", 1, 999);

        for(int i = 0; i < maxCharacters; i++) {
            background = Background.randomizeBackground();
            race = Races.randomizeRace();
            classes = Classes.randomizeClass();
            firstName = PlayerNames.firstName.randomizeFirstName();
            lastName = PlayerNames.lastName.randomizeLastName();
            System.out.print("You are " + firstName + " " + lastName + ", the " + race + " " + classes + " you grew up as a " + background);
            int[] output = stats.getStatsOrdered(classes);
            System.out.print(", Your base stats are: \n\t");
            for(int l = 0; l <= 5; l++){
                System.out.print(output[l]);
                if(l != 5){
                    System.out.print(", \n\t");
                }
            }
            System.out.println();
            System.out.println();
        }
        TimeUnit.SECONDS.sleep((long) 1.5);
        //file.searchFileRace("Gnome");
    }
}

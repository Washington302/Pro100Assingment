package Pro100;

import lib.ConsoleIO;

import java.util.concurrent.TimeUnit;

    public class Menus {
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
                case 1:
                    System.out.println("Menu Selected: START FRESH");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println();
                    StartCharacter();
                    TimeUnit.SECONDS.sleep(1);
                    break;
                case 2:
                    System.out.println("Menu Selected: ROLL RANDOM");
                    TimeUnit.SECONDS.sleep(1);

                    CharacterGen.RandomCharacter();

                    TimeUnit.SECONDS.sleep(1);
                    break;
            }
        }

        public static void StartCharacter(){
            System.out.println("This has yet to be implemented fully. Check back later.");
        }
    }


package Pro100;

import lib.ConsoleIO;

import java.util.concurrent.TimeUnit;

    public class Menus {
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
                    TimeUnit.SECONDS.sleep(1);
                    break;
                case 2:
                    System.out.println("Menu Selected: ROLL RANDOM");
                    TimeUnit.SECONDS.sleep(1);

                    TimeUnit.SECONDS.sleep(1);
                    break;
            }
        }

        public static void StartCharacter(){

        }
    }


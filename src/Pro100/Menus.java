package Pro100;

import lib.ConsoleIO;

import java.util.concurrent.TimeUnit;

    public class Menus {
        public static void MainMenu() throws InterruptedException {
            System.out.println("\n\n");

            String[] menu = {
                    "Begin Game...",
                    "Options..."
            };

            int choice = ConsoleIO.promptForMenuSelection(menu, true);

            switch (choice) {
                case 1:
                    System.out.println("Menu Selected: BEGIN GAME");
                    TimeUnit.SECONDS.sleep(1);

                    TimeUnit.SECONDS.sleep(1);
                    break;
                case 2:
                    System.out.println("Menu Selected: OPTIONS");
                    TimeUnit.SECONDS.sleep(1);

                    TimeUnit.SECONDS.sleep(1);
                    break;
            }
        }
    }


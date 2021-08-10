package Pro100;

import Pro100.Enums.Background;
import Pro100.Stats.Stats;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        boolean cheese = true;
        // write your code here
        //Hello partay people
        //hello
        //dis be on my branch?

        //testing that the background works
        Stats stats = new Stats();

        for(int i = 0; i < 10; i++) {
            int[] output = stats.getStatsRandom();
            System.out.print("Your stats are: ");
            for(int l = 0; l <= 5; l++){
                System.out.print(output[l]);
                if(l != 5){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

    }
}

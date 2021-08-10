package Pro100.Stats;

import Pro100.Enums.Classes;

import java.util.Random;

public class Stats {

    public static int[] getStatsRandom(){
        int[] retVal = new int[6];

        for(int i = 0; i <= 5; i++){
            retVal[i] = rollStats();
        }

        return retVal;
    }


    public static int[] getStatsOrdered(Classes playerClass){
        int[] retVal = new int[6];
        return retVal;
    }

    public static int[] orderStats (int[] rawStats, Classes playerClass){
        int[] newStats = new int[rawStats.length];
        return newStats;
    }

    public static int rollStats(){
        int retVal;
        int[] gettingStats = new int[4];

        //roll four six sided dice
        for (int x = 0; x <= 3; x++) {
            gettingStats[x] = roll(1,6);
        }

        //Find the lowest
        if (gettingStats[0] <= gettingStats[1] && gettingStats[0] <= gettingStats[2] && gettingStats[0] <= gettingStats[3]) {
            retVal = gettingStats[1] + gettingStats[2] + gettingStats[3];
        } else if (gettingStats[1] <= gettingStats[2] && gettingStats[1] <= gettingStats[3]) {
            retVal = gettingStats[0] + gettingStats[2] + gettingStats[3];
        } else if (gettingStats[2] <= gettingStats[3]) {
            retVal = gettingStats[0] + gettingStats[1] + gettingStats[3];
        } else {
            retVal = gettingStats[0] + gettingStats[1] + gettingStats[2];
        }

        return retVal;
    }

    public static int roll(int min, int max){
        int numRolled = 0;
        numRolled = new Random().nextInt(max - min + 1) + min;
        return numRolled;
    }
}

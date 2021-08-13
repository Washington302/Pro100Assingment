package Pro100.Stats;

import Pro100.Enums.Classes;

import java.util.Arrays;
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
        for(int i = 0; i <= 5; i++){
            retVal[i] = rollStats();
        }
        reorderStats(retVal);
        retVal = orderStats(retVal, playerClass);
        return retVal;
    }

    public static int[] orderStats (int[] rawStats, Classes playerClass){
        rawStats = switch (playerClass) {
            case BARD               -> orderStatsBard(rawStats);
            case DRUID              -> orderStatsDruid(rawStats);
            case ROGUE              -> orderStatsRogue(rawStats);
            case CLERIC             -> orderStatsCleric(rawStats);
            case FIGHTER            -> orderStatsFighter(rawStats);
            case PALADIN            -> orderStatsPaladin(rawStats);
            case BARBARIAN          -> orderStatsBarbarian(rawStats);
            case MONK, RANGER       -> orderStatsMonkRanger(rawStats);
            case WARLOCK, SORCERER  -> orderStatsWarlockSorc(rawStats);
            case WIZARD, ARTIFICER  -> orderStatsWizardArtificer(rawStats);
        };
        return rawStats;
    }


    //util

    public static void reorderStats(int[] nums){
        Arrays.sort(nums);
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
        return new Random().nextInt(max - min + 1) + min;
    }

    //Order Stats (there are so many ;-;)
    public static int[] orderStatsBard(int[] nums){
        int[] retVal = new int[nums.length];
        /*Str*/retVal[0] = nums[0];
        /*Dex*/retVal[1] = nums[4];
        /*Con*/retVal[2] = nums[3];
        /*Int*/retVal[3] = nums[1];
        /*Wis*/retVal[4] = nums[2];
        /*Cha*/retVal[5] = nums[5];
        return retVal;
    }
    public static int[] orderStatsMonkRanger(int[] nums){
        int[] retVal = new int[nums.length];
        /*Str*/retVal[0] = nums[2];
        /*Dex*/retVal[1] = nums[5];
        /*Con*/retVal[2] = nums[3];
        /*Int*/retVal[3] = nums[1];
        /*Wis*/retVal[4] = nums[4];
        /*Cha*/retVal[5] = nums[0];
        return retVal;
    }
    public static int[] orderStatsDruid(int[] nums){
        int[] retVal = new int[nums.length];
        /*Str*/retVal[0] = nums[2];
        /*Dex*/retVal[1] = nums[3];
        /*Con*/retVal[2] = nums[4];
        /*Int*/retVal[3] = nums[1];
        /*Wis*/retVal[4] = nums[5];
        /*Cha*/retVal[5] = nums[0];
        return retVal;
    }
    public static int[] orderStatsRogue(int[] nums){
        int[] retVal = new int[nums.length];
        /*Str*/retVal[0] = nums[0];
        /*Dex*/retVal[1] = nums[5];
        /*Con*/retVal[2] = nums[4];
        /*Int*/retVal[3] = nums[3];
        /*Wis*/retVal[4] = nums[2];
        /*Cha*/retVal[5] = nums[1];
        return retVal;
    }
    public static int[] orderStatsCleric(int[] nums){
        int[] retVal = new int[nums.length];
        /*Str*/retVal[0] = nums[3];
        /*Dex*/retVal[1] = nums[2];
        /*Con*/retVal[2] = nums[4];
        /*Int*/retVal[3] = nums[0];
        /*Wis*/retVal[4] = nums[5];
        /*Cha*/retVal[5] = nums[1];
        return retVal;
    }
    public static int[] orderStatsWizardArtificer(int[] nums){
        int[] retVal = new int[nums.length];
        /*Str*/retVal[0] = nums[0];
        /*Dex*/retVal[1] = nums[3];
        /*Con*/retVal[2] = nums[4];
        /*Int*/retVal[3] = nums[5];
        /*Wis*/retVal[4] = nums[2];
        /*Cha*/retVal[5] = nums[1];
        return retVal;
    }
    public static int[] orderStatsFighter(int[] nums){
        int[] retVal = new int[nums.length];
        /*Str*/retVal[0] = nums[5];
        /*Dex*/retVal[1] = nums[3];
        /*Con*/retVal[2] = nums[4];
        /*Int*/retVal[3] = nums[2];
        /*Wis*/retVal[4] = nums[1];
        /*Cha*/retVal[5] = nums[0];
        return retVal;
    }
    public static int[] orderStatsPaladin(int[] nums){
        int[] retVal = new int[nums.length];
        /*Str*/retVal[0] = nums[4];
        /*Dex*/retVal[1] = nums[1];
        /*Con*/retVal[2] = nums[5];
        /*Int*/retVal[3] = nums[0];
        /*Wis*/retVal[4] = nums[2];
        /*Cha*/retVal[5] = nums[3];
        return retVal;
    }
    public static int[] orderStatsWarlockSorc(int[] nums){
        int[] retVal = new int[nums.length];
        /*Str*/retVal[0] = nums[0];
        /*Dex*/retVal[1] = nums[3];
        /*Con*/retVal[2] = nums[4];
        /*Int*/retVal[3] = nums[1];
        /*Wis*/retVal[4] = nums[2];
        /*Cha*/retVal[5] = nums[5];
        return retVal;
    }
    public static int[] orderStatsBarbarian(int[] nums){
        int[] retVal = new int[nums.length];
        /*Str*/retVal[0] = nums[4];
        /*Dex*/retVal[1] = nums[3];
        /*Con*/retVal[2] = nums[5];
        /*Int*/retVal[3] = nums[0];
        /*Wis*/retVal[4] = nums[2];
        /*Cha*/retVal[5] = nums[1];
        return retVal;
    }
}

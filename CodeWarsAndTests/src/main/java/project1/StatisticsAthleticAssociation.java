package project1;

import java.util.Arrays;

public class StatisticsAthleticAssociation {
    public static void main(String[] args) {
        System.out.println(stat("12|15|59, 2|47|16, 02|17|20, 2|32|34, 2|17|17, 19|22|00"));
    }
    public static String stat(String strg) {
        String[] strArr = strg.split(", ");
        int[] secRes = new int[strArr.length];
        for (int i = 0; i < secRes.length; i++) {
            String[] data = strArr[i].split("\\|");
            secRes[i] = Integer.parseInt(data[0]) * 3600 + Integer.parseInt(data[1]) * 60 + Integer.parseInt(data[2]);
        }
        int temp;
        for (int i = 0; i < secRes.length - 1; i++) {
            for (int j = i + 1; j < secRes.length; j++) {
                if (secRes[i] > secRes[j]) {
                    temp = secRes[i];
                    secRes[i] = secRes[j];
                    secRes[j] = temp;
                }
            }
        }
        int range = secRes[secRes.length -1] - secRes[0];
        System.out.println(range);
        int sum = 0;
        for (int i = 0; i < secRes.length; i++) sum += secRes[i];
        int average = sum / secRes.length;
        System.out.println(average);
        int median = (!(secRes.length%2 == 0)) ? secRes[secRes.length/2] : (secRes[secRes.length/2]+secRes[secRes.length/2-1])/2;
        System.out.println(median);
        return "Range: " + convertToHours(range) + " Average: " + convertToHours(average) + " Median: " + convertToHours(median);
    }
    public static String convertToHours(int sec){
        String hours ="";
        String mins = "";
        String secs = "";
        if (sec / 3600 == 0) hours = "00";
            else if (sec / 3600 > 9) hours += sec / 3600;
                else hours = "0" + sec / 3600;
        if (sec%3600/60 == 0) mins = "00";
            else if (sec%3600/60 > 9) mins += sec%3600/60;
                else if (sec%3600/60 < 10) mins = "0" + sec%3600/60;
        if (sec%60 == 0) secs = "00";
            else if (sec%60 > 9) secs += sec%60;
                else secs = "0" + sec%60;
        return hours + "|" + mins  + "|" + secs;
    }
}

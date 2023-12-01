package project1;

import java.util.Arrays;

public class TrafficLights {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(trafficLights("C....G........R...", 35)));

    }
    public static String[] trafficLights(String road, int n) {
        String[] sim = new String[n+1];
        sim[0] = road;
        System.out.println(road);
        for (int i = 1; i <= n; i++) {
            String lights = road;
            for (int j = 0; j < road.length(); j++) {
                if (road.charAt(j) == 'O' || road.charAt(j) == 'R' || road.charAt(j) == 'G' || road.charAt(j) == 'C') {
                    lights = lights.substring(0, j) + lightStatus(road.charAt(j), i+1) + lights.substring(j + 1);
                }

            }
            sim[i] = lights;
        }
        for (int i = 1; i <= n; i++) {
            if (sim[i-1].contains("C")) {
                int cNumber = sim[i - 1].indexOf('C');
                if (cNumber <= sim[i].length() - 2) {

                    if (sim[i].charAt(cNumber + 1) == '.' || sim[i].charAt(cNumber + 1) == 'G')
                        sim[i] = sim[i].substring(0, cNumber + 1) + 'C' + sim[i].substring(cNumber + 2);
                    if (sim[i].charAt(cNumber + 1) == 'R' || sim[i].charAt(cNumber + 1) == 'O')
                        sim[i] = sim[i].substring(0, cNumber) + 'C' + sim[i].substring(cNumber + 1);
                }
            }
            System.out.println(sim[i]);
        }
        return sim;
    }
    public static char lightStatus(char start, int step){
        char color ='Z';
        if (start == 'R') {
           if (step%11 == 0) color ='O';
                else if (step%11 < 6) color = 'R';
                    else color = 'G';
        }
        if (start == 'G') {
            if (step%11 == 6) color ='O';
                else if (step%11 > 6  || step%11 == 0) color = 'R';
                    else color = 'G';
        }
        if (start == 'O') {
            if (step%11 == 1) color ='O';
                else if (step%11 > 6 || step%11 == 0) color = 'G';
                    else color = 'R';
        }
        if (start == 'C') return '.';
        return color;
    }
}

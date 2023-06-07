package project1;

import java.util.Arrays;
import java.util.Collections;

public class Meeting {

    public static void main(String[] args) {
        System.out.println(meeting("Yogy:Stan;Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn"));
    }

    public static String meeting(String s) {
        s = s.toUpperCase();
        String str[] = s.split(";");
        for (int i = 0; i < str.length; i++) {
            String temp[] = str[i].split(":");
            str[i] = temp[1] + ", " + temp[0];
        }
        Arrays.sort(str, Collections.reverseOrder());
        String rs ="";
        for (int i = 0; i < str.length; i++) rs += "(" + str[i] + ")";
        return rs;
    }
}


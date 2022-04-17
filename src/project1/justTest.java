package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class justTest {
    public static void main(String[] args) {
        String s = "rKJ[$)rNfLa<R\\(!j+aU1!n";
        String part1 = "rKJ[)rNL<R\\j1!";
        String part2 = "$fa(!+aUn";
        System.out.println(s);
        System.out.println(part1);
        System.out.println(part2);
        System.out.println(isMerge(s, part1, part2));
    }


    public static boolean isMerge(String s, String part1, String part2) {
        char[] sc = s.toCharArray();
        char[] part1c = part1.toCharArray();
        char[] part2c = part2.toCharArray();

        if (s.length() != part1.length() + part2.length()) return false;
        char[] template = new char[s.length()];
        int k = 0;
        for (int i = 0; i < part1c.length; i++) {
            for (int j = k; j < sc.length; j++) {
                if (part1c[i] == sc[j]) {
                    template[j] = sc[j];
                    k = j;
                }
            }
        }
        k = 0;
        for (int i = 0; i < part2c.length; i++) {
            for (int j = k; j < sc.length; j++) {
                if (part2c[i] == sc[j]) {
                    template[j] = sc[j];
                    k = j;
                }
            }
        }
        System.out.println(Arrays.toString(template));
        if (s.equals(String.valueOf(template))) return true;
        return false;


    }


}

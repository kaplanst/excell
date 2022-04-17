package project1;

import java.util.Arrays;

public class MergedString {
    public static void main(String[] args) {
        System.out.println(isMerge("codewars", "cdwr", "oeas"));
    }


    public static boolean isMerge(String s, String part1, String part2) {
        if (s.length() != part1.length() + part2.length()) return false;
        char[] template = new char[s.length()];
        int k = 0;
        for (int i = 0; i < part1.length(); i++) {
            for (int j = k; j < s.length(); j++) {
                if (part1.charAt(i) == s.charAt(j)) {
                    template[j] = s.charAt(j);
                    k = j;
                    continue;
                }
            }
         }
        k = 0;
        for (int i = 0; i < part2.length(); i++) {
            for (int j = k; j < s.length(); j++) {
                if (part2.charAt(i) == s.charAt(j)) {
                    template[j] = s.charAt(j);
                    k = j;
                    continue;
                }
            }
        }
        System.out.println(Arrays.toString(template));
        if (s.equals(String.valueOf(template))) return true;
        return false;


    }


}

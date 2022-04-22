package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class justTest {
    public static void main(String[] args) {

        System.out.println(isMerge("Can we merge it? Yes, we can!", "an  rge it?,ec", "Cweme Yes w an!"));
    }


    public static boolean isMerge(String s, String part1, String part2) {
        if (s.length() != part1.length() + part2.length()) return false;
        char[] template = new char[s.length()];
        int k = 0;
        for (int i = 0; i < part1.length(); i++) {
            for (int j = k; j < s.length(); j++) {
                if (template[j] != '\0') continue;
                if (part1.charAt(i) == s.charAt(j)) {
                    template[j] = s.charAt(j);
                    k = j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(template));
   //     k = 0;
        String part3 = "";
        for (int i = 0; i < part2.length(); i++) {
            char c = '\0';
            for (int j = 0; j < s.length(); j++) {
                if (template[j] == '\0') continue;
                if (part2.charAt(i) == s.charAt(j)) {
                    c =  s.charAt(j);
                    break;
                }
            }
            for (int j = 0; j < s.length(); j++) {
                if (template[j] != '\0') continue;
                if (c == s.charAt(j)) {
                    template[j] = c;
                    break;
                } else part3 = part3 + part2.charAt(i);
                }
            }
        System.out.println(Arrays.toString(template));
        System.out.println(part3);
        k = 0;
        for (int i = 0; i < part2.length(); i++) {
            for (int j = k; j < s.length(); j++) {
                if (template[j] != '\0') continue;
                if (part2.charAt(i) == s.charAt(j)) {
                    template[j] = s.charAt(j);
                    k = j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(template));
        if (s.equals(String.valueOf(template))) return true;
        return false;


    }
}
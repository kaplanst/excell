package project1;

import java.util.Arrays;

public class MergedString {
    public static void main(String[] args) {

        System.out.println(isMerge("codewars", "cdwr", "oeas"));
    }
    // "codewars", "cdwr", "oeas"
// 'Can we merge it? Yes, we can!' is a merge of 'Cn rge i swa!' and 'a wemet?Ye, e cn'
    public static boolean isMerge(String s, String part1, String part2) {
        if (s.length() != part1.length() + part2.length()) return false;
        if (s.length() == 0) return true;
        if (part1.length() == 0) return s.equals(part2);
        if (part2.length() == 0) return s.equals(part1);
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == part1.charAt(0)) {
                System.out.print(part1.charAt(0));
                if (part1.length() > 1) part1 = part1.substring(1);

            } else if (s.charAt(i) == part2.charAt(0)) {
                System.out.print(part2.charAt(0));
                if (part2.length() > 1) part2 = part2.substring(1);
            } else return false;
        }

        return true;
    }

}

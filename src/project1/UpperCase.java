package project1;
import java.lang.StringBuilder;
import java.util.Locale;

public class UpperCase {

    public static void main(String[] args) {
        System.out.println(toCamelCase("The_Stealth_Warrior"));
    }

    static String toCamelCase(String s) {
        StringBuilder str = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-' || s.charAt(i) == '_') {
                String temp = ("" + s.charAt(i + 1)).toUpperCase();
                str.setCharAt(i+1, temp.charAt(0));
            }
        }
        return str.toString().replaceAll("_", "");
    }
}
//        for (int i = 0; i < s.length(); i++) {
//            String temp = "";
//            if (s.charAt(i) == '-' || s.charAt(i) == '_') {
//                temp += s.charAt(i + 1);
//                s = s.substring(0, i) + temp.toUpperCase() + s.substring(i+2);
//        }
//    }
//        return s;
//}
//}

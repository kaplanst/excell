package project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mixStringWithKeyWord {

    public static void main(String[] args) {

        System.out.println(nico("crazy", "secretinformation"));

    }
    public static String nico(String key, String message) {
        int[] newKey = new int[key.length()];
        List<Character> chars = new ArrayList<>() {};
        for (int i = 0; i < key.length(); i++) chars.add(key.charAt(i));
        Collections.sort(chars);
        for (int i = 0; i < key.length(); i++) {
            for (int j = 0; j < chars.size(); j++) {
                if(key.charAt(i) == chars.get(j)) newKey[i] =j;
            }
        }
        String res ="";
        while (message.length()> newKey.length) {
            res += convert(newKey, message.substring(0, newKey.length));
            message = message.substring(newKey.length);
        }
        return res + convert(newKey, message);
    }
    public static String convert(int[] key, String str){
        while (str.length()< key.length) str+=" ";
        char[] myStr = new char[key.length];
        for (int i = 0; i < key.length; i++) {
            myStr[key[i]] = str.charAt(i);
        }
        return new String(myStr);
    }
}

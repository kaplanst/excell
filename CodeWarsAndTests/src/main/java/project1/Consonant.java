package project1;

import java.util.Locale;

public class Consonant{
    public static void main(String[] args) {
        System.out.println(getCount("h^$&^#$&^elLo world"));
    }

    public static int getCount(String str) {
        return str.toLowerCase().replaceAll("[^b-d,f-h,j-n,p-t,v-z]","").length();
    }
}

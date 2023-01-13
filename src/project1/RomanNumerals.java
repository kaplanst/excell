package project1;

import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {
    public static void main(String[] args) {
        System.out.println(solution(989));
    }

    public static String solution(int n) {
        int tens = 10;
        String res ="";
        while (n > 0) {
            System.out.println(n);
            res = roma(n%tens, tens/10) + res;
            n = n / tens;
            tens = tens *10;
        }

        return res;
    }

    public static String roma(int dig, int tens){
        List<Integer> temp = new ArrayList<>();
        int[] value = new int[] {1, 5, 10, 50, 100, 500, 1000};
        String[] romSymb = new String[] {"I", "V", "X", "L", "C", "D", "M"};
        String str = "";
        switch (dig) {
            case 0 -> temp.add(0);
            case 1 -> temp.add(tens);
            case 2 -> {
                temp.add(tens);
                temp.add(tens);
            }
            case 3 -> {
                temp.add(tens);
                temp.add(tens);
                temp.add(tens);
            }
            case 4 -> {
                temp.add(tens);
                temp.add(5 * tens);
            }
            case 5 -> temp.add(5 * tens);
            case 6 -> {
                temp.add(5 * tens);
                temp.add(tens);
            }
            case 7 -> {
                temp.add(5 * tens);
                temp.add(tens);
                temp.add(tens);
            }
            case 8 -> {
                temp.add(5 * tens);
                temp.add(tens);
                temp.add(tens);
                temp.add(tens);
            }
            case 9 -> {
                temp.add(10 * tens);
                temp.add(tens);
            }
        }
        System.out.println(temp);
        for (int i = 0; i < temp.size(); i++) {
            for (int j = 0; j < value.length; j++) {
                if (temp.get(i) == value[j]) str += romSymb[j];
            }
        }
        return str;
    }

}

package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lcd {

    public static void main(String[] args) {
        System.out.println(prosto(new int[]{1, 1, 6}));
    }
    public static int prosto(int[] s){ // Находим наименьшее общее кратное
        int[][] dubl = new int[s.length][];
        for (int i = 0; i < s.length; i++) {
            dubl[i] = aray(s[i]);
            System.out.println(Arrays.toString(dubl[i]));
        }

        List<Integer> li = new ArrayList<Integer>();
        for (int i = 0; i < dubl.length; i++) {
            for (int j = 0; j < dubl[i].length; j++) {
                li.add(dubl[i][j]);
            }
        }
        List<Integer> li1 = new ArrayList<Integer>();
        li1.add(li.get(0));
        for (int i = 1; i < li.size(); i++) {
            int t = 0;
            for (int j = 0; j < li1.size(); j++) {
                if (li.get(i) == li1.get(j)) t++;
            }
            if (t == 0) li1.add(li.get(i));
        }
        System.out.println();
        System.out.println(li1);
        int nok = 1;
        for (int i = 0; i < li1.size(); i++) {
            nok = nok * (int) Math.pow(li1.get(i), schotMnojiteley(dubl, li1.get(i)));
        }

        return nok;
    }
    public static int schotMnojiteley(int[][] arr, int s){ // Считаем количество множителей
        int sravDiv = 0;
        for (int i = 0; i < arr.length; i++) {
            int promDiv = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == s) promDiv++;

            }
            if (sravDiv < promDiv) sravDiv = promDiv;
//            System.out.println(sravDiv);
        }
        return sravDiv;
    }

    public static int[] aray(int a) { // Разложим на множители входное число
        List<Integer> li = new ArrayList<Integer>();
        if (a ==1) return new int[]{1};
        int divider = 2;
        while (a / divider >= 1) {
            if (a % divider == 0) {
                li.add(divider);
                a = a / divider;
            }
            else divider++;
        }
        return li.stream().mapToInt(i->i).toArray();
    }
}
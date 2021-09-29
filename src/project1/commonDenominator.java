package project1;

import java.util.ArrayList;
import java.util.List;

public class  commonDenominator { // Приведение дроби в массиве к общему знаменателю

    public static void main(String[] args) { // Результат окончательный [1, 1], [3, 1], [4, 1], [5, 1]
        System.out.println(convertFrac(new long[][] {{1, 1}, {3, 1}, {4, 1}, {5, 6}}));
    }
    public static String convertFrac(long[][] lst) {
        if (lst.length == 0) return "";
        for (int k = 0; k < lst.length; k++) {
            long tempDiv = 1;
            for (long f = lst[k][0]; f >= 2; f--) {
                if (lst[k][0] == 1) continue;
                if (lst[k][0] % f == 0 && lst[k][1] % f == 0) {
                    tempDiv = f;
                    break;
                }
            }
            lst[k][0] = lst[k][0] / tempDiv;
            lst[k][1] = lst[k][1] / tempDiv;
        }
        int[] temp = new int[lst.length];
        for (int i = 0; i < lst.length; i++) {
            temp[i] = (int)lst[i][1];
        }
        int znam = prosto(temp);
        String result = "";
        for (int i = 0; i < lst.length; i++) {
            result += "(" + (znam/lst[i][1]*lst[i][0]) + "," + znam + ")";

        }
        return result;
    }
    public static int prosto(int[] s){ // Находим наименьшее общее кратное
        int[][] dubl = new int[s.length][];
        for (int i = 0; i < s.length; i++) {
            dubl[i] = aray(s[i]);
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
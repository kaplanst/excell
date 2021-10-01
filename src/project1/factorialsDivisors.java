package project1;

import java.util.ArrayList;
import java.util.List;

public class factorialsDivisors {
    public static void main(String[] args) {
        System.out.println(decomp(10));

    }
    public static String decomp(int n) {
        List<Integer> liCommon = new ArrayList<Integer>();

        for (int i = 2; i <= n; i++) {
            liCommon.addAll(aray(i));
        }
        System.out.println(liCommon);
        List<Integer> li1 = new ArrayList<Integer>();
        li1.add(liCommon.get(0));
        for (int i = 1; i < liCommon.size(); i++) {
            int t = 0;
            for (int j = 0; j < li1.size(); j++) {
                if (liCommon.get(i) == li1.get(j)) t++;
            }
            if (t == 0) li1.add(liCommon.get(i));
        }
        System.out.println(li1);
        String resume;
        int temp = li1.get(0);
        int[] baza = new int[li1.size()];
        for (int i = 0; i < li1.size(); i++) {
            for (int j = i; j < li1.size(); j++) {
                if (li1.get(i) > li1.get(j)) {
                    temp = li1.get(j);
                    li1.set(j, li1.get(i));
                    li1.set(i, temp);
                }

            }
            baza[i] = schotMnoj(liCommon, li1.get(i));
        }
        return "Ura";
    }
    public static int schotMnoj(List istok, int stepen){

        return 1;
    }

    public static List aray(int a) { // Разложим на множители входное число
        List<Integer> li = new ArrayList<Integer>();
        int divider = 2;
        while (a / divider >= 1) {
            if (a % divider == 0) {
                li.add(divider);
                a = a / divider;
            }
            else divider++;
        }
        return li;
    }

}

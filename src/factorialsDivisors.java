import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class factorialsDivisors {
    public static void main(String[] args) {
        System.out.println(decomp(875));

    }
    public static String decomp(int n) {
        List<Integer> liCommon = new ArrayList<Integer>();

        for (int i = 2; i <= n; i++) {
            liCommon.addAll(aray(i));
        }
        Collections.sort(liCommon);
        LinkedHashSet<Integer> li2 = new LinkedHashSet<Integer>();

         for (int i = 0; i < liCommon.size(); i++)
            li2.add(liCommon.get(i));

        System.out.println(li2);
        List<Integer> li1 = new ArrayList<>(li2);
        String resume = "";
        int temp = li1.get(0);
        for (int i = 0; i < li1.size(); i++) {
            String helper = "";
            for (int j = i; j < li1.size(); j++) {
                if (li1.get(i) > li1.get(j)) {
                    temp = li1.get(j);
                    li1.set(j, li1.get(i));
                    li1.set(i, temp);
                }

            }
            if (schotMnoj(liCommon, li1.get(i)) > 1) helper = "^" + schotMnoj(liCommon, li1.get(i));
            resume += li1.get(i) + helper;
            if (i != li1.size()-1) resume +=" * ";

        }

        return resume;
    }
    public static int schotMnoj(List<Integer> istok, int stepen){
        int c = 0;
        int b;
        for (int i = 0; i < istok.size(); i++) {
            if (istok.get(i) == stepen) c++;
        }
        return c;
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

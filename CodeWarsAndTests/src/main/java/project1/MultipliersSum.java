package project1;

import java.util.Set;
import java.util.TreeSet;

public class MultipliersSum {
    public static void main(String[] args) {

        System.out.println(findThem("10000", new int[]{2,3,5,7}));
    }
    public static String findThem(String numberLimit, int[] primes) {
        Set<Integer> list = new TreeSet<>();
        int limit = Integer.parseInt(numberLimit);
        for (int i = 0; i < primes.length; i++) {
            for (int j = 2; j <limit ; j++) {
                if (j%primes[i] == 0) list.add(j);
            }
        }
        long sum = 0;
        for (int i:list) {
            sum += i;
        }
    //    list.

       // System.out.println(list);
        return "" + sum;
    }
}

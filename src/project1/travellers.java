package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class travellers {
    public static void main(String[] args) {
        List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));
        System.out.println(chooseBestSum(163, 3, ts));
    }

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        if (ls.size() < k) return null;
        int just = Integer.MAX_VALUE;
        Integer res = 0;
        for (int i = 0; i < ls.size(); i++) {
            for (int j = i+1; j < ls.size(); j++) {
                for (int l = j+1; l < ls.size(); l++) {
                    System.out.print((ls.get(i) + ls.get(j) + ls.get(l)) + ", ");

                    if (just > t - (ls.get(i) + ls.get(j) + ls.get(l)) && t - (ls.get(i) + ls.get(j) + ls.get(l)) >= 0) {
                        just = t - (ls.get(i) + ls.get(j) + ls.get(l));
                        res = (ls.get(i) + ls.get(j) + ls.get(l));
                    }
                }
             }
        }
        if (res == 0) return null;


        return res;
    }
}


package project1;

import java.util.*;

public class justTest {

    public static void main(String[] args) {
        Set<Integer> list = new TreeSet<>();
        list.add(9);
        list.add(1);
        list.add(7);
        list.add(2);
        list.add(2);
        list.add(1);

        ArrayList<Integer> ls = (ArrayList<Integer>) list;
        ls.get(2);
        System.out.println(ls.get(2));
    }
}
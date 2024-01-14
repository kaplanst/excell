package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TwoSetsofEqualSum {
    public static void main(String[] args){
        System.out.println(equalSums(6));
    }



    public static List<List<Integer>> equalSums(int a) {
        List<List<Integer>> listOLists = new ArrayList<>();
        List<Integer> elems = new ArrayList<>();
        List<String> elemStr = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < a; i++) {
            elems.add(i+1);
            elemStr.add("" + elems.get(i));
            sum +=elems.get(i);
        }

        List<Integer> list1 = new ArrayList<>();
        if (sum%2 !=0) return listOLists;
        List<String> combinations = getCombinationsLists(elemStr);

        for (int i = 0; i < combinations.size(); i++) {
            List<Integer> slag = var(combinations.get(i));
            if (summa(slag) == sum/2) {
                list1 = slag;
                break;
            }
            if (i == combinations.size()-1) return listOLists;


        }
        listOLists.add(list1);

        List<Integer> list2 = secondList(elems, list1);

        listOLists.add(list2);



        return listOLists;
    }
    public static int summa (List<Integer> list1) { // Sum of list elements using recursion
        return (list1.size() > 0) ? list1.get(0) + summa(list1.subList(1, list1.size())) : 0;

    }
    public static List<String> getCombinationsLists(List<String> elements) {

        //return list with empty String
        if (elements.size() == 0) {
            List<String> allLists = new ArrayList<String>();
            allLists.add("");
            return allLists;
        }

        String first_ele = elements.remove(0);
        List<String> rest = getCombinationsLists(elements);
        int restsize = rest.size();
        //Mapping the first_ele with each of the rest of the elements.
        for (int i = 0; i < restsize; i++) {
            String ele = first_ele + " " + rest.get(i);
            rest.add(ele);
        }
        return rest;
    }
    public static List<Integer> var( String elem){
        String[] arr = elem.split(" ");
        List<Integer> slag = new ArrayList<>();
        if (elem.length() == 0) return slag;
        for (int i = 0; i < arr.length-1; i++) {
            slag.add(Integer.parseInt(arr[i]));
        }
        return slag;
    }
    public static List<Integer> secondList(List<Integer> elems, List<Integer> list1){
        List<Integer> list2 = new ArrayList<>();
        for (Integer x: elems) {
            if (!list1.contains(x)) list2.add(x);
        }
        return list2;
    }
}

package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NegotiveAndRepeatedElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(remElem(new int[]{-1, 1, 2, -7, 3, -5, 8, -9, 5, -3, -8, 11, 0, 17, -12})));
    }

    public static int[] remElem(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) list.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                for (int j = 0; j < list.size(); j++) {
                    if (arr[i] * -1 == list.get(j)) list.remove(j);
                }
            }
        }
        arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) arr[i] = list.get(i);
        return arr;
    }
}

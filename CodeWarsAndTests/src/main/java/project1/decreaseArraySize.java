package project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class decreaseArraySize {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,5,4,3,2,7,9,6,4,4,3,5};
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!lst.contains(arr[i])) lst.add(arr[i]);
        }
        Collections.sort(lst);

        System.out.println(lst);
    }
}

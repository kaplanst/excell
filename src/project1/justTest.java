package project1;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class justTest {
    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<>();
        int tens = 1;
        int dig = 7;
        switch (dig) {
            case 0:
                temp.add(0);
                break;
            case 1:
                temp.add(tens); break;
            case 2:
                temp.add(tens);
                temp.add(tens); break;
            case 3:
                temp.add(tens);
                temp.add(tens);
                temp.add(tens); break;
            case 4:
                temp.add(tens);
                temp.add(5 * tens); break;
            case 5:
                temp.add(5 * tens); break;
            case 6:
                temp.add(5 * tens);
                temp.add(tens); break;
            case 7:
                temp.add(5 * tens);
                temp.add(tens);
                temp.add(tens); break;
            case 8:
                temp.add(5 * tens);
                temp.add(tens);
                temp.add(tens);
                temp.add(tens); break;
            case 9:
                temp.add(10 * tens);
                temp.add(tens); break;
        }
        System.out.println(temp);
    }

}
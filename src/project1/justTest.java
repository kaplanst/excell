package project1;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class justTest {
    public static void main(String[] args) {
     int num = 86;
     int res = 0;
     while (num > 0) {
         res += num % 10;
         num = num / 10;
     }
        System.out.println(res);


    }

}
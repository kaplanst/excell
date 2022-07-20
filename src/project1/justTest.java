package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class justTest {
    public static void main(String[] args) {

        System.out.println(multi(10));
    }

    public static int multi(int m){
        if ( m >=1 ) {
            return multi(m-1)*m;
        }

        return 1;
    }


}
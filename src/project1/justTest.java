package project1;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class justTest {
    public static void main(String[] args) throws InterruptedException {

        String s = "sss";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s);
            s = s + 's';
            Thread.sleep(2000);

        }

    }

}
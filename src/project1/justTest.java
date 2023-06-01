package project1;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class justTest extends Tank {
    public static void main(String[] args) {
            int a=5;
            int b=2;
            try{
                System.out.println(a/b);
            }
            catch(ArithmeticException e){
                e.printStackTrace();
                System.out.println("Oy");
            }
        }

}


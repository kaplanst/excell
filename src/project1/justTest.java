package project1;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class justTest {
    public static void main(String[] args) {
        double d = 7;
        double h = 6;
        double s = Math.PI * d * d / 4;
        double corner = Math.acos((d/2-h)/(d/2)) * 2;
        double stringle = Math.sqrt((d/2)*(d/2)- (d/2 - h)*(d/2 - h)) * (d/2 - h);
        double ssegment = (d*d*corner/8) - stringle;
        System.out.println(ssegment);
        System.out.println(s);



//        System.out.println(corner);
//        double inDegrees = Math.toDegrees(corner);
//        System.out.println(inDegrees);

    }

}
//    double inRadians = Math.toRadians(inDegrees);
//    double inDegrees = Math.toDegrees(inRadians);
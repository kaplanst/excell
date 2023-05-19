package project1;

public class Tank {
    public static void main(String[] args) {
        System.out.println(tankVol(2, 7, 3848));

    }
    public static int tankVol(int h, int d, int vt) {
        double r = (double)d/2;

        return (int)(((r*r*(Math.acos((r-h)/r) * 2)/2) - (Math.sqrt(r*r - (r - h)*(r - h)) * (r - h))) * vt/(Math.PI*r*r));
    }

}
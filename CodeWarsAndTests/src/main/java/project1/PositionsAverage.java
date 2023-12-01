package project1;

public class PositionsAverage {
    public static void main(String[] args) {
        String str = "466960, 069060, 494940, 060069, 060090, 640009, 496464, 606900, 004000, 944096";
        System.out.println(posAverage(str));
    }

    public static double posAverage(String s) {
        String[] strArr = s.split(", ");
        int counter = 0;
        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                for (int k = 0; k < strArr[i].length(); k++) {
                    if (strArr[i].charAt(k) == strArr[j].charAt(k)) counter++;
                }
            }
        }
        return (counter*100)/((double)(strArr.length * (strArr.length-1) / 2) * strArr[0].length());
    }
}

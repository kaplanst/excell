package project1;

public class Century {

    public static void main(String[] args) {
        System.out.println(whatCentury(1121));
    }
    public static String whatCentury(int year) {
        int cent = (year -1) /100 + 1;
        if (cent != 11 && cent != 12 && cent != 13) {
            if (cent % 10 == 1) return cent + "st";
            if (cent % 10 == 2) return cent + "nd";
            if (cent % 10 == 3) return cent + "rd";
        }
        return cent + "th";
    }

}

package project1;

public class digitString {
    public static void main(String[] args) {
        System.out.println(expandedForm(12));
    }
    public static String expandedForm(int num) {
        String res = "";
        int multiplier = 1;
        while (num >= 1) {
            if (num % 10 != 0) res = num % 10 * multiplier + (res.equals("") ? "" : " + " + res);
            num = num / 10;
            multiplier *= 10;
        }

        return res;
    }
}

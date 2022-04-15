package project1;

public class Repetition {
    public static void main(String[] args) {
        String str = "clopclopclop";
        System.out.println(star(str));
    }
    public static String star(String str) {
        for (int i = 1; i < str.length(); i++) {
            String testStr = str.substring(0, i);
            if (testStr.equals(str.substring(i, i + testStr.length()))) return testStr;
            if (testStr.length() == str.length() / 2) return "There is no any repetition";

        }
        return "There is no any repetition";
    }
}

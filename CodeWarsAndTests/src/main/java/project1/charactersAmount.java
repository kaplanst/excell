package project1;

// Count the amount of every characters

public class charactersAmount {
    public static void main(String[] args) {
        String check = "";
        String str = ("Early bird catches more food").toLowerCase();
        for (int i = 0; i < str.length() - 1; i++) {
            int m = 0;
            if (!check.contains("" + str.charAt(i))) {
                check += str.charAt(i);
            } else continue;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    m++;
                }
            }
            System.out.println("'" + str.charAt(i) + "' = " + m);
        }
    }
}

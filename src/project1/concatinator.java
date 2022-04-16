package project1;

public class concatinator {

    public static void main(String[] args) {
        String[] strar = {"zone", "abigail", "theta", "form", "libe", "zas666666666"};
        System.out.println(longestConsec(strar, 6));
    }

    public static String longestConsec(String[] strarr, int k) {
        if (k <=0 || k > strarr.length) return "";
        String result = "";
        int count = 0;
        for (int i = 0; i < strarr.length - k + 1; i++) {
            String check = "";
            for (int j = 0; j < k; j++) {
                check += strarr[i+j];
            }
            if (count < check.length()) {
                count = check.length();
                result = check;
            }

        }

        return result;
    }

}

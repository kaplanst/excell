package project1;

public class SplitString {
    public static void main(String[] args) {
        System.out.println(splitstr("abcd"));
    }
    public static String splitstr(String str){
        String newstr = "";
        char temp;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) temp = Character.toUpperCase(str.charAt(i));
                    else temp = Character.toLowerCase(str.charAt(i));
                newstr += temp;
            }
            if (i < str.length() - 1) newstr += "-";
        }
        return newstr;
    }
}

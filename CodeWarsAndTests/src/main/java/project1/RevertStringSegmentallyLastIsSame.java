package project1;
// Input string is reverted segmentically by int m

public class RevertStringSegmentallyLastIsSame {
    public static void main(String[] args){
        String str = "012301230123012365";
        int m = 4;
        String newstr ="";
        for (int i = 0; i < str.length(); i = i + m) {
            if(i+m > str.length()) break;
            for (int j = m - 1; j >= 0; j--) {
                newstr += str.charAt(i + j);
            }
            newstr += " ";
        }
        newstr += str.substring(str.length() - str.length()%m);
        System.out.println(newstr);
    }
}

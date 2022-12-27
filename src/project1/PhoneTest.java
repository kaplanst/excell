package project1;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;

public class PhoneTest {
    public static void main(String[] args) {
        System.out.println(phoneWords("555555344455"));

    }
    public static String phoneWords(String str) {
        if (str.length() == 0) return "";
        String result = "";
        int symNumber = 0; // quantity of symbols
        int counter = 0;  // number in array commonArr

        String[][] digitPanel ={{" "}, {}, {"a", "b","c"}, {"d", "e","f"}, {"g", "h","i"}, {"j", "k","l"},
                {"m", "n","o"}, {"p", "q","r","s"}, {"t", "u","v"}, {"w", "x","y","z"}};
        char tempSymbol = str.charAt(0);
        int[][] commonArr = new int[str.length()][2];
        for (int i = 1; i < str.length(); i++) {

            if (tempSymbol != str.charAt(i)) {
                commonArr[counter][0] = Character.getNumericValue(tempSymbol);
                commonArr[counter][1] = symNumber;
                tempSymbol = str.charAt(i);
                counter++;
                symNumber = 0;
                if (i == str.length() - 1) {
                    commonArr[counter][0] = Character.getNumericValue(tempSymbol);
                    commonArr[counter][1] = 0;
                }
            } else {
                symNumber++;


                if (i == str.length() - 1) {
                    commonArr[counter][0] = Character.getNumericValue(str.charAt(i));
                    commonArr[counter][1] = symNumber;
                }
//                if (symNumber == digitPanel[Character.getNumericValue(tempSymbol)].length - 1) {
//                    symNumber = 0;
//                    counter++;
//                }

            }

        }
        for (int i = 0; i < commonArr.length; i++) {
            System.out.println(Arrays.toString(commonArr[i]));

        }

        return  result;
    }


}

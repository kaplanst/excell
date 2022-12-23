package project1;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;

public class PhoneTest {
    public static void main(String[] args) {
        System.out.println(phoneWords("555555"));

    }
    public static String phoneWords(String str) {
        if (str.length() == 0) return "";
        String result = "";
        int symNumber = 0;

        String[][] digitPanel ={{" "}, {}, {"a", "b","c"}, {"d", "e","f"}, {"g", "h","i"}, {"j", "k","l"},
                {"m", "n","o"}, {"p", "q","r","s"}, {"t", "u","v"}, {"w", "x","y","z"}};
        int[] strArray = new int[str.length()];
        for (int i = 0; i < str.length(); i++) strArray[i] = Character.getNumericValue(str.charAt(i));
        if (str.length() == 1) return "" + digitPanel[strArray[0]][0];
        int tempSymbol = strArray[0];

        for (int i = 1; i < str.length(); i++) {
            if (tempSymbol == strArray[i]) {
                if (symNumber == digitPanel[symNumber].length-1) {
                    symNumber = 0;
                    result = result + digitPanel[tempSymbol][digitPanel[symNumber].length-1];
                }

                if (i == str.length() - 1) return result + digitPanel[tempSymbol][symNumber];
                symNumber++;

            } //else {
//                result = result + digitPanel[tempSymbol][symNumber];
//                symNumber = 0;
//                tempSymbol = strArray[i];
 //               if (i == str.length() - 1) return result + digitPanel[tempSymbol][symNumber];
 //           }

        }


        return  result;
    }


}

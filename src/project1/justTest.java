package project1;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class justTest {
    public static void main(String[] args) {
        System.out.println(phoneWords(null));

    }
    public static String phoneWords(String str) {
        if (str == null) return "";
        if (str.length() == 0) return "";
        String result = "";
        int symNumber = 0; // quantity of symbols

        String[][] digitPanel ={{" "}, {""}, {"a", "b","c"}, {"d", "e","f"}, {"g", "h","i"}, {"j", "k","l"},
                {"m", "n","o"}, {"p", "q","r","s"}, {"t", "u","v"}, {"w", "x","y","z"}};
        char tempSymbol = str.charAt(0);
        List<Integer> sym = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        sym.add(Character.getNumericValue(tempSymbol));
        if (str.length() == 1) return digitPanel[Character.getNumericValue(tempSymbol)][0];

        for (int i = 1; i < str.length(); i++) {

            if (tempSymbol != str.charAt(i)) {
                num.add(symNumber);
                tempSymbol = str.charAt(i);
                sym.add(Character.getNumericValue(tempSymbol));
                symNumber = 0;
                if (i == str.length() - 1) num.add(symNumber);
                }
             else {
                symNumber++;
                if (symNumber == digitPanel[Character.getNumericValue(tempSymbol)].length) {
                    sym.add(Character.getNumericValue(tempSymbol));
                    num.add(symNumber-1);
                    symNumber = 0;
                }
                if (i == str.length() - 1) num.add(symNumber);

            }

        }
                for (int i = 0; i < sym.size(); i++) {
            result += digitPanel[sym.get(i)][num.get(i)];
        }

        System.out.println(sym);
        System.out.println(num);
        return  result;
    }
}

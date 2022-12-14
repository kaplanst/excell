package project1;

public class DigitsToWords {
    public static void main(String[] args) {
        System.out.println(millions(5045635004198L));
    }

    public static String millions(long allDig) {
        if (allDig == 0) return "zero";
        String res = "";
        String[] millionsNames = {
                "", " thousand", " million", " billion", " trillion"
        };
        for (String millionsName : millionsNames) {
            if (allDig % 1000 != 0) res = words((int) (allDig % 1000)) + millionsName + " " + res;
            if (allDig / 1000 == 0) break;
            allDig = allDig / 1000;
        }

        return res.trim();
    }
    public static String words(int inp) {
        String[] tensNames = {
                "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        String[] numNames = {
                "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };
        String cont = "";
        if (inp < 1000 && inp >= 100) {
            if (inp % 100 == 0) return numNames[inp%10] + " hundred";
            else {
                cont = numNames[inp / 100] + " hundred ";
                inp = inp%100;
            }
        }
        if (inp < 20) return cont + numNames[inp];
        if (inp < 100 && inp%10 == 0) return cont + tensNames[inp/10];
        if (inp < 100) return cont + tensNames[inp/10] + "-" + numNames[inp%10];
        return "";
    }
}

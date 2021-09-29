package project1;

public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("qwer"));
    }

    public static int duplicateCount(String text) {
        if (text == null || text == "") return 0;
        String newText = "";
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
                int p = 0;
                for (int j = 0; j < text.length(); j++) {

                    if (text.charAt(i) == text.charAt(j)) p++;
                }
               if (p > 1) {
                   newText += text.charAt(i);
               }
        }
        if (newText == null || newText == "") return 0;
        System.out.println(newText);
        String res = Character.toString(newText.charAt(0));
        for (int i = 0; i < newText.length(); i++) {
            int countChar = 0;
            for (int j = 0; j < res.length(); j++) {
                if (newText.charAt(i) == res.charAt(j)) countChar++;
            }
            if (countChar == 0) res+= newText.charAt(i);
        }
        System.out.println(res);
        return res.length();
    }
}


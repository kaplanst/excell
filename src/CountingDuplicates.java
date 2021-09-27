public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("lscncbgdtedcgfksWEaassncgd12gdDSvchhdvgx"));
    }

    public static int duplicateCount(String text) {
        int countChar;
        int result = 0;
        String newText = "";
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
                int p = 0;
                for (int j = 0; j < text.length(); j++) {

                    if (text.charAt(i) == text.charAt(j)) p++;
                }
               if (p > 1) {
                   newText += text.charAt(i);
//                   if (newText.length() == 1) continue;
                   p = 0;
                   for (int j = 0; j < newText.length(); j++) {
                       if (newText.charAt(j) == newText.charAt(newText.length()-1)) p++;
                   }
 //                  if (p >= 0) newText.substring(0, newText.length()-1);
            }



        }
        System.out.println(newText);
        return 1;
    }
}


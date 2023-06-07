package project1;

public class PangramChecker {
    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy do"));
    }

        public static boolean check(String sentence){
            String sent = sentence.toLowerCase();
            String alp = "abcdefghijklmnopqrstuvwxyz";
            for (int i = 0; i < alp.length(); i++) {
                for (int j = 0; j < sent.length(); j++) {
                    if (alp.charAt(i) == sent.charAt(j)) break;
                    else if (j == sent.length()-1) return false;
                }
            }
            return true;
        }
}
// abcdefghijklmnopqrstuvwxyz
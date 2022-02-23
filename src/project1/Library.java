package project1;
public class Library {
    public static void main(String[] args) {
        String[] art = {"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String[] cd = new String[] {"A", "B"};
        System.out.println(stockSummary(art, cd));
    }
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        String res = "";
        for (String i: lstOf1stLetter) {
            int count = sum(lstOfArt, i);
            res += " - (" + i + " : " + count + ")";
        }
        return res.substring(3); //       (A : 200) - (B : 1140)
    }
    public static int sum(String[] lstOfArt, String index) {
        int total = 0;
        for (String lst: lstOfArt) {
            if (lst.substring(0, 1).equals(index)) {
                total += Integer.parseInt(lst.substring(lst.indexOf(' ') + 1));
            }
        }

        return total;
    }

}



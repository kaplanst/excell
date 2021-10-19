package project1;

public class clock {
    public static void main(String[] args) {

        System.out.println(makeReadable(6003));
    }


    public static String makeReadable(int seconds) {
        int[] clocks = new int[]{seconds / 3600, seconds%3600/60, seconds%60};
        String res = "";
        for (int i = 0; i < clocks.length; i++) {
            res+=zeroCheck(clocks[i]);
            if (i != clocks.length-1) res+=":";
        }
        return res;
    }
    public static String zeroCheck(int number){
        if (number < 10) return "0" + number;
        else return "" + number;
    }

}

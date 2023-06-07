package project1;

public class bookPages {
    public static void main(String[] args) {

        for (int i = 0; i < 1100 ; i = i + 1) {
            System.out.println(i + " -- " + pageDigits(i) + " == "  + (Long.toString(i).length() + 2 * i - 10*(Long.toString(i).length()-1)));
        }

        

    }
    public static long pageDigits(long pages) {

        long rTotal = 0;
        for (long i = 1; i <= pages; i++) {
            rTotal += (Long.toString(i).length());
        }
        return rTotal;
    }

}



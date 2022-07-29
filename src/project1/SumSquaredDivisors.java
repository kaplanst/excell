package project1;

public class SumSquaredDivisors {
    public static void main(String[] args) {
        System.out.println(listSquared(4, 41));
    }

    public static String listSquared(long m, long n) {
        if (m > n) {return "[]";}
        if (m <= 0) {return "[]";}
        if (n <= 0) {return "[]";}
        String s = "[";
        for (long i = m; i <= n ; i++) {
            s = s + checking(i);
        }
        if (s.length() > 5) s = s.substring(0, s.length()-2) + "]";
            else return "[]";
        return s;
    }

    public static String checking(long element) {
        long sum = 0;
        for (long i = 1; i <=element ; i++) {
            if (element % i == 0) sum += i*i;
        }
        if (Math.sqrt(sum)%1 == 0) return "[" + element + ", " + sum + "], ";
        return "";
    }
}

package project1;

public class SimpleNumber {
    public static void main(String[] args) {
        System.out.println(digital_root(7777));
    }

    public static int digital_root(int n) {

        while (n > 9) n = reduce(n);

        return n;
    }
    public static int reduce(int x){
        int res = 0;
        while (x > 9) {
            res += x%10;
            x = x / 10;
        }
        res += x;
        return res;
    }

}

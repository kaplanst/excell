package project1;

import com.google.common.math.BigIntegerMath;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class BigIntegerDigits {

    public static void main(String[] args) {

        System.out.println(choose(10, 5));

    }
    public static BigInteger choose(int n, int p) {
         return (BigIntegerMath.factorial(n)).divide(BigIntegerMath.factorial(p).multiply(BigIntegerMath.factorial(n-p)));
    }
//    public static BigInteger factor(int num) {
//        BigInteger sum = BigInteger.valueOf(1);
//        for (int i = 1; i <= num; i++) {
//            sum = sum.multiply(BigInteger.valueOf(i));
//        }
//            return sum;
//    }
}
//k==n!/(k!*(n-k)!) BigIntegerMath.factorial(n)
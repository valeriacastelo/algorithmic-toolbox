package week2;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciPartialSumLastDigit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        BigInteger a = s.nextBigInteger();
        BigInteger b = s.nextBigInteger();

        System.out.println(fibPartialSumLastDigit(a, b));
    }

    private static BigInteger fibPartialSumLastDigit(BigInteger from, BigInteger to) {

        BigInteger sum = new BigInteger("0");
        BigInteger f0 = new BigInteger("0");
        BigInteger fi = new BigInteger("0");

        for (int i = 0; BigInteger.valueOf(i).compareTo(to) <= 0;  i++) {

            if (i < 2) {
                fi = BigInteger.valueOf(i);
            } else {
                BigInteger tmp = f0.add(fi);
                f0 = fi;
                fi = tmp;
            }

            if (BigInteger.valueOf(i).compareTo(from) >= 0) {
                sum = sum.add(fi);
            }

        }

        return sum.mod(BigInteger.TEN);
    }

}

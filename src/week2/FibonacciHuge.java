package week2;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciHuge {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger n = s.nextBigInteger();
        BigInteger m = s.nextBigInteger();

        System.out.println(fibHuge(n, m));
    }

    private static BigInteger fibHuge(BigInteger n, BigInteger m) {

        if (n.compareTo(BigInteger.valueOf(2)) < 0) {
            return n;
        }

        BigInteger f0 = new BigInteger("0");
        BigInteger fi = new BigInteger("1");

        for (int i=2; BigInteger.valueOf(i).compareTo(n) <= 0; i++) {

            BigInteger tmp = f0.add(fi);
            f0 = fi;
            fi = tmp;

        }

        return fi.mod(m);
    }

}

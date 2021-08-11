package week2;

import java.util.Scanner;

public class FibonacciLastDigit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(fibHugeLastDigit(n));
    }

    private static long fibHugeLastDigit(int n) {

        final int MOD = 1000000000;

        if (n < 2) {
            return n;
        }

        long f0 = 0;
        long fi = 1;

        for (int i=2; i<=n; i++) {

            long tmp = (f0 + fi) % MOD;
            f0 = fi;
            fi = tmp;

        }

        return fi % 10;
    }

}

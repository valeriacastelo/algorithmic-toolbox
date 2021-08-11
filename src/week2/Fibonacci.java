package week2;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(fib(n));
    }

    private static long fib(int n) {
        if (n < 2) {
            return n;
        }

        long f0 = 0;
        long fi = 1;

        for (int i=2; i<=n; i++) {
            long tmp = f0 + fi;
            f0 = fi;
            fi = tmp;
        }

        return fi;
    }

}

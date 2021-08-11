package week1;

import java.util.Scanner;

public class MaximumPairwiseProduct {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n < 2) {
            throw new IllegalArgumentException();
        }

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextLong();
        }

        long max = Integer.MIN_VALUE;
        long max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else {
                if (arr[i] > max2) {
                    max2 = arr[i];
                }
            }
        }

        System.out.println(max * max2);

    }

}

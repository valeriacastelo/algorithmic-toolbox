package week3;

import java.util.Scanner;

public class Change {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        System.out.println(getChange(m));

    }

    private static int getChange(int m) {

        final int[] COINS = {10, 5, 1};

        int sum = 0;
        int count = 0;

        for (int i=0; i<COINS.length; i++) {

            while (sum + COINS[i] <= m) {
                sum += COINS[i];
                count++;
            }

        }

        return count;
    }
}

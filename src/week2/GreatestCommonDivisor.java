package week2;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int maxDiv = gcd(a, b);
        System.out.println(maxDiv);
    }

    private static int gcd(int a, int b) {
        int rest;
        int num1;
        int num2;

        if (a > b) {
            num1 = a;
            num2 = b;
        } else {
            num1 = b;
            num2 = a;
        }

        while ((rest = num1 % num2) > 0) {
            num1 = num2;
            num2 = rest;
        }

        return num2;
    }

}

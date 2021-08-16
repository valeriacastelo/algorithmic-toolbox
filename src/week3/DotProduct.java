package week3;

import java.util.Scanner;

public class DotProduct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n]; //ad price peer click
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] b = new int[n];//clicks
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.println(maxDotProduct(a, b));

    }

    private static long maxDotProduct(int[] a, int[] b) {

        simpleSort(a);
        simpleSort(b);

        long maxProduct = 0;
        for (int i = 0; i < a.length; i++) {
            maxProduct += (long) a[i] * b[i];
        }

        return maxProduct;

    }

    private static void simpleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

}

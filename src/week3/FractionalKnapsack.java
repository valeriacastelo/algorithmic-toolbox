package week3;

import java.util.Scanner;

public class FractionalKnapsack {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int capacity = s.nextInt();

        double[] units = new double[n];
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            int v = s.nextInt();
            int w = s.nextInt();
            units[i] = (double) v / w;
            weights[i] = w;
        }

        double sum = getOptimalValue(units, weights, capacity);
        System.out.println(String.format("%1.4f", sum));

    }

    private static double getOptimalValue(double[] units, int[] weights, int capacity) {

        //ordering
        for (int i = 0; i < units.length - 1; i++) {
            for (int j = i + 1; j < units.length; j++) {
                if (units[i] < units[j]) {
                    double tmp = units[i];
                    units[i] = units[j];
                    units[j] = tmp;

                    int tmpW = weights[i];
                    weights[i] = weights[j];
                    weights[j] = tmpW;
                }
            }
        }

        double sum = 0;
        int count = 0;

        for (int i = 0; i < units.length; i++) {

            int curr = weights[i];

            while (count + curr > capacity) {
                curr--;
            }

            count += curr;
            sum += units[i] * curr;

            if (count == capacity) {
                break;
            }

        }

        return sum;

    }

}

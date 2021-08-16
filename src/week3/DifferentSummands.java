package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DifferentSummands {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> sums = optimalSummands(n);

        System.out.println(sums.size());
        for (Integer s : sums) {
            System.out.print(s + " ");
        }
    }

    private static List<Integer> optimalSummands(int n) {
        List<Integer> prices = new ArrayList();

        int totalSum = 0;

        for(int i = 1; i <= n; i++) {
            int comp = n - (totalSum + i);

            if (comp == 0) {
                prices.add(i);
                break;

            } else if (comp > i && comp < n) {
                prices.add(i);
                totalSum += i;
            }

        }

        return prices;
    }
}

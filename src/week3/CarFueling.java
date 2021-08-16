package week3;

import java.util.Scanner;

public class CarFueling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();

        int[] stops = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }

    private static int computeMinRefills(int dist, int tank, int[] stops) {

        int count = 0;
        int currPos = tank;
        int lastStop = -1;

        while (currPos < dist) {

            int currStop = lastStop;

            for(int i = lastStop + 1; i < stops.length; i++) {

                if (currPos <= stops[i]) {
                    currStop = currPos == stops[i] ? i : i - 1;
                    break;
                } else {
                    currStop = i;
                }

            }

            if (currStop > lastStop) {
                count++;
                currPos = stops[currStop] + tank;
                lastStop = currStop;
            } else {
                count = -1;
                break;
            }
        }

        return count;
    }
}

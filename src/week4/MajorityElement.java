package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MajorityElement {
    private static int getMajorityElement(int[] arr) {

        //Boyer-Moore algo

        if (arr.length == 1) {
            return 0;
        }

        int majIdx = 0;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[majIdx]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                majIdx = i;
                count = 1;
            }

        }

        count = 0;

        for (int n : arr) {
            if (arr[majIdx] == n) {
                count++;
            }
        }

        return count > arr.length / 2 ? majIdx : -1;

    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (getMajorityElement(a) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
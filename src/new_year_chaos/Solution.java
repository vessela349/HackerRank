package new_year_chaos;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static final void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int minBribes = 0;
        int n = q.length;
        for (int i = n - 1; i >= 0; i--) {
            if (q[i] != (i + 1)) {
                if (((i - 1) >= 0) && q[i - 1] == (i + 1)) {
                    minBribes++;
                    swap(q, i, i - 1);

                } else if (((i - 2) >= 0) && q[i - 2] == (i + 1)) {
                    minBribes += 2;
                    q[i - 2] = q[i - 1];
                    q[i - 1] = q[i];
                    q[i] = i + 1;
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }

        }
        System.out.println(minBribes);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}

package mini_max_sum;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int smallest = arr[0];
        int biggest = arr[0];
        long max = 0;
        long min = 0;

        for (int j : arr) {
            if (j > biggest) {
                biggest = j;
            }
            if (j < smallest) {
                smallest = j;
            }
        }

        int smallestCounter = 0;
        int biggestCounter = 0;
        for (int j : arr) {
            if (j != smallest || smallestCounter > 0) {
                max += j;
            }
            if (j == smallest) {
                smallestCounter++;
            }
            if (j != biggest || biggestCounter > 0) {
                min += j;
            }
            if (j == biggest) {
                biggestCounter++;
            }
        }
        System.out.println(min + " " + max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

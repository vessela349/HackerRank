package plus_minus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void printRatio(int n, int arrSize){
        System.out.println(String.format("%.6f", (double)n/arrSize));
    }
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int arrSize = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                positive++;
            }
            if(arr[i]<0){
                negative++;
            }
            if(arr[i]==0){
                zero++;
            }
        }
        printRatio(positive, arrSize);
        printRatio(negative, arrSize);
        printRatio(zero, arrSize);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

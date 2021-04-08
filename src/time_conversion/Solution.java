package time_conversion;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        if (s.charAt(8) == 'A') {
            if (s.startsWith("12")) {
                s = s.replaceFirst("12", "00");
            }
            return s.substring(0, 8);
        }
        if (s.charAt(8) == 'P') {
            if (!s.startsWith("12")) {
                int currentHour = Integer.parseInt(s.substring(0, 2));
                int newHour = currentHour + 12;
                s = s.replaceFirst(s.substring(0,2), String.valueOf(newHour));
            }
            return s.substring(0, 8);
        }
        return "Error";
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
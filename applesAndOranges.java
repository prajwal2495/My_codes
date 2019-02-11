import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.regex.*;

public class applesAndOranges {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) 
    {
        int apple_size = apples.length;
        int orange_size = oranges.length;
        int apple_count = 0, orange_count = 0;
        ArrayList<Integer> apple_output = new ArrayList<Integer>();
        ArrayList<Integer> orange_output = new ArrayList<Integer>();
        for(int i = 0;i < apple_size;i++)
        {
            apple_output.add(a + apples[i]);
        }
        for(int j = 0;j < orange_size;j++)
        {
            orange_output.add(b + oranges[j]);
        }
        for(int k = 0;k < apple_output.size();k++)
        {
            if(apple_output.get(k) >= s && apple_output.get(k) <= t )
                apple_count += 1;
        }
        for (int l = 0; l < orange_output.size(); l++)
        {
            if(orange_output.get(l) >=s && orange_output.get(l) <= t)
                orange_count += 1;
        }
        System.out.println(apple_count);
        System.out.println(orange_count);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}

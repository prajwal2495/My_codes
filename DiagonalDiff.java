import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DiagonalDiff {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) 
    {
        //int size = arr.length;

        int Primary_Diagonal_diff = 0, Secondary_Diagonal_diff = 0;
        for(int i = 0;i < arr.length; i++)
        {
            for(int j = 0;j < arr.length;j++)
            {
                if(i == j)
                    Primary_Diagonal_diff += arr[i][j];
                if(i == arr.length - j - 1)
                    Secondary_Diagonal_diff += arr[i][j];
            }
        }   
        //for(int k = 0;k < arr.length;k++)     
          //  Secondary_Diagonal_diff += arr[k][arr.length - 1];

        return Math.abs(Primary_Diagonal_diff - Secondary_Diagonal_diff);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

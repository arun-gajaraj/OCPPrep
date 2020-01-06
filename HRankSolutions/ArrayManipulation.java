import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayManipulation {

   // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        int[] zeroArr = new int[n];

        for(int[] subArr: queries){
            int startIndex = subArr[0];
            int endIndex = subArr[1];
            int toAdd = subArr[2];

            for(int j = startIndex; j<= endIndex ; j++){
                if(j>=0 && j< n)
                zeroArr[j] += toAdd;
            }

        }


        return maxOf(zeroArr);

    }

    private static int maxOf(int[] finalArr){
        int max = 0;
        for(int i=0; i<finalArr.length ; i++){
            if(finalArr[i]>max)
                max = finalArr[i];
        }
        return max;
    } 

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

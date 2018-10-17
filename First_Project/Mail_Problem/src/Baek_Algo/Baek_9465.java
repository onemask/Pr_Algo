package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_9465 {

    static int[][] arr;
    static int[][] dp;

    public static void main(String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testnum = Integer.parseInt(br.readLine());

        while (testnum-- != 0) {
            int n = Integer.parseInt(br.readLine());
            arr = new int[2][n];
            dp = new int[2][n];

            //input arr
            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            dp[0][0] = arr[0][0];
            dp[1][0] = arr[1][0];

            dp[0][1] =arr[0][1]+arr[1][0];
            dp[1][1] =arr[1][1]+arr[0][0];

                for(int j=2;j<n;j++){
                    dp[0][j]=Math.max(dp[1][j-1],dp[1][j-2])+arr[0][j];
                    dp[1][j]=Math.max(dp[0][j-1],dp[0][j-2])+arr[1][j];
                }
            System.out.println(Math.max(dp[0][n-1],dp[1][n-1]));
        }



    }


        static public void print() {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            Arrays.fill(arr,0);
        }




}



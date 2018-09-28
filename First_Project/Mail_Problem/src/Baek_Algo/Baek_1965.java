package Baek_Algo;

import java.util.Scanner;

import static Baek_Algo.Baek_11726.dp;

public class Baek_1965 {

    static int[] dp = new int[10001];
    static int[] arr;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        DP(n);

    }

    static private int DP(int n) {

        for (int i = 2; i <= n; i++) {
            if (arr[i - 2] < arr[i - 1]) {
                dp[i - 2] = 1;
            }
        }
        return 1;
    }
}
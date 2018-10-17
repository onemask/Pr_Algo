package Baek_Algo;

import java.util.Scanner;

public class Back_11051 {

    static int[][] answer = new int[1001][10001];
    public static void main(String []args){

        Scanner sc =new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(dp(N,K));

    }

    /* answer[n][k] = dp[n-1][k-1]+dp[n-1][k];
     * nCn =1 , nC0 =1
     */
    private static int dp(int n,int k){

        if(n==k || k==0)  return 1;
        if(answer[n][k]>0)     return answer[n][k];

       answer[n][k] = dp(n-1,k-1)+dp(n-1,k);

        return answer[n][k] %10007;
    }
}

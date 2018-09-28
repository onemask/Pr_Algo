package Baek_Algo;

import java.util.Scanner;

public class Baek_1463 {

    static int dp[] = new int[1000001];
    static int cnt=0;

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(solution(n));
    }

    private static int solution(int n) {
        //n==1이라면 최소 값 0;
        if(n==1) return 0;

        if(dp[n]>0) return dp[n];

        dp[n]=solution(n-1)+1;

        if(n%3==0) {
            dp[n]= Math.min(dp[n/3] + 1,dp[n]);
        }
        if(n%2==0) {
           dp[n]= Math.min(dp[n/2]+1,dp[n]);
        }
        return dp[n];

    }

}

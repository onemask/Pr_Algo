package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Baek_1965 {

    static int[] dp = new int[10001];
    static int[] arr = new int[10001];
    static BufferedReader br;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException{

        br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        int max = 0 ;

        //input arr
        st= new StringTokenizer(br.readLine());
        for (int i = 0; i <n; i++)
            arr[i] = Integer.parseInt(st.nextToken(" "));


        dp[0]=1;

        for(int i=1;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(arr[i] >arr[j] && dp[j]+1 > dp[i]){
                    //증가 수열
                    dp[i]= dp[j]+1;
                }
            }

            if(max < dp[i])
                max = dp[i];
        }

        System.out.println(max);
    }
}



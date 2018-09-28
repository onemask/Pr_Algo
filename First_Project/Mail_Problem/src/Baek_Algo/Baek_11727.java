package Baek_Algo;

import java.io.*;
import java.util.Scanner;

public class Baek_11727 {


    static int[]memo = new int[1001];

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        bw.write(f(n)+"");
        bw.flush();
        bw.close();
    }

    private static int f(int n) {
        if(n ==0 || n==1) return 1;

        if(memo[n]> 0)    return memo[n];

        memo[n]=(f(n-1)+2*f(n-2))%10007;
        return memo[n];

    }
}

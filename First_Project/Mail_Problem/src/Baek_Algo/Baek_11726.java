package Baek_Algo;

import java.util.Scanner;

public class Baek_11726 {

    static int[] arr = new int[1001];
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(dp(n));

    }

    static public int dp(int n){
       arr[0]=1;

       if(n>0){
           arr[1]=1;
           for (int i = 2; i <=n; i++) {
               arr[i] = (arr[i - 1] + arr[i - 2])%10007;
           }
       }
        return (arr[n]);
    }
}

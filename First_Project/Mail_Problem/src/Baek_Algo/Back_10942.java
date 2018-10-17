package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Back_10942 {

    static  BufferedReader br ;
    static StringTokenizer st;

    static int[][] dp ;

    public static void main(String [] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));

        //input num
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken(" "));
        }

        dp = new int[n + 1][n + 1];

        // 비교 글자가 1개인 경우.
        for (int i = 1; i <= n; i++) {
            dp[i][i] = 1;
        }

        //비교 글자가 2개인 경우.
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i + 1]) {
                dp[i][i + 1] = dp[i + 1][i] = 1;
            }
        }

        //비교 글자가 3개인 경우.
        for (int i = 2; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                if (arr[j] == arr[j + i] && (dp[j + 1][j + i - 1] == 1)) {
                    dp[j][j + i] = dp[j + i][j] = 1;
                }
            }
        }

        //비교하기!!
        int case_num = Integer.parseInt(br.readLine());
        while (case_num-- > 0) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if (dp[start][end] == 1) System.out.println("1");
            else                     System.out.println("0");
        }
    }

//        //print answer
//        for(int i=0;i<answer.size();i++){
//            System.out.println(answer.get(i));
//        }





    private static int dp(int[] arr,int start, int end) {

        boolean result = true;

        while(start != end && result){

             if(arr[start-1] ==arr[end-1]) {
                start++;
                end--;
             }

            //글자 수 짝수
            else if(arr[start-1]!=arr[end-1]){
                 result =false;
            }
        }

        if(result)   return 1;

        else         return 0;
    }
}

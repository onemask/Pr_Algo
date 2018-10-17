package SW_PR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek_2210 {
    static int cnt = 0;
    static char[][] arr = new char[5][10];
    static char[] answer = new char[6];
    int[] dx  = {-1,1,0,0};
    int[] dy = {0,0,1,-1};


    public static void main(String[] args) throws IOException{

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str ;

        for(int i=0;i<5;i++) {
           str = br.readLine();
          for (int j = 0; j < 10; j++) {
              if (str.charAt(j) != ' ') {
                  arr[i][j] = str.charAt(j);
                 }
              }
          }


        print_arr();

//        for(int i=0;i<5*5;i++){
//
//            back_traking(i,1);
//
//        }





    }


    private static int back_traking(int idx, int len) {

        int num=0;

        if (len == 6) {
            cnt++;
        }

        for(int i=idx;i<5*5;i++){
            int x = i%5;
            int y = i/5;

           // answer[num]=arr;
        }


        for(int j = idx+1; j < 5*5; j++) {
           back_traking(j,len+1);
        }

        return cnt;
    }

    private static void print_arr(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}





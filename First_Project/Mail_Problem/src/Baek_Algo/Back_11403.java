package Baek_Algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.System.*;

public class Back_11403 {
    static int[][] adj;
    static int[] visit;
    static int size = 101;
    static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        adj = new int[N + 1][N + 1];
        visit =new int[N+1];

        //행렬 입력 받기.
        for (int i = 1; i <=N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
             for (int j = 1; j <=N; j++) {
                adj[i][j] = Integer.parseInt(st.nextToken());

             }
        }


        for(int i=1;i<=N;i++){
            init();
            dfs(i);
            print();
        }

//        //입력 받은 행렬 확인.
//        for (int i = 1; i <=N; i++) {
//            for (int j = 1; j <=N; j++) {
//                System.out.print(adj[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    static void init(){
        for(int i=1;i<=N;i++){
            visit[i]=0;
        }
    }


    static void dfs(int cnt){

        for(int i=1;i<=N;i++){
              if(( adj[cnt][i] ==1 ) && (visit[i]==0)) {
                  visit[i]=1;
                  dfs(i);
              }
        }

    }

    static void print() {
        for (int i = 1; i <= N; i++) {
            if (visit[i]==1) {
                System.out.print("1" + " ");
            } else
                System.out.print("0" + " ");
        }
        System.out.println();
    }


}


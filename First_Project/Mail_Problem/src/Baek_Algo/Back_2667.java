package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Back_2667 {
    static int N;
    static int cnt = 1;                                 //총 단지수
    static int len = 0  ;                               //단지 길이

    static int[][] adj= new int[25][25];                //아파트
    static boolean[][] visit = new boolean[25][25];
    static int[]dx = {0,1,0,-1};
    static int[]dy= {1,0,-1,0};

    static int[]sort;                                   //오름차순 할 아이

    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc =new Scanner(System.in);
        N = sc.nextInt();

        //Input
        for (int i=0;i<N;i++) {
            String str= sc.next();
            for (int j = 0; j <N; j++) {
                adj[i][j] = str.charAt(j)-'0';
            }
        }

        for (int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(adj[i][j]==1 && !visit[i][j]) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }


        System.out.println(cnt-1);                  //총 단지수
        sort =new int[cnt];

        for(int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                if(adj[i][j]!=0){
                    sort[adj[i][j]]++;
                }
            }
        }

        Arrays.sort(sort);
        for(int i=1;i<cnt;i++){
            System.out.println(sort[i]);
        }





    }


    static void dfs(int x,int y){

        adj[x][y]=cnt;
        visit[x][y]=true;

        for(int i=0;i<4;i++){
            int xx = x +dx[i];
            int yy = y +dy[i];

            if(xx>=0 && yy>=0 && xx<N && yy<N){
                if(adj[xx][yy]==1 && !visit[xx][yy])
                    dfs(xx,yy);
            }
        }
    }

    public void print(){
                //Output
        for (int i=0;i<N;i++) {
            for (int j = 0; j <N; j++) {
                System.out.print(adj[i][j]);
            }
            System.out.println();
        }

    }


}

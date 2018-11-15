package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baek_2178 {

    static boolean[][] visited;
    static int[][] adj;
    static int N,M;
    static int[]dx = {1,-1,0,0};
    static int[]dy ={0,0,1,-1};

    static class Dot{
        int x,y;
     public Dot(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);

        adj= new int[N][M];
        visited = new boolean[N][M];

        //input adj
        for(int i=0;i<N;i++){
            String row = br.readLine();
            for(int j=0;j<M;j++){
                adj[i][j]=row.charAt(j)-'0';
            }
        }

        visited[0][0]=true;
        BFS(0,0);

        //print adj
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++)
               System.out.print(adj[i][j]);
            System.out.println(); }


        System.out.println(adj[N-1][M-1]);
    }

    private static void BFS(int x,int y) {
        Queue<Dot> q= new LinkedList<>();
        q.add(new Dot(x,y));

        while (!q.isEmpty()){
          Dot d = q.poll();
            for(int i=0;i<4;i++) {
               int posx = d.x + dx[i];
               int posy = d.y + dy[i];

                if (0 <= posx && posx < N && 0 <= posy && posy < M && adj[posx][posy]==1 &&!visited[posx][posy]){
                    q.add(new Dot(posx, posy));
                    adj[posx][posy]=adj[x][y]+1;
                    visited[posx][posy] = true;
                 }

            }
        }
    }

}

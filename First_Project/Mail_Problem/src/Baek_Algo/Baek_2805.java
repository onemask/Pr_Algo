package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_2805 {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] map = new int[500][500];
    static int[][] dp = new int[500][500];
    static int m;
    static int max = -1;
    static int answer = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        m = Integer.parseInt(br.readLine());

        //input map
        for (int i = 1; i <=m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <=m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //dynamic map
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=m; j++) {
                dfs(i, j);
            }
        }

//        //print map
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(dp[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println(max);

    }

    private static int dfs(int x, int y) {

        //방문안한경우.
        if(dp[x][y]==0) {

            dp[x][y] = 1; //방문했다.
            for (int i = 0; i < 4; i++) {
                int posx = x + dx[i];
                int posy = y + dy[i];

//                if ( 0<=posx && posx<m && 0<=posy &&posy<m &&map[x][y]<map[posx][posy]) {
                if (map[x][y] < map[posx][posy]) {
                    dp[posx][posy] = Math.max(dp[posx][posy], dfs(posx, posy) + 1);
                }
            }
        }
        max = Math.max(max,dp[x][y]);
        return dp[x][y];
    }
}




package Another_Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NHN_2 {

    static StringTokenizer st;
    static int N;
    static int cnt =1;
    static int[] sort;

    static int[][] arr;
    static boolean[][] visit;

    static int[]dx = {0,1,0,-1}; //북 동 남 서
    static int[]dy=  {1,0,-1,0}; //북 동 남 서


    public static void main(String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visit = new boolean[N][N];


        //input
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken(" "));
            }
        }

        //영역의 개수
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if( arr[i][j]==1 && !visit[i][j]){
                    dfs(i,j);
                    cnt++;
                }
            }
        }

        sort = new int[cnt];

        //sort 배열에 몇개의 1이 있는지 체크하는 함수.
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(arr[i][j]!=0){
                sort[arr[i][j]]++;
                }
            }
        }

        print_arr();
    }

    private static void dfs(int x, int y) {

        arr[x][y]=cnt;
        visit[x][y]=true;


        for(int i=0;i<4;i++) {
            int xx = x + dx[i];
            int yy = y + dy[i];


            if (xx >= 0 && xx < N && yy < N && yy >= 0){
                if(arr[xx][yy]==1 && !visit[xx][yy]){
                    dfs(xx,yy);
                }

            }

        }
    }
    private static void print_arr(){
       System.out.println(cnt-1);

        Arrays.sort(sort);
        for(int i=1;i<sort.length;i++){
           System.out.print(sort[i]+" ");
       }

    }

}

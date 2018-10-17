package SW_PR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaeK_14502 {

    static int N,M;
    static int answer=0;
    static int virus =2;

    static int[][] arr;
    static int[][] clone_arr;

    static int[] dx= {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken(" "));
        M = Integer.parseInt(st.nextToken(" "));
        arr = new int[N][M];
        clone_arr = new int[N][M];

        //input arr
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr[i][j]=Integer.parseInt(st.nextToken(" "));
            }
        }


        //백트래킹 - 모든 경우로 벽을 다 세워본다.
        for(int i=0;i<N*M;i++){
            int x = i%M;
            int y = i/M;
            if(arr[y][x]==0){
                arr[y][x]=1;
                set_up_wall(i,1);
                arr[y][x]=0;
            }
        }
        System.out.println(answer);
    }

    private static void set_up_wall(int pos,int wall) {

        if (wall == 3) {
            for (int i = 0; i < N; i++)
                for (int j = 0; j < M; j++)
                    clone_arr[i][j] = arr[i][j];

            //바이러스 퍼뜨리기
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (clone_arr[i][j] == 2) {
                        spread_virus(i, j);
                    }
                }
            }
            //안전 영역 계산하기.
            count_virus();


        } else {
            for (int i = pos + 1; i < N * M; i++) {
                int xx = i % M;
                int yy = i/M ;
                if (arr[yy][xx] == 0) {
                    arr[yy][xx] = 1;
                    set_up_wall(i, wall + 1);
                    arr[yy][xx]=0;
                }
            }
        }


    }//end of set_up_wall


    private static void spread_virus(int y,int x){
        for(int i=0;i<4;i++){
            int posx = x+dx[i];
            int posy = y+dy[i];
            if(0<=posx && posx <M &&0<=posy && posy<N){
                if(clone_arr[posy][posx]==0){
                    clone_arr[posy][posx]=virus;
                    spread_virus(posy,posx);
                }
            }
        }
    }//end of spread_viurs

    private static void count_virus(){
        int cnt=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(clone_arr[i][j]==0){
                    ++cnt;
                }
            }
        }
        if(answer < cnt){
            answer = cnt;
        }
    }

    private static void print_arr(int[][] array){
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

}
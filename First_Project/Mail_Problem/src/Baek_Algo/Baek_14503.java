package Baek_Algo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Baek_14503 {

    static int N,M;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][]arr;
    static int answer =1;


    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());       N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];

        st = new StringTokenizer(br.readLine());
        int start_x = Integer.parseInt(st.nextToken());
        int start_y = Integer.parseInt(st.nextToken());
        int direction = Integer.parseInt(st.nextToken());

        //input array
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<M;j++){
                arr[i][j] =  Integer.parseInt(st.nextToken());
            }
        }


        dfs(start_x,start_y,direction);
        System.out.println(answer);


//               //print array
//        for(int i=0;i<N;i++){
//            for(int j=0;j<M;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();

    }




    /*
     *2. 현재 위치에서 현재 방향을 기준으로 왼쪽방향부터 차례대로 탐색을 진행한다.
      2-1. 왼쪽 방향에 아직 청소하지 않은 공간이 존재한다면, 그 방향으로 회전한 다음 한 칸을 전진하고 1번부터 진행한다.
      2-2.왼쪽 방향에 청소할 공간이 없다면, 그 방향으로 회전하고 2번으로 돌아간다.
      2-3.네 방향 모두 청소가 이미 되어있거나 벽인 경우에는, 바라보는 방향을 유지한 채로 한 칸 후진을 하고 2번으로 돌아간다.
      2-4. 네 방향 모두 청소가 이미 되어있거나 벽이면서, 뒤쪽 방향이 벽이라 후진도 할 수 없는 경우에는 작동을 멈춘다.
     * d가 0-북,1-동,2-남,3-서
     */

     static void dfs(int x, int y, int d) {

        arr[x][y]=-1;
        int posx,posy;
        int back;

        //방향 탐색
        for(int i=0;i<4;i++){
            if(d==0)         d=3;
            else if(d==1)    d=0;
            else if(d==2)    d=1;
            else             d=2;

            posx = x +dx[d];
            posy = y + dy[d];

            //왼쪽이 청소 가능한 경우.
            if(0<=posx && posx <N && 0<=posy && posy<M && arr[posx][posy] ==0){
                answer++;
                dfs(posx,posy,d);
                return;
            }
        }

            //후진
         if(d==0)        back=2;
         else if (d ==1) back=3;
         else if (d==2)  back=0;
         else            back=1;

         posx=x+dx[back];
         posy=y+dy[back];

         if(0<=posx && posx <=N && 0<=posy && posy <=M && arr[posx][posy]!=1)
          dfs(posx,posy,d);


    }
}

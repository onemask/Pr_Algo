package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_11559 {


    static int[] dx = {0,-1,0,1};
    static int[] dy = {1,0,-1,0};
    static char[][]puyo = new char[12][6];
    static int[][]visit = new int[12][6];
    static int answer=0;
    static int top_idx=12;



    public static void main(String [] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<12;i++){
            String str = br.readLine();
            for(int j=0;j<6;j++){
                puyo[i][j]= str.charAt(j);
                if(puyo[i][j]!='.')
                    top_idx = Math.min(top_idx,i);
            }

        }



        while(true){
            boolean flag = false;
            for(int i = top_idx;i<12;i++){
                for(int j=0;j<6;j++){
                    if(puyo[i][j]=='.') continue;
                    if(dfs(i,j) >=4){ //4번이상
                        flag =true;
                        pang();
                        print();
                    }
                clear();
                }
            }

            if(flag){
                answer++;
                down();
                print();
            }
            else
                break;
        }
        System.out.println(answer);
    }



     public static int dfs(int x, int y) {
        visit[x][y] = 1;
        int answer =1 ;

        for(int i=0;i<4;i++){
            int posx = x+dx[i];
            int posy = y+dy[i];

            if( 0<=posx && posx <12 && 0<=posy && posy < 6 &&
                    puyo[x][y] == puyo[posx][posy] && visit[posx][posy]==0 )
                answer += dfs(posx,posy);
        }
        return answer;
    }

    //뿌요가 터진 후 작업처리.
    public static void pang() {
        for (int i = top_idx; i < 12; i++){
            for (int j = 0; j < 6; j++) {
                if (visit[i][j] == 1)
                    puyo[i][j] = '.';
                visit[i][j] = 0;
            }
        }
    }//end of pang

    //뿌요 초기화
    public static void clear(){
        for(int i=top_idx;i<12;i++) {
            for (int j = 0; j < 6; j++) {
                visit[i][j] = 0;
            }
        }
    }//end of clear


    //뿌요 터지고 내려감.
    public  static void down(){
        for(int i=10;i>=top_idx;i--){
            for(int j=5;j>=0;j--){
                if(puyo[i][j]=='.')
                    continue;

                int idx = i;
                while(true) {
                //바닥까지 확인 경우
                    if(idx ==11 || puyo[idx +1][j]!='.')
                        break;

                    puyo[idx+1][j]=puyo[idx][j];
                    puyo[idx][j]='.';
                    idx++;
                }
            }
        }
    }//end of down


    public static void print() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++)
                System.out.print(puyo[i][j]);
        System.out.println();
        }
    System.out.println();

    }

}

package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek_7562 {

    static int[] dx= {-2,-1,-2,-1,1,2, 1,2};
    static int[] dy ={ 1, 2,-1,-2,2,1,-2,-1 };
    static ArrayList<Integer> answer = new ArrayList<>();
    static Queue<Dot> q = new LinkedList<>();


    static class Dot{
        int x,y;
         public Dot(int x,int y){
            this.x=x;
            this.y=y;
        }
    }


    public static void main(String []args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            int test_num = Integer.parseInt(br.readLine());

            while (test_num--!=0){
                int I = Integer.parseInt(br.readLine());
                int[][] map = new int[I][I];

                //시작점.
                st = new StringTokenizer(br.readLine());
                int S_x = Integer.parseInt(st.nextToken());
                int S_y = Integer.parseInt(st.nextToken());
                q.clear();
                q.offer(new Dot(S_x,S_y));
                map[S_x][S_y]=1;

                //도착점.
                st = new StringTokenizer(br.readLine());
                int D_x = Integer.parseInt(st.nextToken());
                int D_y = Integer.parseInt(st.nextToken());

                answer.add(BFS(map,D_x,D_y));
            }

            for(int output : answer)
                System.out.println(output-1);



    }

    private static int BFS(int[][] map, int d_x, int d_y) {


        while (!q.isEmpty() ){
                Dot now = q.poll();
                int now_x = now.x;
                int now_y = now.y;

                if (now_x == d_x && now_y == d_y)
                    break;


                for (int i = 0; i < 8; i++) {
                    int posx = now_x + dx[i];
                    int posy = now_y + dy[i];

                    if (0 <= posx && posx < map.length && 0 <= posy && posy < map.length && map[posx][posy] == 0) {
                        q.offer(new Dot(posx, posy));
                        map[posx][posy] = map[now_x][now_y]+1;
                    }
                }
        }

        return map[d_x][d_y];
    }

}

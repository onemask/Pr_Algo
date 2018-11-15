package Another_Challenge;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class STUnitas_9 {

    static class Dot{
        int x,y;
        public Dot(int x,int y){
            this.x= x;
            this.y =y;
        }
    }

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,-1,1};
    static int n,m ;
    static int map[][];
    static boolean visited[][];

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map =new int[n][m];
        visited = new boolean[n][m];

        //input map
        for(int i=0;i<n;i++){
            String row =br.readLine();
            for(int j=0;j<m;j++){
                map[i][j]=row.charAt(j)-'0';
             }
        }

        visited[0][0]=true;
        BFS(0,0);


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        System.out.println(map[n-1][m-1]);


    }

    private static void BFS(int x,int y) {
        Queue<Dot> q= new LinkedList<>();
        q.add(new Dot(x,y));

        while (!q.isEmpty()){
            Dot d = q.poll();
            for(int i=0;i<4;i++) {
                int posx = d.x + dx[i];
                int posy = d.y + dy[i];

                if (0 <= posx && posx < n && 0 <= posy && posy < m && map[posx][posy]==1 &&!visited[posx][posy]){
                    q.add(new Dot(posx, posy));
                    map[posx][posy]=map[d.x][d.y]+1;
                    visited[posx][posy] = true;
                }

            }
        }
    }

}

package Another_Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class STUnitas_3 {

    class Travel{
        int start,end,cost;
        public Travel(int start,int end,int cost){
            this.start=start;
            this.end=end;
            this.cost=cost;
        }
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        boolean[][] visitied = new boolean[n][n];
        int[] root = new int[n];
        ArrayList<ArrayList<Travel>> map = new ArrayList<>();

        //adj node 생성.
        for(int i=0;i<n;i++){
            map.add(new ArrayList<Travel>());
        }

        //input arr
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                visitied[i][j]=true;
                //bfs(i,j);
            }
        }




    }

    private static void bfs(int i, int j, int root) {



    }

}

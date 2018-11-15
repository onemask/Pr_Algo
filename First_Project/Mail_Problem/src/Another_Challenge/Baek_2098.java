package Another_Challenge;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_2098 {

    static int n; static int[][] map; static int[][]d;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        d = new int[n][1<<n]; //비트 마스킹을 사용하므로 2^n개사용한다.


        //input map
        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            //Arrays.fill(d[i],Integer.MAX_VALUE); //거리를 모두 Max로 초기화 .
            for(int j=0;j<n;j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();

        }

        //cur 현재 위치. start 도시 방문했을때 최소 값.
        System.out.println(tsp(2,3));


    }

    /*cur 위치에서 visit에 기록되지 않는 방문하지 않는 나머지를 방문하는 최소값.
    * ex) cur : 1 -> {2,3,4} ->1로 가는 순회하는 최소 값을 탐색
    */
    private static int tsp(int cur, int visit) {

        //모든 정점을 다 돌았으면 현재 위치에서 출발점으로 돌아감.
        if(visit ==(1<<n)-1) return map[cur][0];

        //현 위치에서의 거리값이 0이 아니면 이미 계산된 것이므로 값을 리턴.
        if(d[cur][visit]!=Integer.MAX_VALUE) return d[cur][visit];

        for(int i=0;i<n;i++){

            //방문 했으면 패스.
            if((visit&(1<<i))!=0)
                continue;
            //갈 수 없는 길이라면 패스.
            if(d[cur][i]==0)
                continue;
        }


//            if((visit&(1<<i))==0 && map[cur][i]!=0) //방문 안했으면서 길이 있으면 방문.
//                d[cur][visit] = Math.min(d[cur][visit],map[cur][i]+tsp(i,visit|(1<<i)));

        return d[cur][visit];
    }
}

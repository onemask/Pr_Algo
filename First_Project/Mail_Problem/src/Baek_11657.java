import com.sun.javafx.geom.Edge;
import sun.awt.image.ImageWatched;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baek_11657 {
    static int flag = -1;
    static int bus_route = 1000000;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //총 vertex 3
        int M = Integer.parseInt(st.nextToken()); //총 Edge   4


        BellmanFord[] bellmanFord = new BellmanFord[M]; //버스의 수
        int[] dist = new int[N + 1];                      // 시작점부터 각 노드의 최단 거리

        for (int i = 0; i < N + 1; i++) {
            dist[i] = bus_route;
        }

        //start node
        dist[1] = 0;

        //버스 정보 입력.
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt((st.nextToken()));
            int to = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            bellmanFord[i] = new BellmanFord(from, to, weight);
        }


        if (Cycle(bellmanFord, dist, N, M))
            for (int i = 2; i < N + 1; i++)
                if (dist[i] != bus_route)
                  System.out.println(dist[i]);

        else
            System.out.println(-1);


    }


    //사이클을 가지는지 확인.
    static boolean Cycle(BellmanFord[] bellmanFords, int[] dist, int N, int M) {

        //사이클을 가지지 않는 최대 N-1
        for (int i = 0; i < N - 1; i++) {
            //for each edge
            for (int j = 0; j < M; j++) {
                if (dist[bellmanFords[j].E] > dist[bellmanFords[j].V] + bellmanFords[j].W) {
                    dist[bellmanFords[j].E] = dist[bellmanFords[j].V] + bellmanFords[j].W;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            if (dist[bellmanFords[i].E] > dist[bellmanFords[i].V] + bellmanFords[i].W) {
                return false;
            }
        }

        return true;
    }
}

        class BellmanFord{
        int V;
        int E;
        int W;

        public BellmanFord(int from,int to,int weight){
            this.V=from;
            this.E =to;
            this.W=weight;
        }

    }






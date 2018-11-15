package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baek_1753 {
    public static class Edge {
        private int end_v;
        private int weight;

        public Edge(int v_end, int weight) {
            this.end_v = v_end;
            this.weight = weight;
        }
    }

    static int V_num, E_num, start;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //setting
        String[] firstLine = br.readLine().split(" ");
        V_num = Integer.valueOf(firstLine[0]);
        E_num = Integer.valueOf(firstLine[1]);
        start = Integer.parseInt(br.readLine());
        ArrayList[] vertex = new ArrayList[V_num+1];

        //vertex 생성.               왜 out of idx??
        for (int i = 1; i <= V_num; i++)
            vertex[i] = new ArrayList<Edge>();

        //edge 생성.
        for (int i = 0; i < E_num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V_start = Integer.parseInt(st.nextToken());
            int V_end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            vertex[V_start].add(new Edge(V_end, weight));

        }
        //int end = vertex[1].get(0).end_v;
        dikstra(start, vertex);

    }


    private static void dikstra(int start, ArrayList<Edge>[] vertex) {

        int[] distance = new int[V_num + 1];
        Arrays.fill(distance,11);

        boolean[] check = new boolean[V_num + 1];
        int now =0;
        Queue<Integer> q = new PriorityQueue<>();

        //시작점 거리 설정.
        q.add(start);
        distance[start]=0;
        check[start]=true;


        //
        while (!q.isEmpty()) {
            now = q.poll();
            check[now]=true;

            for (int i = 0; i < vertex[now].size(); i++) {
                 int end = vertex[now].get(i).end_v;
                 int weight = vertex[now].get(i).weight;

                    if (distance[end] > weight + distance[now]) {
                        distance[end] = Math.min(distance[end], weight + distance[now]);
                        q.add(end);
                    }
                }
            }

        for (int i = 1; i <= V_num; i++) {
            if (check[i]) {
                System.out.println(distance[i]);
            } else {
                System.out.println("INF");
            }
        }
    }

}

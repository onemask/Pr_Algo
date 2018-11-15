package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Baek_1707 {
    static int vertex_num, edge_num;
    static int Red = 1, Blufe = -1;
    static int team[]; //1- red, -1-blue
    static ArrayList<ArrayList<Integer>> graph;
    static boolean Biparte;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        graph = new ArrayList<>();

        int test_num = Integer.parseInt(br.readLine());
        ArrayList<String> answer = new ArrayList<>();

        while (test_num-- != 0) {
            String[] Info = br.readLine().split(" ");
            vertex_num = Integer.valueOf(Info[0]);
            edge_num = Integer.valueOf(Info[1]);
            team = new int[vertex_num + 1]; //RED = 1, BLUE = -1
            Biparte = true;
            graph.clear();

            //vertex 수만큼 arrayList 생성.
            for (int i = 0; i <= vertex_num; i++) {
                graph.add(new ArrayList<>());
                team[i] = 0;                      //team 도 초기화.
            }

            //input edge_info
            while (edge_num-- != 0) {
                String[] edge = br.readLine().split(" ");
                int V_S = Integer.parseInt(edge[0]);
                int V_E = Integer.parseInt(edge[1]);
                graph.get(V_S).add(V_E);
                graph.get(V_E).add(V_S);
            }

            for (int i = 1; i <=vertex_num; i++) {
                if (team[i] == 0 && Biparte)
                    BFS(i, Red);
            }

            if(Biparte? answer.add("YES"): answer.add("NO"));
        }

        for(String str : answer)
            System.out.println(str);

    }


    static void BFS(int start, int team_num) {

        Queue<Integer> bfs = new LinkedList<>();
        bfs.offer(start);
        team[start] = team_num;

        while (!bfs.isEmpty() && Biparte) {
            int start_node = bfs.poll();

            for (int adjv : graph.get(start_node)) {
               //방문한 적 없어.
                if (team[adjv] == 0) {
                    bfs.offer(adjv);
                    team[adjv] = (team[start_node] * -1);
                }

                //같은 팀이야!
                else if (team[start_node]+team[adjv]!=0) {
                    Biparte = false;
                    return;
                }
            }

        }
    }
}




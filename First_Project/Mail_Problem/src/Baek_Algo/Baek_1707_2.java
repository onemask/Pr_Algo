package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Baek_1707_2 {

    static int vertex_num, edge_num;

    static class Node {
        int start, end;
        Node(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_num = Integer.parseInt(br.readLine());
        Queue<Node> graph = new LinkedList<>();
        ArrayList<String> answer = new ArrayList<>();

        while (test_num-- != 0) {
            String[] Info = br.readLine().split(" ");
            vertex_num = Integer.valueOf(Info[0]);
            edge_num = Integer.valueOf(Info[1]);

            //input edge_info
            while (edge_num-- != 0) {
                String[] edge = br.readLine().split(" ");
                int V_S = Integer.parseInt(edge[0]);
                int V_E = Integer.parseInt(edge[1]);
                graph.add(new Node(V_S, V_E));
            }

            if (BFS(graph))
                answer.add("YES");
            else
                answer.add("NO");
        }

        //print answer;
        for (String real_anser : answer) {
            System.out.println(real_anser);
        }


    }

    private static boolean BFS(Queue<Node> graph) {

        ArrayList<Integer> red = new ArrayList<>();
        ArrayList<Integer> blue = new ArrayList<>();

        boolean[] visitied = new boolean[vertex_num+1];
        boolean answer = true;

        HashMap<Integer, Character> team = new HashMap<>();


        while (!graph.isEmpty()) {
            Node vertex = graph.poll();

            //start x
            if (!visitied[vertex.start] || team.get(vertex.start).equals('r')) {
                team.put(vertex.start, 'r');
                visitied[vertex.start] = true;
            } else if (!visitied[vertex.start] || team.get(vertex.start).equals('b')) {
                answer = false;
                break;
            }

            if (!visitied[vertex.end] || team.get(vertex.end).equals('b')) {
                team.put(vertex.end, 'b');
                visitied[vertex.end] = true;
            } else if (!visitied[vertex.end] || team.get(vertex.end).equals('a')) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
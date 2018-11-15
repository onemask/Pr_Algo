package Baek_Algo;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Baek_1865_2 {

    static final int init = 100001;

    static class Node {
        int S, E, W;

        Node(int S, int E, int W) {
            this.S = S;
            this.E = E;
            this.W = W;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test_num = Integer.parseInt(br.readLine());
        ArrayList<Node> adj = new ArrayList<Node>();
        ArrayList<String> answers = new ArrayList<String>();


        while (test_num-- != 0) {
            String[] road = br.readLine().split(" ");
            int N = Integer.parseInt(road[0]);
            int M = Integer.parseInt(road[1]);
            int W = Integer.parseInt(road[2]);

            int[] distance = new int[N + 1];

            //Graph 간선 정보 저장.
            while (M-- != 0) {
                String[] graph = br.readLine().split(" ");
                int S = Integer.parseInt(graph[0]);
                int E = Integer.parseInt(graph[1]);
                int T = Integer.parseInt(graph[2]);

                adj.add(new Node(S, E, T));
                adj.add(new Node(E, S, T));
            }

            //웜홀 정보 저장.
            while (W-- != 0) {
                String[] graph = br.readLine().split(" ");
                int S = Integer.parseInt(graph[0]);
                int E = Integer.parseInt(graph[1]);
                int T = Integer.parseInt(graph[2]);
                adj.add(new Node(S, E, -T));
            }

            Arrays.fill(distance, Integer.MAX_VALUE);
            distance[1] = 0;

            String ans = "NO";

            for (int i = 1; i <= N; i++) {
                for (Node nxt : adj) {
                    if (distance[nxt.S] == Integer.MAX_VALUE) continue;

                    if (distance[nxt.E] > distance[nxt.S] + nxt.W) {
                        distance[nxt.E] = distance[nxt.S] + nxt.W;

                        if (i == N) {
                            ans = "YES";
                            break;

                        }

                    }

                }
                bw.write(ans + "\n");

            }
            br.close();
            bw.flush();
            bw.close();
        }
    }
}



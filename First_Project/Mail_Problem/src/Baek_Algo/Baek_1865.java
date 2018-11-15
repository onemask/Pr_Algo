package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baek_1865 {

    public static class Node {
        int start;
        int end;
        int weight;

        private Node(int start,int end,int weight){
            this.start=start;
            this.end=end;
            this.weight=weight;
        }
    }

    static int Test_num;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        ArrayList<Boolean> answer = new ArrayList<>();

        Test_num = Integer.parseInt(br.readLine());

        while(Test_num--!=0) {
            String[] str = br.readLine().split(" ");

            //도로의 상황
            int N = Integer.parseInt(str[0]);
            int M = Integer.parseInt(str[1]);
            int W = Integer.parseInt(str[2]);

            for (int i = 1; i <= N; i++) {
                graph.add(new ArrayList<>());
            }

            int[] distance = new int[N];

            //input 도로의 정보.
            for (int i = 0; i < M + 1; i++) {
                String[] set = br.readLine().split("");
                int S = Integer.parseInt(str[0]);
                int E = Integer.parseInt(str[1]);
                int T = Integer.parseInt(str[2]);
                graph.get(S).add(new Node(S, E, T));
            }

            //웜홀 넣기.
            for (int i = 0; i < W; i++) {
                String[] hole = br.readLine().split("");
                int S = Integer.parseInt(str[0]);
                int E = Integer.parseInt(str[1]);
                int T = Integer.parseInt(str[2]);
                graph.get(S).add(new Node(S, E, -T));
            }

            answer.add(BellmanFord(distance,graph,N,M));
        }
    }

    private  static boolean BellmanFord(int[] distance,ArrayList<ArrayList<Node>> graph,int N,int M){

        int min = 10000000;
        boolean answer = true;

        for(int i=1;i<N;i++){
            int size = graph.get(i).size();
            for(int j=0;j<size;i++){
                distance[i]=Math.min(min,distance[i]+graph.get(i).get(j).weight);
            }
        }

        for(int i=0;i<N;i++){
            if(distance[i]<0)
                answer=  true;
            else
                answer =false;
        }

        return answer;
    }

}

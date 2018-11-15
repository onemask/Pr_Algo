package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baek_1135 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int node_num = Integer.parseInt(br.readLine());
        int parent;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int answer =0 ;

        int[] tree =new int[node_num];

        for(int i=0;i<node_num;i++)
            graph.add(new ArrayList<>());

        StringTokenizer st =new StringTokenizer(br.readLine());
        for(int i=0;i<node_num;i++){
            parent=Integer.parseInt(st.nextToken());
            tree[i]=parent;

            if(parent!=-1){
                graph.get(parent).add(i);
            }
        }

        for(int i=0;i<node_num;i++){
            if (graph.get(i).isEmpty())
                answer++;
        }

        System.out.println(answer);

    }
}

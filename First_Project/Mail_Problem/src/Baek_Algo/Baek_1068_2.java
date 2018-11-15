package Baek_Algo;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Baek_1068_2 {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int answer = 0 ;

    public static void main(String[] args) throws IOException {
       int v, deleteNode;

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int num = Integer.parseInt(br.readLine());

       int[] tree = new int[num];

       for(int i=0;i<num;i++)
           graph.add(new ArrayList<>());


       StringTokenizer st = new StringTokenizer(br.readLine());
       //input node
       for (int i = 0; i < num; i++) {
           v = Integer.parseInt(st.nextToken());
           tree[i] = v;
           if (v != -1) {
               graph.get(v).add(i);
           }
       }

       //leaf node 찾기.
       for (int i = 0; i < num; i++) {
           if (graph.get(i).isEmpty())
               answer++;
       }

       //node 삭제.
       deleteNode = Integer.parseInt(br.readLine());
       dfs(deleteNode);

       if (tree[deleteNode]!= -1 && graph.get(tree[deleteNode]).size() == 1) {
           answer++;
       }
        System.out.println(answer);
   }


   public static void dfs(int deleteNode){
      //leaf node를 지우게 되면 answer--
      if(graph.get(deleteNode).isEmpty())
               answer--;

      else //parent node면 child 값 삭제.
          for(int nextNdoe: graph.get(deleteNode))
              dfs(nextNdoe);


   }


}






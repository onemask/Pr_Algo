package PR_Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DFS_PR {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[num+1];

        //그래프 depth
       // while (num != 0) {
            ArrayList<Integer>[] graph = (ArrayList<Integer>[]) new ArrayList[num + 1];

            //각 배열에 한개씩
            for (int i = 0; i <= num; i++) {
                graph[i] = new ArrayList<>();
            }

            if(st.hasMoreTokens()){
            for (int i = 1; i <= num; i++)
                graph[i].add(Integer.parseInt(st.nextToken()));
            }

            for(int i=0;i<=num;i++)
            System.out.println(graph[i]);


            dfs(graph,visited,num);




//            if (st.hasMoreTokens()) {
//                int first = Integer.parseInt(st.nextToken());
//                graph[first].add(first + 1);
//
//                for (int i = 1; i <= num; i++) {
//                    graph[i].add(i + 1);
//                    graph[i].add(i - 1);
//                }
//                graph[1].remove(0);
//                graph[7].remove(8);
//            }
        }

        public static void dfs(ArrayList<Integer>[] adj, boolean[] t,int v){
            int n = adj.length-1;
            t[v] = true;
            System.out.print(v + " ");

            for (int i=1;i<=n;i++){
                if(adj[i].equals(i+1) && !t[i]){
                    dfs(adj, t, v);
                }
            }

        }
    }






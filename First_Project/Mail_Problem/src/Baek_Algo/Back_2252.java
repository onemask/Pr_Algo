package Baek_Algo;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;

public class Back_2252 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //학생 수
        int M = Integer.parseInt(st.nextToken()); // 비교 횟수


        LinkedList<Integer> graph[] = new LinkedList[N+1];
        int indegree[] = new int[N+1];

        for (int i=1;i<N+1;i++){
            graph[i]=new LinkedList<>();
        }

        int from,to;

        for (int i=0;i<M;i++){
            StringTokenizer st2 =new StringTokenizer(br.readLine()," ");
            from = Integer.parseInt(st2.nextToken());
            to =Integer.parseInt(st2.nextToken());

            graph[from].add(to);
            indegree[to]++;
        }


        PriorityQueue<Integer> q =new PriorityQueue<>();

        for (int i=1;i<N+1;i++) {
            //q에 값넣기
            if (indegree[i] == 0) {
                q.offer(i );
                System.out.print((i ) + " ");
            }
        }

        //DFS, QUEU
        //form -> to 대로 출력.
        while(!q.isEmpty()) {
            int root = q.poll();
            for (int node : graph[root]) {
                indegree[node]--;
                if (indegree[node] == 0) {
                    q.add(node);
                    System.out.print(node + " ");
                }
            }
        }
    }
}

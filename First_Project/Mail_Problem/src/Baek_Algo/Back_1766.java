package Baek_Algo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Back_1766 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] indegree = new int[N + 1];
        LinkedList[] link = new LinkedList[N + 1];

        //이 과정이 필요할까?
        for (int i = 1; i < N + 1; i++) {
            indegree[i] = 0;
            link[i] = new LinkedList<>();
        }

        //연결?
        for (int i = 0; i < M; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();

            link[from].add(to);
            indegree[to]++;
        }

        PriorityQueue<Integer> q = new PriorityQueue<Integer>();

        for (int i = 1; i<= N; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }

        }

        while (!q.isEmpty()) {
            int now = (int) q.poll();
            System.out.print(now + " ");

            for (int i=0;i<link[now].size();i++){

                int node = (int) link[now].get(i);
                indegree[node]--;

                if(indegree[node]==0){
                    q.add(node);

                }
            }

        }

    }
}










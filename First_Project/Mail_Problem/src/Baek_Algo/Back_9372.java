package Baek_Algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Back_9372 {

    static int testcase;
    static int country, airplane;
    static int[] visit;
    static int INF = 10000000;



    public static void main(String[] args) {

        String str ="김수연";
        int size = str.length()-1;
        System.out.println(size);
        int idx=1;

        str.charAt(idx);

        Scanner sc = new Scanner(System.in);
        testcase = sc.nextInt();

        if(str.charAt(idx)!=str.charAt(idx+1))




        while ((testcase--) != 0) {

            //input
            country = sc.nextInt();
            airplane = sc.nextInt();
            ArrayList<Integer>[] adj = new ArrayList[country + 1];

            for (int i = 0; i <= country; i++)
                adj[i] = new ArrayList<>();

            for (int i = 0; i < country; i++) {
                int from = sc.nextInt();
                int to = sc.nextInt();
                adj[from].add(to);
                adj[to].add(from);
            }

            for (int i = 1; i < adj.length; i++) {
                System.out.println(adj[i]);
            }


        }
    }
}

class Node {
    int from;
    int to;

    public Node(int from,int to){
        this.from = from;
        this.to   = to;
    }
}

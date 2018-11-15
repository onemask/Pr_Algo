//package Baek_Algo;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class Baek_1613 {
//
//
//    public static void main(String[] args)throws IOException{
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        Queue<Queue> q = new LinkedList<>();
//        Queue<Integer> sub_q = new LinkedList();
//        sub_q.offer(3);
//
//        System.out.println();
//
//        System.out.println(q.offer(sub_q));
//        System.out.println(q.poll(sub_q));
//
//
//        //백트래킹 시뮬레이션
//
//
//
//
//        //setting n,k
//            st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        k = Integer.parseInt(st.nextToken());
//        int map [][] = new int[n][n];
//
//        //input edge
//        while (k--!=0){
//            st = new StringTokenizer(br.readLine());
//            int start = Integer.parseInt(st.nextToken());
//            int end = Integer.parseInt(st.nextToken());
//            map[start][end] = 1;
//            map[end][start] = -1;
//
//        }
//
//        for(int k=1;k<=n;k++)
//            for(int i=1;i<=n;i++)
//                for(int j=1;j<=n;j++){
//
//                }
//
//
//
//
//        int output = Integer.parseInt(br.readLine());
//
//
//
//    }
//}

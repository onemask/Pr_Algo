//package Baek_Algo;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.StringTokenizer;
//
//public class Baek_1068 {
//
//    public class Node {
//        int data,parent;
//        ArrayList<Integer> child = new ArrayList<>();
//
//        public void setchild(int parent){
//            child.add()
//        }
//
//    }
//
//
//
//    public static void main (String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int node_num = Integer.parseInt(br.readLine());
//        int root_num=-1 ;
//
//
//        Node[] tree = new Node[node_num];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//
//        for(int i=0;i<node_num;i++){
//            int parent = Integer.parseInt(st.nextToken());
//            //루트다.
//            if(parent==-1){
//                root_num = i;
//                continue;
//            }
//            else{
//                tree[i].parent=parent;
//                tree[i].child=i;
//
//
//            }
//        }
//
//
//
//
//    }
//
//}

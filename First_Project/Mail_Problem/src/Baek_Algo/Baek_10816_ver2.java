package Baek_Algo;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_10816_ver2 {

    static int[] total_card = new int[500000];
    static int[] look_for= new int[500000];
    static int[] answer = new int[500000];


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //total card
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
                total_card[i]=Integer.parseInt(st.nextToken());
        }

        //look for card
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            look_for[i]=Integer.parseInt(st.nextToken());
        }


        for(int i=0;i<M;i++){
            bw.write(answer[i]+" ");
        }
        bw.flush();
        bw.close();
    }

    private static void solution(int[] total_card, int[] look_for) {


    }
}

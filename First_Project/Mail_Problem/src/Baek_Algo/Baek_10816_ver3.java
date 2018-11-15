package Baek_Algo;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Baek_10816_ver3 {
    static HashMap<Integer,Integer> totalmap = new HashMap<>();
    static int[] totalcard = new int[20000001];

    public static void main(String[] args) throws IOException {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M =  Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(M--!=0){
            int idx = Integer.parseInt(st.nextToken(" "));
            totalcard[idx+10000000]++;
        }

        int N=Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        while(N--!=0){
            int idx = Integer.parseInt(st.nextToken());
            bw.write(totalcard[idx+10000000]+" ");
        }
        bw.flush();
        bw.close();

    }
}

package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Baek_6603_ver3 {

    static int[] arr;
    static int[] visit;
    static int num;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            num = Integer.parseInt(st.nextToken());
            if (num == 0) {
                break;
            }

            arr = new int[num];
            visit = new int[num];

            for (int i = 0; i < num; i++) {
                arr[i] = Integer.parseInt(st.nextToken(" "));
            }
            dfs(0, 0);
            System.out.println();
        }
    }


    private static void dfs(int start, int depth) {

        if(depth==6) {
            for (int i = 0; i < num; i++) {
                if (visit[i] == 1) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

        for(int i=start;i<num;i++){
                visit[i]=1;
                dfs(i+1,depth+1);
                visit[i]=0;
            }
        }




    }

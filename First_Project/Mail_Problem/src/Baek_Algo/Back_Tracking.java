package Baek_Algo;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Back_Tracking {
    static int[] lotto ;//입력 받을 배열
    static int[] answer ;//방문 했는지 확인.
    static int num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Scanner sc = new Scanner(System.in);
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            num=Integer.parseInt(st.nextToken());

            lotto = new int[num];
            answer = new int[num];

            if(num!=0) {
                for (int i = 0; i < num; i++) {
                    lotto[i] = Integer.parseInt(st.nextToken());
                }
                dfs(0, 0);
                System.out.println();

            }
            else
                break;

            }
        }

    static void dfs(int start, int depth) {
        if (depth == 6) {
            for (int i = 0; i < 6; i++) {
                System.out.print(answer[i] + " ");
            }
        System.out.println();
        return;

        }

        for (int i = start; i < num; i++) {
            answer[depth] = lotto[i];
            dfs(i + 1, depth + 1);
        }

    }

}



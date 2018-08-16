package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Back_11407 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int testcase = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int rlt =0;

        int[] array = new int[testcase];
        for (int i = 0; i < testcase; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        int len = array.length-1;

        while(money !=0) {
            if (money >= array[len]) {
                rlt += money/array[len];
                money%=array[len];
            }
            len--;
        }

        System.out.println(rlt);


    }


}






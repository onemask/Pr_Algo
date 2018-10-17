package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Back_1932 {
    static StringTokenizer st;
    static BufferedReader br;

    public static void main(String[] args) throws IOException{
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

        while(num--!=0){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            int first = br.read();
            dp(first);

        }


    }

    private static void dp(int pos) {



    }
}

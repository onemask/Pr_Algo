package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Back_2902 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str =br.readLine();
        String[] array= str.split("-");

        for (int i=0;i<array.length;i++){
            System.out.print(array[i].charAt(0));

        }


    }
}

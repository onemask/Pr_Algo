package Baek_Algo;

import java.util.Scanner;

public class Baek_2163 {

    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        // (M-1) + M(N-1) = M-1+MN-M =MN-1
        System.out.println(N*M-1);

    }
}

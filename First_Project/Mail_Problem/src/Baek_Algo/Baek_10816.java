package Baek_Algo;

import java.util.Scanner;

public class Baek_10816 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] have_card = new int[500000];

        //input total card
        for(int i=0;i<N;i++){
            have_card[i]= sc.nextInt();
        }

        //input search card
        int M = sc.nextInt();
        int[] look_for = new int[500000];
        for(int i=0;i<M;i++){
            look_for[i]=sc.nextInt();
        }

        //check card
        int[]answer = new int[M];
        for(int i=0;i<M;i++) {
            for( int j=0;j<N;j++){
                if(look_for[i]==have_card[j]){
                    answer[i]++;
                }
            }
        }

        //output card
        for(int i=0;i<M;i++){
            System.out.print(answer[i]+" ");
        }


    }
}

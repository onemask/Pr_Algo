package Baek_Algo;

import java.util.Scanner;

public class Back_11478_ver2 {

    static String[] str = new String[1000];
    static String[] flag = new String[1000];


    public static int main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();


        for (int i=0;i<input.length();i++){
            str[i]=input.substring(0,3);
        }


        //powerset(str.length()/sizeof(int),0);
        return 0;
    }

    void powerset(int n,int depth){
        if(n==depth){
            int i;
            System.out.print("{");
            for(i=0;i<n;i++){
                //if(flag[i]==1);
            }
        }

    }


}

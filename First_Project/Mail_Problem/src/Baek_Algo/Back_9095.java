package Baek_Algo;

import java.util.Scanner;

public class Back_9095 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
       //int test_case= sc.nextInt();
       // int[] input = new int[test_case];
       //int[] output = new int[test_case];

       // for(int i=0;i<test_case;i++){
       //     input[i]=sc.nextInt();
       // }
        //  fact_recursive(7);
        int n = sc.nextInt();
        System.out.println(fact_recursive(n-1));

    }

    private static int solution(int[] array){

        return 0;
    }

    //생각해라.
    int fact(int n){
        int rlt = 1;
        for(int i=1;i<=n;i++){
            rlt= rlt * i;
        }return rlt;
    }

    //n!을 구하는 함수 (재귀 호출)
    static int fact_recursive(int n){


        //n이 0이면 더이상 쪼개지지 않는다. (기저사례)
        if (n<1) {
            return 1;
        }


        else
            return n+fact_recursive(n-1);



        //n은 n*(n-1)!로 쪼개질 수 있다.
        //return n+fact_recursive(n-3)+fact_recursive(n-2)+fact_recursive(-1);
        //return n+fact_recursive(n-3);

    }
}

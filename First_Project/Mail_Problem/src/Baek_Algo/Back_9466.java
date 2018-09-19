package Baek_Algo;

import java.util.Scanner;
import java.util.Vector;

public class Back_9466 {
    static Vector<Integer> student= new Vector<Integer>();        //학생이 가리키는 다음 학생 번호
    static Vector<Integer> first_std=new Vector<Integer>();      //첫번째로 dfs 를 시작하는 학생 번호
    static Vector<Integer> visit = new Vector<Integer>();

    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        int test_case = sc.nextInt();

        for(int i=0;i<test_case;i++){

            int std_num = sc.nextInt();

            for(int j=1;j<=std_num;j++)
               student.add(i,sc.nextInt());

            int ans = 0 ;
            for (int k=1;k<=std_num;k++){
                if(visit.get(k)==1) {
                    ans+=dfs(k,k,1);
                }
            }

            System.out.println(std_num-ans)   ;
        }
    }

    private static int dfs(int start, int current, int cnt) {
        return 0;
    }

}

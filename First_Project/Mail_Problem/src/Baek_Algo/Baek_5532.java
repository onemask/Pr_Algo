package Baek_Algo;

import java.util.Scanner;

public class Baek_5532 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int vacation = sc.nextInt(); //20
        int kor = sc.nextInt();      //25
        int math = sc.nextInt();     //30
        int D_kor = sc.nextInt();    //6
        int D_mat = sc.nextInt();    //8

        int k_answer=kor/D_kor;
        int m_answer=math/D_mat;

        if (kor%D_kor!=0)
          k_answer++;


        if(math%D_mat!=0)
           m_answer++;


        if( k_answer > m_answer)
            System.out.println(vacation-k_answer);

        else if(k_answer < m_answer)
            System.out.println(vacation-m_answer);

        else
            System.out.println(vacation-k_answer);

    }
}

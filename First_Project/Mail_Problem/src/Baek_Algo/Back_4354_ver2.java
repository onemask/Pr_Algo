package Baek_Algo;

import java.util.Scanner;
import java.util.Vector;

public class Back_4354_ver2 {

    public  static void main(String[] args){
        Scanner sc =new Scanner(System.in);

    while(true){
        String str=sc.nextLine();
        if(str.length() ==1 && str.charAt(0)=='.')
            break;

        Vector<Integer> pi =  pi =getPi(str);



        if(pi.get(str.length()-1)==0)
            System.out.println(1);
        else
            System.out.println(str.length()/(str.length()-pi.get(str.length()-1)));

    }


    }

    public static Vector<Integer> getPi(String str) {

        int M = str.length();
        Vector<Integer> pi = new Vector<Integer>(M, 0);
        //KMP로 자기 자신을 찾는다.
        //N에서 N을 찾는다.
        //begin=0 이면 자기 자신을 찾으니까 안됨.

        int begin = 1, matched = str.length()-1;


        while (begin + matched < M) {
            if (str.charAt(begin + matched) == str.charAt(matched)) {
                matched++;
                pi.set(begin + matched - 1, matched);
            } else {
                if (matched == 0)
                    begin++;
                else {
                    begin += matched - pi.get(matched - 1);
                    matched = pi.get(matched - 1);

                }
            }


        }
        return pi;

    }
}

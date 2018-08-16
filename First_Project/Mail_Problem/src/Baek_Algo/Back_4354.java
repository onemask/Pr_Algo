package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Objects;
import java.util.Vector;

public class Back_4354 {
    static private String str = " ";
    static public int size = 0;
    static public int[] answer = new int[10000000];


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (!str.equals(".")) {
            str = br.readLine();
            size++;

            for (int i = 0; i < size; i++) {
                answer[i] = solution(str);
            }

//        for (int i=0;i<size;i++){
//            System.out.println(answer[i]);
//        }
            break;
        }
    }


    private static int solution(String s) {

        String array[] = new String[s.length()];
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            array[i] = s.substring(0, i + 1);
        }
        return 0;
    }
}

//        for(int i=0;i<s.length();i++){
//            if(!Objects.equals(array[i], array[i + 1]))
//                cnt ++;
//
//            }
//
//
//
//        }


        //System.out.print(array);


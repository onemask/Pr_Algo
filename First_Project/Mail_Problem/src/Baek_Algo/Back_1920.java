package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Back_1920 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] from = new int[size];
        int idx = 0;

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        while (idx < size) {
            from[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }

        Arrays.sort(from);

        //---------------------------------------

        int target_size = Integer.parseInt(br.readLine());
        int[] target = new int[target_size];
        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");

        for (int i = 0; i < target_size; i++) {
            target[i] = Integer.parseInt(st2.nextToken());
        }


        //--------------------------------------------B-search

        for (int i = 0; i < target_size; i++) {
            int flag = 0;               //false

            int max = size;
            int min = -1;
            int middle;

            while (max - min > 1) {
                middle = (min + max)/2;

                if (target[i] == from[middle]) {
                    flag = 1;           //true
                    break;
                }
                if (target[i] > from[middle]) {
                    min = middle;
                } else if(target[i]<from[middle]) {
                    max = middle;
                }

            }

            System.out.println(flag);


        }

    }
}
//
//
//    Input(from);
//        Input(target);
//        print(from);
//        print(target);
//
//    }
//
//
//    private static void Input(int[] arr) throws IOException {
//
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int size=Integer.parseInt(br.readLine());
//    int idx=0;
//
//    String str= br.readLine();
//    StringTokenizer st = new StringTokenizer(str);
//
//        while(idx<size){
//         arr[idx]=Integer.parseInt(st.nextToken());
//         idx++;
//        }
//
//    }
//
//    private static void print(int[] array) {
//        for (int i=0;i<array.length;i++){
//            if(array[i]!=0)
//                System.out.print(" " +array[i]);
//        }
//
//    }
//
//}

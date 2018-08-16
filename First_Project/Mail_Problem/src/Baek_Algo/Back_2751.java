package Baek_Algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Back_2751 {

    private  static int[] array;
    private  static int number ;

    public static void heap(int [] array,int number){
        for(int i=1;i<number;i++){
            int child = i;
            while(child >0){
                int parent = ( child-1)/2;
                if(array[child] > array[parent]){
                    int temp = array[parent];

                }
            }
        }

    }



    public static void main(String[] args){


    }
}

//참고 링크 : http://cwondev.tistory.com/15

package Baek_Algo;

import java.util.Scanner;

public class Back_2750 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        int[] array = new int[caseNum];

        for (int i=0;i<caseNum;i++)
            array[i]=sc.nextInt();

        //solution(array);
        buble_sort(array);

        for (int i=0;i<array.length;i++)
            System.out.println(array[i]);

    }

    private static void solution(int[] array) {

        for (int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }

    }



    private static void buble_sort(int[] array){
        for (int i=array.length-1;i>0;i--){
           //0~array.length-1 만큼 반복
            for(int j=0;j<i;j++){
                if(array[j]>array[j+1]){
                    int temp= array[j];
                    array[j]= array[j+1];
                    array[j+1] = temp;
                }
            }

        }

    }
}
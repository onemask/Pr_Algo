package Another_Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Mail_PR8 {
    /*
    *
    *  정수로 된 배열을 입력했을때 두번째로 큰 숫자를 출력하시오.
    *
    */

    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("input the array size : ");

       //  int size = sc.nextInt();
       // int array[] = new int[size];
       // for (int i=0;i<size;i++)
       //     array[i]=sc.nextInt();


        int array2[] = {5,4,3,2,1};
        secondLargest(array2);
       // solution(array);

    }

    private static void solution(int[] array) {

       for(int j=1;j<array.length-1;j++){
        for (int i=j;i<array.length-1;i++){  //542
              if(array[i]>array[i+1]){  // 452
                  int num = array[i];  //5
                  array[i]=array[i+1]; // 422
                  array[i+1]=num;      //425
                 }
                }
       }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }

    private static void secondLargest(int[] arr){

        int first,second;

        if (arr.length<2){
            System.out.print("두번째로 큰 값은 없습니다.");
            return;
        }

        first = second = Integer.MIN_VALUE;
        for ( int i=0; i<arr.length; i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i]!=first){
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE){
            System.out.print("두번째로 큰 값은 없습니다.");
        }
        else{
            System.out.print(second);
        }


    }





}



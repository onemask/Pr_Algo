package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Back_10815 {


    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr_size = Integer.parseInt(br.readLine());
        int[] arr = new int[arr_size];


        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        for (int i = 0; i < arr_size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //2 ---------------------------------------------
        int target_size = Integer.parseInt(br.readLine());
        int[] target = new int[target_size];

        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");

        for (int i = 0; i < target_size; i++) {
            target[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);


        for (int i=0;i<target_size;i++){
            int max = arr_size;
            int min = -1;
            int flag=  0;

            int middle;


            while(max-min>1){
                middle = (max + min)/2;

                if (target[i]==arr[middle]){
                    flag =1;
                    break;
                }

                if (target[i]>arr[middle]){
                    min = middle;

                }
                else if(target[i]<arr[middle]){
                    max = middle;
                }
            }

            System.out.print(flag+" ");
        }

    }


    private static void print(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print( arr[i]+ " ");
        }
    }



}

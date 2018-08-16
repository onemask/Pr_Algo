package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back_1920_ver2 {
   static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[]args) throws IOException{

        int size = Integer.parseInt(br.readLine());
        int[] array = new int[size];
        String str=br.readLine();

        input_value(array,size,str);

        int t_size= Integer.parseInt(br.readLine());
        int[] target =new int[t_size];
        String str2=br.readLine();

        input_value(target,t_size,str2);

        Arrays.sort(array);
        binary_search(target,array);

    }

    private static void binary_search(int[] target, int[] array) {
       for(int i=0;i<target.length;i++){
        int low =0 , high = array.length;
        int mid;
        int flag =0;

        while(low<high) {
            mid = (low + high) / 2;
            if (target[i] == array[mid]) {
                flag = 1;
                break;
            }
            if (target[i] < array[mid]) {
                high = mid - 1;
            } else if (target[i] > array[mid]) {
                low = mid + 1;
            }
        }
           System.out.println(flag);
       }

       //HashSet
    }

    private static void input_value(int[] array, int size, String str)
    {
        StringTokenizer st = new StringTokenizer(str, " ");
        for(int i=0;i<size;i++){
            array[i]=Integer.parseInt(st.nextToken());
        }
    }

    private static void output_array(int[] array)
    {   for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");

    }

}

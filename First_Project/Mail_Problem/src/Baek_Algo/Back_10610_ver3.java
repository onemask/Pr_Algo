package Baek_Algo;

import java.util.Arrays;
import java.util.Scanner;

public class Back_10610_ver3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] marco = new int[100000];

        int num = sc.nextInt();



        int len = (int) (Math.log10(num) + 1);
        int array[] = new int[len];
        int sum = 0;
        StringBuffer rlt = new StringBuffer();

        while (num != 0) {
            for (int i = 0; i < len; i++) {
                array[i] = num % 10;
                num /= 10;
            }
        }

        Arrays.sort(array);

        for (int i = len - 1; i >= 0; i--) {
            rlt.append(array[i]);
            sum += array[i];
        }


        if ((array[0] != 0) || sum % 3 != 0) {
            System.out.print(-1);
        } else
            for (int i = len - 1; i >= 0; i--) {
                System.out.print(array[i]);
            }

    }
}






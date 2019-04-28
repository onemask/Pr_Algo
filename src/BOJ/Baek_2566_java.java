package BOJ;

import java.util.Scanner;

public class Baek_2566_java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max = 0;

        int[][] array = new int[9][9];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
                max = Math.max(max, array[i][j]);
            }
        }

        System.out.println(max);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == max) {
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }


    }
}

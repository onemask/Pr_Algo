package Baek_Algo;

import java.io.IOException;
import java.util.*;

public class Baek_1946 {
    static int test_num;
    static int[][] recruit = new int[100001][2];

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        test_num = sc.nextInt();
        ArrayList<Integer> answer = new ArrayList<>();

        //input & check recruit
        while (test_num-- != 0) {

            //input num
            int recurit_num = sc.nextInt();
            recruit = new int[recurit_num][2];

            for (int i = 0; i < recurit_num; i++) {
                recruit[i][0] = sc.nextInt();
                recruit[i][1] = sc.nextInt();
            }


            //서류 점수에 따라 오름차순 정렬.
            Arrays.sort(recruit, new Comparator<int[]>() {
                @Override
                public int compare(int o1[], int o2[]) {
                    int num1 = o1[0];
                    int num2 = o2[0];
                    return Integer.compare(num1,num2);
                }
            });


            int top = recruit[0][1];
            int check = 1;

            for (int i = 0; i < recurit_num; i++) {
                if (recruit[i][1] < top) {
                    top = recruit[i][1];
                    check++;
                }
            }
            answer.add(check);

        }

        //print answer
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i)+" ");
        }


    }
}
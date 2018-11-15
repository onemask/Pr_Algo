package Another_Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class STUnitas {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int test_num = sc.nextInt();
        ArrayList<Integer> answer = new ArrayList<>();

        while(test_num--!=0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Double chocolate = Math.pow(a, b);

            if(chocolate>Integer.MAX_VALUE){
                int big_answer = a;
                while (b--!=1){
                    big_answer = (big_answer*a)%10;
                }
                answer.add(big_answer);
            }
             else
                answer.add((int) (chocolate % 10));

        }

        for(int i=0;i<answer.size();i++){
            System.out.println(answer.get(i));
        }
    }
}

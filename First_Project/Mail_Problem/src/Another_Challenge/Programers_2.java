package Another_Challenge;

import java.util.Scanner;

public class Programers_2 {

    static int input_num =3;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc. nextInt();
        int max_arr[] = new int[num];
        int init_arr[] = new int[num];
        int count = 0 ;

            //input max arr
            for(int i=0;i<num;i++){
                max_arr[i] = sc.nextInt();
            }

            //input init arr
            for(int i=0;i<num;i++){
                init_arr[i]=sc.nextInt();
            }


        count = sc.nextInt();

        while(count!=0 ) {
            int idx = num-1;
                for (int j = 1; j <= 9; j++) {
                    init_arr[idx]++;
                    count--;
                    if (init_arr[idx] == 0) {
                        init_arr[idx-1]=+1;
                        num--;
                        break;
                    }
                }
            }


        System.out.println(init_arr.toString());

    }


}


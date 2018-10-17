package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Line1 {

    static int[] arr;

    public static void main(String... args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = 0;
        int fee = 20000;

        int cnt = 0;
        //input fee
        while (st.hasMoreTokens())  {
            int distance = Integer.parseInt(st.nextToken(" "));
            int std = 720;

            if (4 < distance && distance <= 40) {
                fee = fee - std;
            }

            if (distance > 40) {
                while (distance > 40) {
                    std = std + 80;
                    distance = distance - 8;
                }
                fee = fee - std;

            if( fee < std){
                break;
            }

            }


        }



        System.out.println(fee);
    }




}


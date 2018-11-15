package Baek_Algo;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Baek_1764 {

    static String[] no_hear_see;
    public static void main(String[] args) throws IOException{

        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer =0;


        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<=n+m;i++){
            String str =sc.nextLine();
            if(!map.containsKey(str)) {
                map.put(str, 0);
            }
            else{//없는 애.
                answer++;
                int value =map.get(str);
                map.put(str,++value);
            }
        }

        no_hear_see= new String[answer];
        int idx =0 ;
        for(String str : map.keySet()){
            if(map.get(str)!=0) {
                no_hear_see[idx] = str;
                idx++;
            }
        }

        System.out.println(answer);
        Arrays.sort(no_hear_see);
        for(int i=0;i<answer;i++){
            System.out.println(no_hear_see[i]);
        }

    }
}

package Another_Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Programers_1 {
    static String[] str_arr = new String[100000];
    static int[] int_arr = new int[10000];

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        String end = "END";
        int idx = 0;

        ArrayList<Integer> int_answer = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();
        ArrayList<Character> char_arr = new ArrayList<Character>();
        int num2 =0;

        while(!str.contains("END")) {
            str = br.readLine();
            answer.add(str);
            String temp = "";
            for(int i=0;i<str.length();i++) {
                //48~57아스키 코드 0~9
                if (48 <= str.charAt(i) && str.charAt(i) <= 57) {
                    temp += str.charAt(i);
                }
            }
            str_arr[idx] = temp;
            //System.out.println(temp);
            try {
                int_answer.add(Integer.parseInt(temp));

            }catch (NumberFormatException e){
                System.out.print("");
            }
            //int_answer.add(Integer.parseInt(temp));
            idx++;
        }


        while(!int_answer.isEmpty()) {
            int j =0;
            int min = int_answer.get(0);
            for (int i = 0; i < int_answer.size(); i++) {
                if (min > int_answer.get(i)) {
                    min = int_answer.get(i);
                    j = i;
                }
            }
            System.out.println(answer.get(j));
            int_answer.remove(j);
        }

        }



    }
             





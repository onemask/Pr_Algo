package Coding_Camp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class KaKao_1 {
    static String[] record = new String[100000];

    public static void main(String[] args) throws IOException{


        String str = "\"Enter uid1234 Muzi\", \"Enter uid4567 Prodo\",\"Leave uid1234\",\"Enter uid1234 Prodo\",\"Change uid4567 Ryan\"]";
        int input_num = 1 ;

        for( int i=0;i<str.length();i++){
            if(str.charAt(i)==','){
                input_num++;
            }
        }

        for(int i=0;i<input_num;i++){
            if(str.charAt(i)==','){
                str.substring(0,i+1);
                System.out.println(str);
            }
        }


        //solution(str);

    }

    private static void solution(String[] record) {
        HashMap<String,String> map = new HashMap<>();
        //String[] trim_strs = new int[]
        List<String> answer = new ArrayList<>();

        for(int i=0;i<record.length;i++){


        }

    }
}

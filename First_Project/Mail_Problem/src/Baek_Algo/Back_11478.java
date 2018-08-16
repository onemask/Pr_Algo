package Baek_Algo;

import java.util.*;

public class Back_11478 {
    static int idx = 0;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] suffix = new String[str.length()];

        //입력 데이터 접미사 배열 만들기.
        for (int i=(suffix.length);i>0;i--){
            suffix[idx++]=str.substring(0,i);
        }

        for(String data : suffix){
            System.out.println(data);
        }

        //접미사 배열 정렬하기.
        Arrays.sort(suffix);

        for(String data : suffix){
            System.out.println(data);
        }

        Map<Integer,String> sa = new HashMap<Integer,String>();

        for (int i=0;i<suffix.length;i++){
            sa.put(i+1,suffix[i]);
        }

        Iterator<String> iterator = sa.values().iterator();
      //  print(sa);

    }

    static public void print(Map<Integer,String> map){
       for (int i=1;i<map.size();i++){
           System.out.println(map.get(i));
       }


    }
}

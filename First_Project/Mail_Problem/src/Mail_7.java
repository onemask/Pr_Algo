import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/***
 *
 *  예제) 주어진 string 거꾸로 하기.
 *  Input: “abc 123 apple”
 *  Output: “cba 321 elppa
 *
 ***/


public class Mail_7 {
    public static void main(String[] args) {

       // solution_second("김수한무거북이우와두루미삼척박차동박자");
        solution_third("배가고프다집에가자");
    }


    private static char[] solution_second(String s) {
        int idx = s.length()-1;                         //s = "김수연 " idx = 2
        char[] answer = new char[s.length()];           //char [3] answer = [][][]


        for (int i=0;i<s.length();i++){                 //for (int i=0;i<s.length();i++)
            answer[i]=s.charAt(idx);
            System.out.print(answer[i]);
            idx--;
        }
        return answer;

    }

    private static void solution_third(String s) {

        int idx = s.length()-1;

        while(idx>=0){
            System.out.print(s.charAt(idx));
            idx--;

        }

    }




    private static void solution(String str) {
        char array[] = new char[str.length()];  //
        for (int i = 0; i < str.length(); i++) {        //
            array[i] = str.charAt(str.length() - (i + 1));//
            //System.out.print(array[i]);           //array[4]=a
        }
        System.out.println(array);

    }

//    //Answer of mail
//    public String reserveString(String s) {
//        String words[] = split(s);
//
//
//    }
////
//    private String[] split(String s) {
//        ArrayList<String> words = new ArrayList<>();
//        words.add(0,50);
//        words.add("5");
//        //generic ? 미리 정의되어 사용하는건.
//        //Iterator 라는 객체를 구현해서
//
//        Iterator it = words.iterator();
//        while(it.hasNext())
//        {
//            reserveString() value = it.next();
//        }
//
//        for(String value :words){
//
//        }
//    }

}


//package Baek_Algo;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Baek_1759 {
//
//    static int passnum;
//    static int wordnum;
//    static char[] word;
//    static boolean[] visit;
//    static StringBuilder sb= new StringBuilder();
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        passnum = sc.nextInt();
//        wordnum = sc.nextInt();
//
//        word = new char[wordnum];
//
//        for (int i = 0; i < wordnum; i++) {
//            word[i] = sc.next().charAt(0);
//        }
//        Arrays.sort(word);
//
//
//        for (int i = 0; i <=wordnum - passnum; i++) {
//            visit = new boolean[26];
//            password(i, 1, "" + word[i]);
//        }
//        System.out.println(sb.toString());
//    }
//
//
//
//    static void password(int start,int depth,String s) {
//
//        int idx = word[start] - 'a';
//        visit[idx] = true;
//
//        if (depth == passnum) {
//            if ()) {
//                sb.append(s + "\n");
//            }
//        } else {
//            for (int j = start+1;j<wordnum;j++)
//            {
//                if (!visit[word[j]-'a']) {
//                    password(j, depth + 1, s + word[j]);
//                }
//            }
//        }
//       visit[idx]=false;
//
//    }
//
//    public  static boolean isSatisfy(){
//
//     int consonant =0; //자
//     int vowel     =0;     //모음
//
//     //자음 모음 찾기.
//     for(int i=0;i<wordnum;i++){
//         if(word[i]=='a' && word[i]=='e' && word[i]=='i'&&word[i]=='o' && word[i]=='u'){
//             ++vowel;
//             continue;
//         }
//         if(visit[i]){
//             ++consonant;
//
//         }
//     }
//
//     if(vowel > 0 && consonant >1){
//         return true;
//     }
//
//     return  false;
//
//    }
//
//
//}

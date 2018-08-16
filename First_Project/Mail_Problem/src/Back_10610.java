//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//
//public class Back_10610 {
//    public static void main(String[] args) throws IOException{
//
//        Scanner sc =new Scanner(System.in);
//        int num = sc.nextInt();
//        int len =(int)(Math.log10(num)+1);
//        int ten = 10^(len-1);
//        int rlt = 0;
//        System.out.println(len);
//
//
//
//        int[] array = new int[len];
//
//        for(int i=0;i<len;i++){
//            num=num/10;
//            array[i]=num/10;
//            num=num%10;
//
//            if(num==0){
//              array[len-1]=num;
//              break;
//            }
//        }
//
//
//        while(num%30==0){
//            num
//
//        }
//        rlt+=num;
//        System.out.print(rlt);
//
//
//        for(int i=0;i<len;i++)
//        System.out.print(array[i]);
//
////        while(num >=30){
////            if(num%=30 ) //30/10 = 3
////
////            if(num%10!=0){
////
////            }
////
////
//
//
//
//        }
////        rlt += num/10;
////        rlt += num%10;
//
//       // System.out.println(rlt);
//
////        if (num%30!=0){
////            System.out.println("-1");
////
////        }
//
//
//
//
//    }

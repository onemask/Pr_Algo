//import java.io.*;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Back_10610_ver2 {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        int num = Integer.parseInt(str);
//        int n, sum = 0;
//        int len = str.length();
//
//        int array[] = new int[10];
//
//        StringBuffer rlt = new StringBuffer();
//
//        for (int i = 0; i < len; i++) {
//            array[i] = num % 10;
//            num /= 10;
//
//        }
//
//        Arrays.sort(array);
//
//        if ((array[0] != 0) || sum % 3 != 0) {
//            System.out.print(-1);
//
//        }
//
//        for (int i = 0; i >= 0; i--) {
//            for (int j = 0; j < array[i]; j++)
//                System.out.print(array[i]);
//        }
//
//    }
//}
//
//
//
//
//

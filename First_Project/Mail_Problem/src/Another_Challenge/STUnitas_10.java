//package Another_Challenge;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.StringTokenizer;
//
//public class STUnitas_10 {
//
//    static StringTokenizer st;
//
//    public static void main(String [] args) throws IOException{
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int test_num = Integer.parseInt(br.readLine());
//        ArrayList<Integer> answer = new ArrayList<>();
//
//        while(test_num--!=0) {
//            String[] Info_coffe = br.readLine().split("");
//            int coffe_num = Integer.parseInt(Info_coffe[0]);
//            int budget = Integer.parseInt(Info_coffe[1]);
//            int[] coffe_kind = new int[coffe_num];
//            int[] coffe_price = new int[coffe_num];
//
//            //input coffe종류
//            st =new StringTokenizer(br.readLine());
//            for(int i=0;i<coffe_num;i++){
//                coffe_kind[i]=Integer.parseInt(st.nextToken());
//            }
//
//            //input coffe 금액.
//            st =new StringTokenizer(br.readLine());
//            for(int i=0;i<coffe_num;i++){
//                coffe_price[i]=Integer.parseInt(st.nextToken());
//            }
//
//            solution(coffe_kind,coffe_price,budget);
//        }
//
//        }
//
//    private static void solution(int[] coffe_kind, int[] coffe_price ,int budget) {
//        int A,B,C,D,E;
//
//        if(coffe_price[0]*A + coffe_price[1]*B + coffe_price[2]*C +coffe_price[3]*D + coffe_price[4]*E==budget){
//
//
//        }
//
//
//    }
//
//
//}
//
//
//

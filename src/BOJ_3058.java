import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_3058 {

    public static void main(String[] args)throws IOException {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<List<Integer>> solution = new ArrayList<>();


        while (num--!= 0) {
            //String[] str = br.readLine().split(" ");
            String str = br.readLine();
            System.out.println(str);
//
//            for (int i =0;i<str.length;i++) {
//                System.out.println(str[i]);
//            }
//
//            ArrayList<Integer> list  = new ArrayList<Integer>();
//            int evenNum = 0;
//            int evenTotal = 0;
//            for(int i=0;i<str.length;i++){
//                list.add(Integer.parseInt(str[i]));
//            }
//            for(int i=0;i<list.size();i++){
//                if(list.get(i)%2==0){
//                    evenNum ++;
//                    evenTotal+=list.get(i);
//                }
//            }
//
//            list.add(evenNum);
//            list.add(evenTotal);
//            solution.add(list.subList(list.size()-2,list.size()-1));
//        }

            for (int i = 0; i < solution.size(); i++) {
                System.out.println(solution.get(i));
            }
        }
    }
}

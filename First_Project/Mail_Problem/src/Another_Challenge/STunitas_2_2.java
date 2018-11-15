package Another_Challenge;

import java.util.*;

public class STunitas_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int std_num = sc.nextInt();

        //input std_number
        int[] check = new int[std_num + 1];
        for(int i=1;i<=std_num;i++){
            check[i]=sc.nextInt();
        }

        ArrayList<Integer> std= new ArrayList<Integer>();

        for(int i=1;i<=std_num;i++) {
            std.add(std.size() - check[i],i);
        }

        for(int i=0;i<std.size();i++){
            System.out.print(std.get(i)+" ");
        }
    }
}



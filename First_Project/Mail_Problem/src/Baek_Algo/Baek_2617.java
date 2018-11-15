package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Baek_2617 {

    static int n,m;
    static boolean[] h_check,l_check;
    static ArrayList<ArrayList<Integer>> h_ball,l_ball;
    static boolean[][] answer ;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] marble_num = br.readLine().split(" ");
        n = Integer.parseInt(marble_num[0]);
        m = Integer.parseInt(marble_num[1]);
        h_check = new boolean[n+1]; l_check= new boolean[n+1];
        h_ball = new ArrayList<>(); l_ball = new ArrayList<>();
        answer = new boolean[n+1][2];

        //구슬의 개수 n만큼 arraList 생성.
        for(int i=0;i<n+1;i++){
            h_ball.add(new ArrayList<>());
            l_ball.add(new ArrayList<>());
        }


        //구슬 무게 input
        while (m--!=0){
            String[] line = br.readLine().split(" ");
            h_ball.get(Integer.parseInt(line[0])).add(Integer.parseInt(line[1]));
            l_ball.get(Integer.parseInt(line[1])).add(Integer.parseInt(line[0]));
        }

        for(int i=1;i<=n;i++){
            Arrays.fill(h_check,false);
            Arrays.fill(l_check,false);
            h_check[i]=true; l_check[i]=true;

            //중간 될 수 없어.
            if(Heavy_Dfs(i)> (n+1)/2) {
                System.out.println(i +": " +Heavy_Dfs(i));
                answer[i][0] = true;
            }

            if(Light_Dfs(i) >(n+1)/2) {
                System.out.println(i +": " +Light_Dfs(i));
                answer[i][1] = true;
            }
        }

        int cnt=0;

        //print answer
        for(int i=1;i<=n;i++) {
            System.out.print(answer[i][0]);
            System.out.print(" "+answer[i][1]+"\n");
        }

        for(int i=1;i<=n;i++)
            if(answer[i][0] || answer[i][1])
                cnt++;

        System.out.println(cnt);

    }

    private static int Light_Dfs(int node) {
        int result =1;
        for(int i=0;i<l_ball.get(node).size();i++){
            if(!l_check[l_ball.get(node).get(i)]){
                l_check[l_ball.get(node).get(i)]=true;
                result +=Light_Dfs(l_ball.get(node).get(i));
            }
        }
        return result;
    }

    private static int Heavy_Dfs(int node) {
        int result =1;
        for(int i=0;i<h_ball.get(node).size();i++){
            if(!h_check[h_ball.get(node).get(i)]){
                h_check[h_ball.get(node).get(i)]=true;
                result +=Light_Dfs(h_ball.get(node).get(i));
            }
        }
        return result;
    }


}

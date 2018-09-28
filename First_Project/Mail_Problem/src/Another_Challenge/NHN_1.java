package Another_Challenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NHN_1 {
    static Queue<Integer> pocket = new LinkedList<>();
    static ArrayList<Integer> check = new ArrayList<>();
    static LinkedList<Integer> answer = new LinkedList<>();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //input pocket
        while(st.hasMoreElements()){
            int e = Integer.parseInt(st.nextToken(" "));
            pocket.offer(e);
            check.add(e);

            //pop pocket
            if(pocket.size()>3){
                //처음 들어 온 item -> 가장 오래된 item 삭제.
                if(check(e)<1){
                    answer.add(pocket.poll());
                }

                //방문 한 적이 있는 item -> 현재 pocket에 있는지 비교.
                if(check(e)>=1){
                    if(pocket.peek()!=e ) {
                        answer.add(pocket.poll());
                    }
                    else {
                        pocket.poll();
                    }
                }
            }
        }
        print_answer();


    }

    //방문한 횟수 알아보는 함수.
    private static int check(int m){
        int cnt = 0;
        for(int i=0;i<check.size()-1;i++){
           if(check.get(i)==m){
               cnt++;
           }
        }
        return cnt;
    }

    //출력 함수.
       private static void print_answer(){
        if(answer.isEmpty()){
            System.out.println(0);
        }

        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }
}

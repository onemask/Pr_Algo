package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

 class MY_Printer{
    int idx;
    int priority;
    MY_Printer(int idx,int priority){
        this.idx = idx;
        this.priority = priority;
    }
}


public class Back_1966_my {


    static Queue<MY_Printer> q = new LinkedList<>();
    static LinkedList<Integer> list = new LinkedList<>();
    static LinkedList<Integer> answer = new LinkedList<>();

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testnum = Integer.parseInt(br.readLine());
        StringTokenizer st ;

        //input q
        while(testnum--!=0) {
            q.clear();
            list.clear();

            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int idx = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < num; i++) {
                int priority = Integer.parseInt(st.nextToken());
                q.add(new MY_Printer(i, priority));
                list.add(priority);
            }


            int count = 1;

            while (!q.isEmpty()) {
                int max = getMax();
                MY_Printer mp = q.poll();

                if (mp.priority == max) {
                    if (mp.idx == idx) {
                        break;
                    }

                    count++;
                    list.remove(list.indexOf(max));
                    continue;
                }
                q.offer(mp);
            }

            answer.add(count);

        }
        Print();

    }

    static public int getMax(){
        int max =0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    }

    static public void Print(){
        for(int i=0;i<answer.size();i++){
            System.out.println(answer.get(i));
        }
    }

}


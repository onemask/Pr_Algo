package Baek_Algo;

import java.util.*;

    class Printer{
        int idx,priority;
        Printer(int idx,int priority){
            this.idx = idx;
            this.priority=priority;
        }
    }


public class Baek_1966 {

    static LinkedList<Integer> list = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    static Queue answer = new LinkedList();

    public static void main(String[] args) {

        Queue<Printer> q = new LinkedList<>();
        int testnum = sc.nextInt();

        while (testnum-- != 0) {
            q.clear();
            list.clear();

            int n = sc.nextInt();
            int m = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int priority = sc.nextInt();
                q.add(new Printer(i, priority));
                list.add(priority);
            }

            int count =1;
            while(!q.isEmpty()){
                int max = getMax();
                Printer p = q.poll();

                //q의 max값 찾기.
                if(p.priority==max){
                  if(p.idx==m){
                      //System.out.println(count);
                      break;
                  }
                  count++;
                  list.remove(list.indexOf(max));
                  continue;
                }
                q.offer(p);
            }
            answer.add(count);
        }

        while(!answer.isEmpty()){
            System.out.println(answer.poll());
        }



    }

    public static int getMax(){
        int max =0;
        for (int i=0;i<list.size();i++){
            if(list.get(i)>max)
                max = list.get(i);
        }
        return max;
    }
}


//
//    public static int findidx(int priority){
//        int idx = 0;
//        for (int i=0;i<list.size();i++){
//
//        }
//    }

package Another_Challenge;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Programmers_heap
{
    static int a,b;

    public static int solution(int[] scoviLle, int K){
        int answer=0;
        int sum =0 ;
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(scoviLle.length);

        //sort q.
        for( int i=0;i<scoviLle.length;i++){
            q.offer(scoviLle[i]);
        }

        while(q.size()>1){
            if(q.peek()>=K)
                break;

            a = q.poll();
            b = q.poll();
            sum = a + (b*2);
            answer++;
            q.add(sum);

        }

        if(q.peek()>=K){
            return answer;
        }

        else
            return answer = -1;

    }


    public static void main(String[] args)
    {
        int[] hot = {1, 2};

        System.out.println(solution(hot,3));

    }
}

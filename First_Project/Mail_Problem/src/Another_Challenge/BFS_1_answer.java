package Another_Challenge;

import java.util.ArrayList;

public class BFS_1_answer {
    private static int[] soution_r(int[] answer){
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        int[] score = new int[3];

        for(int i=0;i<answer.length;i++){
            if(answer[i]==a[i%a.length]){
                score[0]++;
                System.out.println("a의 값. "+i%a.length);

            }
            if(answer[i]==b[i%b.length]) { //여기에서 bidx 반복 알고 싶음.
                score[1]++;
                System.out.println(b[i%b.length]);
            }
            if(answer[i]==c[i%c.length]) {
                score[2]++;
                System.out.println("c의 값. "+i%b.length);
            }
        }

        //3가지 int 크기 비교하는 것.
        int maxScore = Math.max(score[0],Math.max(score[1],score[2]));

        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore==score[0]) list.add(1);
        if (maxScore==score[1]) list.add(2);
        if(maxScore==score[2]) list.add(3);

        return list.stream().mapToInt(i->i.intValue()).toArray();
        //return list.toString();

    }

    public static void main(String[] args){
        int[] answer = {1,3,2,4,2};

        System.out.println(soution_r(answer));
    }


}

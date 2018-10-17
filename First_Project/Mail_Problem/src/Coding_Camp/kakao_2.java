package Coding_Camp;

import java.util.*;

public class kakao_2 {


    public static void main(String[] args) {

        int[] arr = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(5, arr)));

    }

    public static int[] solution(int N, int[] stages) {

        int[] answer = new int[N];
        Map<Integer, Double> map = new HashMap<>();
        int player;
        int not_completed;


        //input map
        for (int i = 1; i <= N; i++) {
            player = 0;
            not_completed = 0;
            for (int j = 0; j < stages.length; j++) {
                if (i <= stages[j]) {
                    player++;
                }
                if (i == stages[j]) {
                    not_completed++;
                }
            }
            //실패율과 idx 구하기
            double value = ((double)(not_completed))/player;
            map.put(i,value);
        }

        //map 출력.
        for (Integer key : map.keySet()) {
            double value = map.get(key);
            System.out.println(key + " :" + value);
        }

        for (int i = 0; i < N; i++) {
            double max = -1;
            int maxkey = 0;
            for (Integer key : map.keySet()) {
                if (max < map.get(key)) {
                    max = map.get(key);
                    maxkey = key;
                }
            }
            answer[i] = maxkey;
            map.remove(maxkey);
        }

        return answer;

    }

}


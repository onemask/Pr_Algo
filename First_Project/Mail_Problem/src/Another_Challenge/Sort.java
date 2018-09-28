package Another_Challenge;

import java.util.Arrays;
import java.util.LinkedList;

import static Baek_Algo.Back_4354.answer;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        String str = array.toString();
        int[] answer = new int[commands.length];

        for (int i=0;i<commands.length;i++){
            for(int j=0;j<commands[i].length;i+=3){
                int front = commands[i][j];
                int back = commands[i][j+1];
                int num = commands[i][j+2];
                str.substring(front-1,back);
                //Arrays.sort(str.); 정렬 어케 할까.
                answer[i]=str.charAt(num);
            }
        }
        return answer;
    }
}
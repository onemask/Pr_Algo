package Another_Challenge;

import java.util.HashMap;
import java.util.Vector;

public class Netmarble_1 {
    static HashMap<Integer, String> p = new HashMap<Integer, String>();

    public static void main(String[] args) {

        String[] p = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] c = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(p, c));
    }

    private static String solution(String[] participant, String[] completion) {
        String answer = "";
        int size = participant.length;
        boolean[] check = new boolean[participant.length];

        //hash에 입력하기.
        for (int i = 0; i<size; i++) {
            String str = participant[i];
            p.put(i, str);
        }

        for(int i=0;i<completion.length;i++) {
            for(int j=0;j<p.size();j++) {
                if ((completion[i])==p.get(j)) {
                    check[j] = true;
                    break;
                }
            }
        }

        for(int i=0;i<check.length;i++){
            if(!check[i]){
                answer = p.get(i);
            }
        }

        return answer;

    }
}





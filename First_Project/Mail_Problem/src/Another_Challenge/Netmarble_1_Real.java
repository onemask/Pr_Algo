package Another_Challenge;

import java.util.Arrays;
import java.util.HashMap;

public class Netmarble_1_Real {

    public static void main(String[] args) {

        String[] string = {"may", "with", "may", "you", "you"};
        System.out.println(Arrays.toString(solution(string)));
    }

    public static long[] solution(String[] words) {

        HashMap<Integer, String> hash = new HashMap<>();
        long[] answer = new long[words.length];

        //word에 집어 넣기.
        for (int i = 0; i < words.length; i++) {
           String str = words[i];
           hash.put(i,str);
        }

        //System.out.println(hash.values());

        //answer에 집어넣기.
        int idx=0;
        while(idx<answer.length) {
            for (int i = 0; i < hash.size(); i++) {
                if (hash.get(i).equals(words[idx])) {
                    answer[idx] = i + 1;
                    break;
                }
            }
            idx++;
        }


//            for(int key:hash.keySet()){
//                if(words[idx] == hash.get(key)){
//                    answer[idx]=key+1;
//                }
//                break;
//            }
//            idx++;

        //}

//        for(int i=0;i<answer.length;i++) {
//            for (int key : hash.keySet()) {
//                if(words[i]==hash.get(key)) {
//                    answer[i] = key+1;
//                    break;
//                }
//            }
//        }

        return answer;


    }
}


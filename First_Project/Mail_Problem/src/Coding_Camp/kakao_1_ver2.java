package Coding_Camp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class kakao_1_ver2 {

    static String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(record)));
    }

    private static String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        String[] rcd_pieces;
        List<String> temp = new ArrayList<>();
        String[] answer = new String[temp.size()];

        //최종 갱신 key,value 찾기.
        for (int i = 0; i < record.length; i++) {
            rcd_pieces = record[i].split(" ");
            //System.out.println(Arrays.toString(rcd_pieces));

            if (rcd_pieces[0].contains("Enter")) {
                map.put(rcd_pieces[1], rcd_pieces[2]);
            }

            else if (rcd_pieces[0].contains("Change")) {
                map.put(rcd_pieces[1], rcd_pieces[2]);
            }
        }


        //out put map
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }


        //output  - change는 출력하지 않는다.
        for (int i = 0; i < record.length; i++) {
            rcd_pieces = record[i].split(" ");

            if (!rcd_pieces[0].contains("Change")) {
                if (rcd_pieces[0].contains("Enter"))
                    temp.add(map.get(rcd_pieces[1]) + "님이 들어왔습니다.");

                else if (rcd_pieces[0].contains("Leave"))
                    temp.add(map.get(rcd_pieces[1]) + "님이 나갔습니다.");

            }
        }
            return temp.toArray(answer);

        }
    }



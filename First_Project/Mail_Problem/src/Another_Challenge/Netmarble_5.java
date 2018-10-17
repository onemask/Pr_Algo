package Another_Challenge;

import java.util.HashMap;

public class Netmarble_5 {
    public static void main(String[] args){

        int[] level = {6, 2, 3, 4, 1, 5};
        System.out.println(solution(level));
    }

    public static int solution(int[] stats) {
        int answer = 0;
        HashMap <Integer,Integer> team = new HashMap<>();
        int team_num =1;
        int min_team=0;
        int[] team_array = new int[1000];

        for(int i=0;i<stats.length;i++) {

            //처음
            if (team.isEmpty()) {
                team.put(team_num, stats[i]);
                team_array[team_num]++;
            }

            //전 상태보다 level 이 작은경우.
            else if (stats[i] < stats[i - 1]) {
                team.put(++team_num, stats[i]);
                team_array[team_num]++;
            }

            //전 상태보다 level이 큰 경우.
            else if(stats[i] >stats[i-1]){
                min_team=min_team(team_array);

                for(int number : team.keySet()){
                    if(team.get(number) < stats[i] && min_team==number){
                        team.put(number,stats[i]);
                        break;
                    }

                }
            }
        }
        answer=team_num;


        return answer;
    }

    public static int min_team(int[] team_array){

        int min =1000000;
        for(int i=0;i<team_array.length;i++){
            if(team_array[i]!=0){
                Math.min(team_array[i],min);
            }
        }
        return min;
    }

}

package Another_Challenge;

public class Netmarble_real_2 {

    public static void main(String[] args){

        System.out.println(solution("happy-birthday",15));
    }

    public static String solution(String phrases, int second) {

        int left = 0 ;
        String sub="";
        if(second<14 ) {
            left = second % 14;
        }
        if(second==14){
            left = 14;
        }

        if(second>14){
            left = second %14;
        }

        String answer ="";
        String plus="_";

        int idx = 0;


        if(second <=14) {
            sub =phrases.substring(0,left);

            while (idx < 14 - left) {
                ++idx;
                answer = answer.concat(plus);
            }
            answer=answer.concat(sub);
        }

        else if (second>=14){
            sub =phrases.substring(left,phrases.length());
            answer= answer.concat(sub);

           for(int i=0;i<=second-14;i++) {
               answer = answer.concat(plus);
           }
        }


        return answer;
    }
}

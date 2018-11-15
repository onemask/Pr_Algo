package Another_Challenge;

public class Fasoo_1 {

    public static void main(String[] args){

        int[] input = {0,0,0,0,1,1,1};
        System.out.println(solution(input));
    }

    public static int solution(int[] fence){

        int answer =0;
        int black = 0 ;
        int white = 1;
        int now = 0 ;

        for (int i=0;i<fence.length;i++){
            if(i==0) {
                now = fence[i];
            }

            else if(now == fence[i]){
                if(now ==0){
                    now = white;
                    answer++;
                }
                else if(now ==1){
                    now = black;
                    answer++;
                }
            }

            else
                now = fence[i];
        }

        return answer;
    }

}

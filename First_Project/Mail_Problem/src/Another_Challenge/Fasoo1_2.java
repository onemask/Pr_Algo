package Another_Challenge;

public class Fasoo1_2 {

    public static void main(String[] args){

        int[] input = {0,0,0,0,1,1,1};
        System.out.println(solution(input));
    }

        public static int solution(int[] fence){
            int answer_b=0,answer_w =0, black = 0, white = 1, now = 0 ;

            //흰색이 먼저 오는 경우.
            now = black;
            for (int i=0;i<fence.length;i++){
                if(now == black) now = white;
                else now = black;

                if(now != fence[i])  answer_b++;
            }

            //검은색이 먼저 오는 경우.
            now =white;
            for (int i=0;i<fence.length;i++){
                if(now == black) now = white;
                else now = black;

                if(now != fence[i])  answer_w++;
            }
            return Math.min(answer_b,answer_w);
        }
    }


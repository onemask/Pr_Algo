package Another_Challenge;

public class Netmarble_4_Real {

    public static void main(String[] args) {

        int[] array = {5, 3, 4, 6, 2, 1};
        solution(array,1);

    }

        public static int solution(int[] estimates, int k) {

            int max = 0;
            int answer = 0;

            for(int i=0;i<estimates.length;i++){
                int four = 0 ;
                if(i+k>estimates.length)
                    break;
                if(i+k<=estimates.length ){
                    for(int j=i;j<i+k;j++){
                        four+=estimates[j];
                    }
                }
                max = Math.max(max,four);
            }

            return answer=max;
        }
    }




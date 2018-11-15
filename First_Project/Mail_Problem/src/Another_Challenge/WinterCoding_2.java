package Another_Challenge;

public class WinterCoding_2 {

    public int solution(int[] cookie) {
        int answer = -1;
        int Max = -1;

        for(int i=0;i<cookie.length-1;i++){

            int l = i;
            int m = i+1;

            int one = cookie[l];
            int two = cookie[m];

            if(one== two){
                Max = Math.max(Max,one);
            }

        }


        return answer;
    }
}

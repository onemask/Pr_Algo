package Coding_Camp;

class Programers {

   static public int solution(int n, int m) {
        int answer = 0;

        for(int i=n;i<=m;i++){
            String str = Integer.toString(i);
            int first= 0;
            int last = str.length()-1;

            if(str.length()<2){
                answer++;
            }

            while(first<last){
                if(str.charAt(first)!=str.charAt(last))
                    break;

                first++;
                last--;
                answer++;

            }
        }
       return answer;

   }

    public static void main(String[] args){
        solution(100,300);

    }

}

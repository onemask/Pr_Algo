import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MAIN {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        int array[]={2,5,6,1,10};
        int target = 8;

        //solution(array,target);
        Mail_solution(array,target);
        //*예외 조건
         /*1. 배열보다 내가 입력한 target 수가 적은 경우 .
           2. 배열의 idx 합 < target이 큰 경우.
          */

    }

    //내가 만든 soulution
    public static void solution(int[] array, int target) {
        for (int i=0; i<array.length; i++){
            int lookfor = target - array[i];
            for (int j=i+1;j<array.length;j++){
                if (lookfor==array[j]){
                    System.out.println("Output"+"["+i+","+j+"]");
                }
            }
        }
    }
    //매일 프로그래밍5 답.
    static void Mail_solution(int[] input, int target){
        Map<Integer,Integer> map = new HashMap<>(); //Map생성.

        for (int i=0;i<input.length;i++) {
            int rest_value = target - input[i];
            if (map.containsKey(rest_value)) {
                System.out.println("Output" + "[" + map.get(rest_value) + "," + i + "]");
            }
            map.put(input[i], i);
        }

            System.out.println(" No answer " );

            // return map.get(rest_value), i;
         }

    }










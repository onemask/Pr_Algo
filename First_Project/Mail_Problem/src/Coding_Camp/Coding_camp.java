package Coding_Camp;

/*
 10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
 1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
 */
import java.util.Scanner;
import java.util.stream.IntStream;

public class Coding_camp {
    static int answer =0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer =  solution3(num);
        System.out.println(answer);
    }
    private static int solution1(int num) {
        answer=0;
        for(int i=1;i<num;i++){
            if(i%3==0 && i%5==0)
                answer+=i;
            else if(i%5==0)
                answer+=i;
            else if(i%3==0)
                answer+=i;
        }
        return answer;
    }

    private static int solution2(int num) {
        answer=0;
        for(int i=1;i<num;i++)
            if(i%3==0 || i%5==0)
                answer+=i;

        return answer;
    }

    private static int solution3(int num){
        return IntStream.range(1,num).filter(answer-> answer%3==0 || answer%5==0).sum();

    }

}


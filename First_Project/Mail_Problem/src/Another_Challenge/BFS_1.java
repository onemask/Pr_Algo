package Another_Challenge;
/*
  1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
  2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
  3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

  1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
  가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

 **제한 조건**
  시험은 최대 10,000 문제로 구성되어있습니다.
  문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
  가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.


  ** 입출력 예 **
   answers	    return
   [1,2,3,4,5]	[1]
   [1,3,2,4,2]	[1,2,3]
입출력 예 설명
 */

    public class BFS_1 {

    static int[] num1= new int[10000];
    static int[] num2 = new int[10000];
    static int[] num3 = new int[10000];

    static int[] arr1 = {1,2,3,4,5};
    static int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
    static int[] arr3 = {3,3,1,1,2,2,4,4,5,5};

    static void solution(int[] answers) {

        int[] answer =new int[3];
        int std1= check(num1,answers);
        int std2= check(num2,answers);
        int std3 =check(num3,answers);
        int first,second,third = 0;




        //first = (std1>std2)&&(std1>std3)?std1:(std3>std2?std3:std2);
        //second = (std2>std1)&&(std3>std1)?std1:(std2>std3?std3:std2);
        //num2이 num1보다 큰지 비교,num3이 num1보다 큰지 비교해서 num1이 제일 작으면 저장 아니면 뒤의 수식 수행
        //second = (std1>std2)?((std1>std3)?((std2>std3)?std2:std3):std1):((std2>std3)?((std1>std3)?std1:std3):std2);
        //

//        for(int i=0;i<answer.length;i++){
//            answer[i]=
//        }

        //return answer;


        System.out.println(" std1: "+std1+" std2: "+std2+ " std3 :" + std3);
        //return answers;
    }

    //input
    static void input(int[] arr ,int[] input,int size) {
       System.arraycopy(input,0,arr,0,size);
        int i=0;
        while(i!=arr.length){
           for(int j=0;j<input.length;j++){
               arr[i]=input[j];
               i++;
           }
        }
    }

    //check
    static int check(int[] arr, int[] answer){
        int cnt =0;
        int i=0;
        while(i!=10000){
            for(int j=0;j<answer.length;j++){
                if(arr[i]==answer[j]){
                    cnt++;
                }
                i++;
            }
        }
        return cnt;


    }


    //pint
    static void print(int[] arr) {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        System.out.println();
    }

    public static void main(String[] args) {


        int[] asnwer = {1,3,2,4,2};


        input(num1,arr1,arr1.length);
        input(num2,arr2,arr2.length);
        input(num3,arr3,arr3.length);

        //print(num1);
        //print(num2);
        //print(num3);


        solution(asnwer);


    }
}

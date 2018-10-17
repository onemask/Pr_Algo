package Another_Challenge;

import java.util.*;

public class NHN_Real_1 {

    static Stack<Integer> sub_card = new Stack<>();
    static Deque<Integer> card = new ArrayDeque<>();
    static Queue<Integer> N_num = new LinkedList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cardnum = sc.nextInt();
        Queue<Integer> N_num = new LinkedList<>();

        for (int i = 1; i <= cardnum; i++) {
            card.add(i);
        }


        //섞을 횟수
        int P = sc.nextInt();
        while (P-- != 0) {
            N_num.add(sc.nextInt());
        }

        //위 아래 고정 카드의 수

            while (!N_num.isEmpty()) {
                int N = N_num.peek();

                ArrayList<Integer> front_card = new ArrayList<>();
                ArrayList<Integer> back_card = new ArrayList<>();
                LinkedList<Integer> link = new LinkedList<>();

                for (int i = 0; i < N; i++) {
                    int back_num = card.pollLast();
                    int front_num = card.pollFirst();
                    back_card.add(back_num);
                    front_card.add(front_num);
                }

                for (int i = 0; i <= N - 1; i++) {
                    int push_back = back_card.get(i);
                    sub_card.add(push_back);
                }

                for (int i = N - 1; i >= 0; i--) {
                    int push_front = front_card.get(i);
                    sub_card.add(push_front);
                }

                if(card.size()<N*2){
                    //print_sub_card();
                    push_sub_card();
                  //  print_card();
                    N_num.poll();

                }

            }


            for (int i = 0; i < 5; i++) {
                System.out.println(card.pollFirst());
            }

        }


    private static void push_sub_card(){
        int size = sub_card.size();

        for(int i=0;i<size;i++){
            int stack_num = sub_card.pop();
            card.addLast(stack_num);
        }

        sub_card.clear();

    }


}

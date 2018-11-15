package Another_Challenge;

import java.util.*;

public class STunitas_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int std_num = sc.nextInt();

        int[] check = new int[std_num + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        //input random_vote
        for (int i = 1; i <= std_num; i++)
            check[i] = sc.nextInt();

        //첫번째 애는 무조건 첫번째.
        Stack<Integer> temp = new Stack<>();

        //ArrayList<int> arrayList;
       // arrayList.add(arrayList.size()-지금뽑은수, i );

        for (int i = 1; i <= std_num; i++) {

            //가장 위에 쌓이는 경우.
            if (check[i] == (i-1))     //i-1 번호를 뽑으면 밑으로 갈 수 있다.
                dq.addFirst(i);

            else {
                while (check[i]-->0)
                    temp.add(dq.pollLast());

                dq.addLast(i);

                while (!temp.isEmpty())
                    dq.addLast(temp.pop());
            }
        }

        //print answer
        while (!dq.isEmpty())
            System.out.print(dq.pollFirst()+" ");
        }



    }




package Another_Challenge;

import java.util.Stack;

public class Fasoo_3_2 {

    public static void main(String[] args){
        int[] input = {3, 5, 6, 8, -1, -1, -1, 1, 7, -1, -1, -1, 4, -1, 2, -1, -1};
        System.out.println(solution(input));

    }

    public static boolean solution(int[] serialization) {
        Stack<Integer> parent_stack = new Stack<>();

        int now_node = serialization[0];
        int is_parent = 0 , i = 1;

        // 길이 1이면 바로 결과 출력
        if(serialization.length == 1)
            if(serialization[0] == -1) return true;
            else return false;

        // 아니면 for문
        for (; i < serialization.length; i++) {
            // 끝 노드이면 종료
            if(i == serialization.length) break;

            // 왼쪽 노드를 확인 하는 애들 /왼쪽 노드 pop /  is_parent : 이전에 부모였었던 애들.
            if(serialization[i] > 0 && is_parent == 0) {
                parent_stack.push(now_node);
                now_node = serialization[i];
                continue;
            }

            // 왼쪽 노드 확인되었으니 오른쪽 노드 확인
            if(is_parent == 0) i++;

            is_parent = 0;

            if(i == serialization.length) break;

            //오른쪽 노드가 자식을 가질 수 있는 경우.
            if(serialization[i] > 0 ) now_node = serialization[i];
            else {
                if(parent_stack.empty()) break;
                now_node = parent_stack.pop();
                is_parent = 1;
            }
        }

        return ((i == serialization.length - 1 ) && parent_stack.empty() ? true : false);
    }
}

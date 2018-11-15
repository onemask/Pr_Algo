//package Another_Challenge;
//
//import java.util.Stack;
//
//public class Lim {
//
//    public static boolean solution(int[] serialization) {
//            Stack<Integer> parent_stack = new Stack<>();
//
//            int now_node = serialization[0];
//            int is_parent = 0, i = 1;
//            // 길이 1이면 바로 결과 출력
//            if (serialization.length == 1)
//                if (serialization[0] == -1) return true;
//                else return false;
//
//            // 아니면 for문
//            for (; i < serialization.length; i++) {
//                // 왼쪽 노드가 존재하고, 이전에 부모가 아니었으면(처음 살피는 노드이면)
//                // 왼쪽 노드를 살펴본다
//                if (serialization[i] > 0 && is_parent == 0) {
//                    parent_stack.push(now_node);
//                    now_node = serialization[i];
//                    continue;
//                }
//
//                // 오른쪽 노드를 살펴본다.
//                // 이전에 부모였던 요소이면, 왼쪽 존재 : 현재 탐색하는 인덱스가 오른쪽 요소이고
//                // 이전에 부모가 아니었으면, 현재 탐색하는 인덱스 + 1 오른쪽 요소이다
//                if (is_parent == 0) i++;
//                is_parent = 0;
//
//                if (i == serialization.length) break;
//
//                if (serialization[i] > 0) now_node = serialization[i];
//                else {
//                    if (parent_stack.empty()) break;
//                    now_node = parent_stack.pop();
//                    is_parent = 1;
//                }
//            }
//
//            return ((i == serialization.length - 1) && parent_stack.empty() ? true : false);
//        }
//    }
//}
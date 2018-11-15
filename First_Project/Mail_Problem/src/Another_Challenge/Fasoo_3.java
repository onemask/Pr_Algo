//package Another_Challenge;
//
//import java.util.Stack;
//
//public class Fasoo_3 {
//
//    public static void main(String[] args){
//        int[] input = {3, 5, 6, 8, -1, -1, -1, 1, 7, -1, -1, -1, 4, -1, 2, -1, -1};
//        solution(input);
//
//    }
//
//
//    public class Node {
//        int data;
//        int left;
//        int right;
//
//        public Node(int data) {
//        this.data = data;
//        }
//        void push_child (int left,int rihgt){
//            this.left = left;
//            this.right = rihgt;
//        }
//    }
//
//    public static boolean solution(int[] serialization) {
//        boolean answer = true;
//        Stack<Node> binary_tree = new Stack<>();
//
//        for(int i=0;i<serialization.length;i++) {
//            Node node = new Node(serialization[i]);
//
//             //root인경우.
//             if(binary_tree.isEmpty()) {
//                binary_tree.push(node);
//             }
//
//             //left push.
//             else if(serialization[i]!=1) {
//                 Node pre_num = binary_tree.peek();
//                 pre_num.left = serialization[i];
//                 binary_tree.push(node);
//             }
//
//             else{
//
//                 Node some_node = binary_tree.peek();
//
//                 //왼쪽 오른쪽 child 다 있는경우.
//                 if(some_node.right!=0 && some_node.left!=0){
//                     binary_tree.pop();
//                 }
//
//                 //input left child
//                 else if(some_node.left==0) {
//                     some_node.left = serialization[i];
//                 }
//
//                 //input right child
//                 else {
//                     some_node.right=serialization[i];
//                 }
//
//             }
//
//
//        }
//
//
//
//
//        return answer;
//    }
//
//}

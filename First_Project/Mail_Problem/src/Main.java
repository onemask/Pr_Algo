import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static Node[] nodes;
    public static boolean delList[];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        nodes = new Node[N];
        delList = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            nodes[i] = new Node();
            int parent = Integer.parseInt(st.nextToken());
            nodes[i].num = i;
            nodes[i].parentNode = parent;
            if(parent != -1) nodes[parent].setChild(i);
        }
        int deleteNode = Integer.parseInt(br.readLine());
        delete(deleteNode);
        System.out.println(getLeaf());
        br.close();
    }

    public static void delete(int n) {
        makeDelList(n); // 먼저 노드 n 삭제
        for(int i=0; i<N; i++) {
            int k = nodes[i].num;
            if(delList[k]) { // 만약 노드 k가 삭제되었다면
                int parent = nodes[k].parentNode;
                nodes[k] = null; // 노드 k를 null로 만들어 주고
                if(parent !=-1 && nodes[parent] !=null) {
                    nodes[parent].childCnt--; // 노드 k의 부모 노드 childCnt를 하나 감소 && 부모 노드의 자식 노드 k 삭제
                    nodes[parent].childNode[k] = false;
                }
            }
        }
    }

    // 삭제할 노드를 delList에 계속해서 추가, 재귀함수(DFS)를 사용함
    public static void makeDelList(int n) {
        delList[n] = true;
        for(int i=0; i<N; i++) {
            if(nodes[n].childNode[i]) makeDelList(i);
        }
    }

    public static int getLeaf() {
        int cnt = 0;
        for(int i=0; i<N; i++) {
            if(nodes[i] !=null && nodes[i].parentNode !=-1 && nodes[i].childCnt ==0) cnt++;
        }
        return cnt;
    }
}


class Node {
    int num,parentNode,childCnt;
    boolean childNode[] = new boolean[50]; // childNode[i]=true이면 이 노드는 i를 자식노드로 가지고 있음
    public void setChild(int childNum) {
        childNode[childNum] = true;
        childCnt++;
    }
}
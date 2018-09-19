import java.util.*;

public class Back_9372_ver2 {

    static int testcase;
    static int nation, airplane;
    static int minCount ;           //출력 값

    static int INF = 10000000;

    static int[] visit = new int[1001];       //방문 ㅇㅋㄷㅋ?
    static int[] cost= new int[1001];
    static int graph[][]= new int[1001][1001];           //2d 배열로 확인

    static Vector<Integer> result = new Vector<>();
   // static Queue<Integer> result;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        testcase = sc.nextInt();

        //input
        while (testcase-- != 0) {
            nation = sc.nextInt();
            airplane = sc.nextInt();

            //init
            for (int i = 1; i <= nation; i++) {
                visit[i] = 0;
                cost[i] = INF;
                for (int j = 1; j <= nation; j++) {
                    graph[i][j] = INF;
                }
            }


            //connected 2d array
            for (int i = 1; i <= airplane; i++) {
                int from, to;
                from = sc.nextInt();
                to = sc.nextInt();
                graph[from][to] = 1;
                graph[to][from] = 1;
            }

            //find minAirPlane
            minCount = 0;
            int count = 0;
            cost[1] = 0;

            while (count < nation) {
                int min = INF;
                int curr = 0;        //현재 num

                for (int i = 1; i <= nation; i++) {
                    if (visit[i] == 0 && cost[i] < min) {
                        curr = i;
                        min = cost[i];
                    }
                }

                for (int i = 1; i <= nation; i++) {
                    if (visit[i] == 0 && graph[curr][i] == 1) {
                        if (graph[curr][i] < cost[i]) {
                            cost[i] = graph[curr][i];
                        }
                    }
                }


                count++;
                minCount += min;
                visit[curr] = 1;
            }
            result.add(minCount);

        }
            for (int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i));
            }



    }
}



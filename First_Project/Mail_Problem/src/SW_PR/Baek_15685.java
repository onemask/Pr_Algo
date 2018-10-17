package SW_PR;

import java.util.*;

public class Baek_15685 {

    static int dx[] = {1,0,-1,0};
    static int dy[] = {0,-1,0,1};
    static int[][] map = new int[101][101];
    static Stack step = new Stack();
    static Queue<Integer> steps = new LinkedList<>();



    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int dragon_num = sc.nextInt();

        while(dragon_num--!=0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int d = sc.nextInt();
            int g = sc.nextInt();

            step.clear();
            steps.clear();

            next_direction(d,g);

            while(!steps.isEmpty()){
                int paint = steps.poll();
                paint_map(x,y,paint);
            }
        }
            check_rectangle(map);

    }

    private static void next_direction(int d, int g) {

        step.push(d);
        steps.offer(d);

        while(step.size()!=Math.pow(2,g-1)){
            int top = (int)step.pop();
            steps.offer(top+1);
        }

        if(steps.size()==Math.pow(2,g)){
            return;
        }

    }

    private static void check_rectangle(int[][] map) {
    }

    private static void paint_map(int x, int y, int paint) {
    }


}

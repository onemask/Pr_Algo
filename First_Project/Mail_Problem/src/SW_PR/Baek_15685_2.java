package SW_PR;

import java.util.*;

public class Baek_15685_2 {

    static int[][] arr = new int[101][101];
    static int[] curv_arr = {0,1,2,3};
    static int[] dx= {1,0,-1,0};
    static int[] dy = {0,-1,0,1};

    static int x,y,d,g;
    static ArrayList<Integer> steps = new ArrayList<>();


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dragon_num = sc.nextInt();

        while(dragon_num--!=0){
            x= sc.nextInt();
            y =sc.nextInt();
            d=sc.nextInt();
            g = sc.nextInt();

            next_direction(d,g);
            paint_dragon(x,y,steps);
        }
        
      count_dragon(arr);
      //print_arr(arr);

    }

    private static void next_direction(int d,int g) {

        steps.clear();
        steps.add(d);

        //다음 세대까지 방향을 정한다.
        for (int i = 0; i < g; i++) {
            int size = steps.size();

            for (int j = size - 1; j >= 0; j--) {
                int top = steps.get(j);
                if (top == 3) {
                    steps.add(0);
                } else {
                    steps.add(top + 1);
                }
            }
        }

        //System.out.print(steps.toString());
    }

    private static void paint_dragon(int x,int y, ArrayList<Integer> steps){
        arr[x][y]=1;
        for(int i=0;i<steps.size();i++){
            int posx = x + dx[steps.get(i)];
            int posy = y + dy[steps.get(i)];
            arr[posx][posy]=1;
            x = posx;
            y=  posy;
        }
    }

    private static void count_dragon(int[][] arr){
        int result =0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++)
                if(arr[i][j]==1 && arr[i+1][j]==1 && arr[i][j+1]==1&&arr[i+1][j+1]==1){
                    result++;
                }
        }
        System.out.println(result);
    }

    private static void print_arr(int [][]arr){
        for(int i=0;i<101;i++){
            for(int j=0;j<101;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }







}

package SW_PR;

import sun.nio.cs.ext.MacHebrew;

import java.util.Arrays;
import java.util.Scanner;

public class Baek_14890 {

    static int n;
    static int l;
    static int[][] map;
    static int answer = 0;
    static int[] horizon;
    static int[] vertical;
    static boolean[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        l = sc.nextInt();
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        check_horizon(l);
        //check_vertical(l);
        System.out.println(answer);

    }

    private static void check_horizon(int len) {
        int idx = 0;
        boolean flag ;
        int line = 0 ;
        int [] slop = new int[n];

        horizon = new int[n];
        while (idx < n) {
            flag = true;
            for (int i = 0; i < n; i++) {
                horizon[i] = map[idx][i];
            }
            System.out.println(Arrays.toString(horizon));
            for (int i = 1; i < n; i++) {
                int before = horizon[i - 1];
                if(!flag ){
                    break;
                }

                else if (horizon[i] == before) {
                    continue;
                }
                //차이 나는 경우.- 2 2 2 3 2 3
                else {
                    if (horizon[i] - before == 1) {//우측 경사로.
                        int length = 0;
                        if (i - l < 0) {            //i-len까지 길 없음
                            flag = false;
                            break;
                        }
                        for (int j = i - 1; j >= 0; j--) {
                            length++;
                            if (length > len) break;
                            if (horizon[i] - horizon[j] != 1) {
                                flag = false;
                                break;
                            } else if (i - l >= 0 && horizon[i] - horizon[j] == 1) {
                                flag = true;
                            }
                        }
                    }
                    else if (horizon[i]-before == -1) {
                        //좌측 경사로.
                        int length = 0 ;
                        i= i-1;
                        if(i+l > n){
                            flag = false;
                            break;
                        }
                        for (int j = i+1; j <n; j++) {
                            length++;
                            if (length > len && j<n-1) {
                                if(horizon[j]>horizon[j-1]){
                                    flag =false;
                                    break;
                                }
                                if(horizon[j]<=horizon[j-1]){
                                    flag = true;
                                    slop[i-j]=1;
                                    break;
                                }
                            }
                            if ((horizon[i] - horizon[j] != 1)) { //경사로 ㄴㄴ
                                flag = false;
                                break;
                            } else if (i + l < n && (horizon[i] - horizon[j] <= 1)) {//경사로 ㅇㅇ
                                flag = true;
                                slop[i-j]=1;
                            } else if ( i-1 <i && flag && !check[j]){
                                flag = false;
                                break;
                            }
                        }

                        i = i+l;

                    }
                    else {      //차이가 1보다 큰 경우.
                        flag= false;
                        break;

                    }
                }
            }
            idx++;
            if (flag && line<=1) {
                System.out.println( "idx : "+ (idx) );
                answer++;
            }
        }

        System.out.println(answer);
    }


    private static void check_vertical(int len) {
        int idx = 0;
        boolean flag ;
        vertical = new int[n];
        while (idx < n) {
            flag = true;
            for (int i = 0; i < n; i++) {
                vertical[i] = map[i][idx];
            }
            System.out.println(Arrays.toString(vertical));
            for (int i = 1; i < n; i++) {
                int before = vertical[i - 1];
                if(!flag ){
                    break;
                }
                else if (vertical[i] == before) {
                    continue;
                }
                //차이 나는 경우.- 2 2 2 3 2 3
                else {
                    if (vertical[i] - before == 1) {//우측 경사로.
                        int length = 0;
                        if (i - l < 0) {            //i-len까지 길 없음
                            flag = false;
                            break;
                        }
                        for (int j = i - 1; j >= 0; j--) {
                            length++;
                            if (length > len) break;
                            if (vertical[i] - vertical[j] != 1) {
                                flag = false;
                                break;
                            } else if (i - l >= 0 && vertical[i] - vertical[j] == 1) {
                                flag = true;
                            }
                        }
                    }
                    else if (vertical[i]-before == -1) {
                        //좌측 경사로.
                        int length = 0 ;
                        i= i-1;
                        if(i+l > n){
                            flag = false;
                            break;
                        }
                        for (int j = i+1; j <n; j++) {
                            length++;
                            if (length > len && j<n-1) {
                                if(vertical[j]>vertical[j-1]){
                                    flag =false;
                                     break;
                                }
                                if(vertical[j]<=vertical[j-1]){
                                     flag = true;
                                     break;
                                }
                            }
                            if ((vertical[i] - vertical[j] != 1)) { //경사로 ㄴㄴ
                                flag = false;
                                break;
                            } else if (i + l < n && (vertical[i] - vertical[j] <= 1)) {//경사로 ㅇㅇ
                                flag = true;
                            } else if ( i-1 <i ){
                                flag = false;
                                break;
                            }
                        }
                        i = i+l;

                    }
                    else {      //차이가 1보다 큰 경우.
                        flag= false;
                        break;

                    }
                }
            }
            idx++;
            if (flag) {
                System.out.println( "idx : "+ (idx) );
                answer++;
            }
        }

        System.out.println(answer);
    }


}


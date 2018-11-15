package SW_PR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_14890_sol {
    static int n,l, result = 0 ;
    static int[] slop;
    static int[][] horizon,vertical;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());

        horizon = new int[n][n];
        vertical= new int[n][n];

        //
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                horizon[i][j] = vertical[j][i] = Integer.parseInt(st.nextToken());
            }
        }
        
        
        for ( int i=0;i<n;i++){
            checkSlope(i,horizon);
            System.out.println("horizon" + i + ":" +Arrays.toString(horizon[i]));
            checkSlope(i,vertical);
            System.out.println("vertical" + i + ":" +Arrays.toString(vertical[i]));
        }
        System.out.println(result);
    }

    private static void checkSlope(int idx, int[][] arr) {

        slop = new int[n]; //해당 idx의 경사로 설치 여부 알려줌.


        //n-1로 설정하여 idx overflow 방지.
        for( int i=0;i< n-1; i++){

            //동일하지 않은 경우만 체크.
            if(arr[idx][i] != arr[idx][i+1]){
                int differ = arr[idx][i]- arr[idx][i+1];
                if(differ != -1 && differ!=1) return; //차이가 1보다 큰 경우.

                if(differ == -1){ //왼쪽 경사로. 뒤가 더 큼.
                    for( int j=0; j<l;j++){
                        if(i -j < 0 || slop[i-j]==1 ) return; //경사로가 0보다 작은 경우, 중간에 경사로 있는 경우.
                        if(arr[idx][i]== arr[idx][i-j]) slop[i-j]=1;
                        else return;
                    }
                }else{            //우측 경사로, 앞이 더 큼.
                    for( int j=1;j<=l;j++){
                        if(i+j >=n || slop[i+j]==1) return;
                        if(arr[idx][i] -1 == arr[idx][i+j]) slop[i+j]=1;
                        else return;
                    }
                }

            }

        }
        result ++;
    }
}

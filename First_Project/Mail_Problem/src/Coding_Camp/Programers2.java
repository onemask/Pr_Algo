package Coding_Camp;

public class Programers2 {

    public static int[][] solution(int n, int[][] signs){

            int[][] answer=new int[n+1][n+1];
            boolean cycle = false;


            //init
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    answer[i][j]=0;
                }
            }

        System.out.print("[");
        for(int i=1;i<=n;i++) {
                System.out.print("[");
                for (int j = 1; j <= n; j++){
                    System.out.print(answer[i][j] + ",");
                }
                System.out.print("]");
            }
            System.out.print("]");



        //check
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    //cycle check
                    if(signs[i][j]==1)
                        if(signs[j][j+1]==1)
                            if(signs[j+1][j-1]==1)
                                cycle = true;
                }
            }

            if(cycle)
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        answer[i][j]=1;
                    }



                    //int[][] answer = {{1,1,1},{1,1,1},{1,1,1}};


                }
            return answer;

        }

    public static void main(String[] args){

        int n =3;
        int array[][] = {{0,1,0},{0,0,1},{1,0,0}};

        solution(3,array);

    }


}

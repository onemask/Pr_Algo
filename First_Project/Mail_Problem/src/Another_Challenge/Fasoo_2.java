package Another_Challenge;

public class Fasoo_2 {



    public static int solution(int[] monster, int S1, int S2, int S3) {
        int arr[] = new int[100000];
        int _i = S1, _j = S2, _k = S3;

        //보드게임에서 갈 수 있는 경우.다 체크.
        for(int i = 1; i <= _i ; i++)
            for(int j = 1; j <= _j ; j++)
                for(int k = 1; k <= _k ; k++)
                    arr[1+i+j+k]++;

        //주사위를 굴리는 경우의 수 .
        int answer = S1*S2*S3;

        //뭐냐능.
        for(int i = 0; i< monster.length; i++)
            answer -= arr[monster[i]];

        return (answer/(S1*S2*S3))*1000;
    }

}

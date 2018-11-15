import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2747 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] fact = new int[n+1];

        fact[0]=0;
        fact[1]=1;

        for(int i=2;i<n+1;i++){
            fact[i]=fact[i-1]+fact[i-2];
        }

        System.out.println(fact[n]);



    }
}

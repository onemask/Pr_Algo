package Another_Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Goorm_1 {
    public static void main(String [] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String ouput = "";

        for(int i=0;i<input.length();i++){

            if(input.charAt(i)!=' '){
                 ouput+=input.charAt(i);
            }
        }


        System.out.println(ouput);

    }

}

package Baek_Algo;

import java.io.*;
import java.util.Arrays;

public class Back_10989_ver2 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] array = new int[size];

        for (int i=0;i<size;i++){

            array[i]=Integer.parseInt(br.readLine());
        }

        Arrays.sort(array);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=0;i<size;i++){
            bw.write(array[i]+"\n");
        }
        bw.flush();
        bw.close();

    }

}

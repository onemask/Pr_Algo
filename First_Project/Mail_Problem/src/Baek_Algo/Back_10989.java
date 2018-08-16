package Baek_Algo;
//다른 sort으로 이용하기.

import java.io.*;

public class Back_10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        int testsize = Integer.parseInt(br.readLine());
        int array[] = new int[testsize];

        //input array
        for(int i=0;i<testsize;i++){
            array[Integer.parseInt(br.readLine())]++;
        }

        selectionSort(array,0);

        //output
        for(int i=0;i<testsize;i++){
            bw.write(array[i] + "\n");
        }
        br.close();
        bw.close();
    }


    private static void selectionSort(int[] array, int start) {           //오버로드
        if (start < array.length - 1) {
            int min = start;
            for (int i = start; i < array.length; i++) {
                if (array[i] <= array[min])
                    min = i;
            }
            swap(array, start, min);
            selectionSort(array, start + 1);
        }
    }

    private static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}


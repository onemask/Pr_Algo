import java.util.Scanner;

public class June_sort1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int array_A[]= new int[size];
        int array_B[]= new int[size];

        for (int i=0;i<size;i++)
           array_A[i]=sc.nextInt();

        for(int i=0;i<size;i++)
           array_B[i]=sc.nextInt();

        //print array_A
        for(int i=0;i<size;i++)
           System.out.print(array_A[i]);

        //print array_B
        for(int i=0;i<size;i++)
            System.out.print(array_B[i]);


    }

}

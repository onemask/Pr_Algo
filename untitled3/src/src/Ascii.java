import java.io.UnsupportedEncodingException;
        import java.util.Scanner;

public class Ascii {
    public static void main (String args[]) throws UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int j = 0;
        int array[] = {1, 0, -1, -1, 2, -1, -1, -1, -1, 4, 3, -1, -1, 7, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        System.out.println(array.length) ;


        while (j < array.length) {
            for (int i = 97; i < 123; i++) {
                System.out.println((char) i + ": " +array[j]);
                j++;
            }
        }

    }
}



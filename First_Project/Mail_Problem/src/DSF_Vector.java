import java.util.Scanner;

public class DSF_Vector{
    static int k;
    static Scanner sc;
    static int[] array;
    static int cnt;
    static StringBuffer sb;
    public static void main(String[] args) {
         solve();
    }



public static void solve() {
        k =sc.nextInt();
        while (k!= 0) {
        array = new int[13];

        for (int i = 0; i < k; i++) {
        array[i] = sc.nextInt();
        }

        for (int i = 0; i < k; i++) {
        cnt = 1;
        dfs(i, array[i] + " ");
        }

        sb.append("\n");
        }
        System.out.println(sb.toString());
        }

public static void dfs(int v, String str) {
        if (cnt == 6) {
        sb.append(str + "\n");
        } else {
        for (int i = v + 1; i < k; i++) {
        ++cnt;
        dfs(i, str + array[i] + " ");
        }
        }
        --cnt;
        }

}

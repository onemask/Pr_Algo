package Another_Challenge;

import java.util.Vector;

public class KaKao_Festival {
    public static void main(String[] arg) {

        Vector<Integer> vector_17 = new Vector<Integer>();


        for (int i = 1; i < 22; i++) {
            vector_17.add(i, 500);
        }


        Vector<Integer> vector_18 = new Vector<Integer>();
        int money_18 = 512;

        for (int i = 1; i < 31; i *= 2) {
            vector_18.add(i, money_18);
            money_18 /= 2;
        }
    }
}

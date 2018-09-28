package Baek_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1625 {
    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String T = br.readLine();

        String P = br.readLine();

        check_cnt(T, P);


    }

    private static void check_cnt(String t, String p) {

        boolean flag = false;
        int t_size = t.length();
        int t_cursor = 0;

        int p_size = p.length();
        int p_cursor = 0;

        String check;
        String rlt = "";


        while (t_cursor <= t_size && (t_cursor+p_size<=t.length())) {
            if (t.charAt(t_cursor) == p.charAt(p_cursor)){
                check = t.substring(t_cursor, t_cursor + p_size );
                for (int i =0; i < check.length(); i++) {
                    if (check.charAt(i) == p.charAt(p_cursor++)) {
                        flag = true;
                            if (flag && p_cursor-1 == check.length()-1) {
                                cnt++;
                                rlt += Integer.toString(t_cursor+1) + " ";
                                p_cursor=0;
                                break;
                            }
                    } else {
                        flag = false;
                        p_cursor = 0;
                        break;

                    }
                }
            }
            t_cursor++;
        }

        System.out.println(cnt);
        System.out.print(rlt.substring(0,rlt.length()));



    }
}


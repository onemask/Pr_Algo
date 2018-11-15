package Baek_Algo;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class std_score implements Comparable<std_score> {
        String name;
        int kor;
        int eng;
        int math;
        std_score(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
        private void print_std_score() {
            System.out.println(name + " " + kor + " " + eng + " " + math);
        }
        @Override
        public int compareTo(std_score another) {
            if (this.kor > another.kor) {            //국어점수 내림차순
                return -1;
            }
            else if (this.kor == another.kor) {      //국어 점수가 같으면 영어 점수 오름차순
                if (this.eng < another.eng){
                    return -1;
                }
                else if (this.eng == another.eng) {  //국어,영어 같으면 수학점수 내림차순
                    if (this.math > another.math) {
                        return -1;
                    }
                    else if (this.math == another.math) {//국어,영어,수학 같으면 이름이 사전순 증가.
                        return this.name.compareTo(another.name);
                    }
                }
            }
            return 1;
        }
    }

public class Baek_10825 {
    public static void main(String args[]) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                int num = Integer.parseInt(br.readLine());

                std_score[] stds = new std_score[num];

                //input std_score
                for (int i = 0; i < num; i++) {
                    String[] s = br.readLine().split(" ");
                    stds[i] = new std_score(s[0], Integer.valueOf(s[1]), Integer.valueOf(s[2]), Integer.valueOf(s[3]));
                }

                Arrays.sort(stds);

                //print answer
                for (std_score std : stds) {
                    bw.write(std.name+"\n");
                }

                bw.flush();
                bw.close();

            }
    }


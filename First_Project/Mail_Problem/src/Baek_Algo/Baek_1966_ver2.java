package Baek_Algo;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

    class Document {
        int idx, priority;
        Document(int idx, int priority) {
            this.idx = idx;
            this.priority = priority;
        }
    }


    public class Baek_1966_ver2 {

    static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;
            Queue<Document> q = new LinkedList<>();

            int testcase = Integer.parseInt(br.readLine());

            while (testcase-- != 0) {
                q.clear();
                list.clear();
                st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                st = new StringTokenizer(br.readLine());

                for (int i = 0; i < n; i++) {
                    int priority = Integer.parseInt(st.nextToken());
                    q.offer(new Document(i, priority));
                    list.add(findidx(priority), priority);
                }

                int count = 1;
                while (!q.isEmpty()) {
                    int max = getMax();
                    Document d = q.poll();
                    if (d.priority == max) {
                        if (d.idx == m) {
                            bw.write(count + "\n");
                            break;
                        }
                        count++;
                        list.remove(list.indexOf(max));
                        continue;
                    }
                    q.offer(d);
                }
            }
            bw.flush();
        }

        //우선순위가 높은 idx 찾는 func
        public static int findidx(int priority) {
            int idx = 0;
            for (int i = 0; i < list.size(); i++) {
                idx++;
                if (list.get(i) > priority) break;
            }
            return (idx == list.size() ? 0 : idx);

        }

        //가장 높은 우선순위 값은?
        public static int getMax() {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < list.size(); i++) {
                if (max < list.get(i))
                    max = list.get(i);
            }
            return max;
        }

    }


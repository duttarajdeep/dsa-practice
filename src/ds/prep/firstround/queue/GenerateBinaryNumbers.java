package ds.prep.firstround.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static String[] solution(int n) {
        String[] res = new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for (int i = 0; i < n; i++) {
            res[i] = q.poll();
            String s1 = res[i] + "0";
            String s2 = res[i] + "1";
            q.offer(s1);
            q.offer(s2);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(9)));
    }
}

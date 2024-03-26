package Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Solution22 {
    List<int[]> list = new ArrayList<>();

    public int solution(int k, int[][] dungeons) {
        int[] order = {0, 1, 2};

        permutation(order, 0, order.length, order.length);

        int count = 0;
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            int pirodo = k;
            count = 0;
            int[] cur = list.get(i);
            for (int j = 0; j < cur.length; j++) {
                int idx = cur[j];
                if (pirodo >= dungeons[idx][0]) {
                    pirodo -= dungeons[idx][1];
                    count++;
                }
            }
            max = Math.max(max, count);

            if (max == dungeons.length) {
                return max;
            }
        }

        return max;
    }

    public void permutation(int[] order, int depth, int n, int r) {
        if (depth == r) {
            int[] temp = order.clone();
            list.add(temp);
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(order, depth, i);
            permutation(order, depth + 1, n, r);
            swap(order, depth, i);
        }
    }

    public void swap(int[] order, int depth, int i) {
        int temp = order[depth];
        order[depth] = order[i];
        order[i] = temp;
    }
}

public class 피로도 {
    public static void main(String[] args) {
        Solution22 solution22 = new Solution22();
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        System.out.println(solution22.solution(k, dungeons));
    }
}

package Level2;

import java.util.*;

class Solution45 {
    public int solution(int k, int[] tangerine) {
        int count = 0;
        int num = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int tan : tangerine) {
            map.put(tan, map.getOrDefault(tan, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());

        for (int val : list) {
            if (num + val >= k) {
                count++;
                break;
            } else {
                num += val;
                count++;
            }
        }

        return count;
    }
}

public class 귤고르기 {
    public static void main(String[] args) {
        Solution45 solution45 = new Solution45();
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution45.solution(k, tangerine));
    }
}

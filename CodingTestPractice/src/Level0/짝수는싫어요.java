package Level0;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                list.add(i);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}

public class 짝수는싫어요 {
    public static void main(String[] args) {
        int n = 10;
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(n)));

        n = 15;
        System.out.println(Arrays.toString(s.solution(n)));
    }
}

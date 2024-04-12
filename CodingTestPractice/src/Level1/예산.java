package Level1;

import java.util.Arrays;

class Solution26 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) {
                break;
            } else {
                answer++;
            }
        }

        return answer;
    }
}

public class 예산 {
    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        System.out.println(solution26.solution(d, budget));
    }
}

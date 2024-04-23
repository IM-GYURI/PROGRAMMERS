package Level1;

import java.util.Arrays;

class Solution35 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);
        int idx = score.length - m;

        while (idx >= 0) {
            answer += score[idx] * m;
            idx -= m;
        }

        return answer;
    }
}

public class 과일장수 {
    public static void main(String[] args) {
        Solution35 solution35 = new Solution35();
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(solution35.solution(k, m, score));
    }
}

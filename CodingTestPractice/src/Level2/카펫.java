package Level2;

import java.util.Arrays;

class Solution25 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;

        for (int i = 3; i < sum; i++) {
            int j = sum / i;

            if (sum % i == 0 && j >= 3) {
                int col = Math.max(i, j);
                int row = Math.min(i, j);

                int center = (col - 2) * (row - 2);

                if (center == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                    return answer;
                }
            }
        }

        return answer;
    }
}

public class 카펫 {
    public static void main(String[] args) {
        Solution25 solution25 = new Solution25();
        int brown = 10;
        int yellow = 2;
        System.out.println(Arrays.toString(solution25.solution(brown, yellow)));

        brown = 8;
        yellow = 1;
        System.out.println(Arrays.toString(solution25.solution(brown, yellow)));

        brown = 24;
        yellow = 24;
        System.out.println(Arrays.toString(solution25.solution(brown, yellow)));
    }
}

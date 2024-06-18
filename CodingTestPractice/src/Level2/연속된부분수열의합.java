package Level2;

import java.util.Arrays;

class Solution39 {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[]{0, sequence.length - 1};

        int left = 0;
        int right = 1;

        int sum = sequence[0];

        while (left < right) {
            if (sum == k) {
                change(left, right, answer);
                sum -= sequence[left++];
            } else if (sum > k) {
                sum -= sequence[left++];
            } else if (right < sequence.length) {
                sum += sequence[right++];
            } else {
                break;
            }
        }

        return answer;
    }

    public void change(int left, int right, int[] answer) {
        if (right - left < answer[1] - answer[0] + 1) {
            answer[0] = left;
            answer[1] = right - 1;
        }
    }
}

public class 연속된부분수열의합 {
    public static void main(String[] args) {
        Solution39 solution39 = new Solution39();
        int[] sequence = {1, 2, 3, 4, 5};
        int k = 7;

        System.out.println(Arrays.toString(solution39.solution(sequence, k)));
    }
}

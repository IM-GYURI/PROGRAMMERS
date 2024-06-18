package Level2;

class Solution46 {
    public long solution(int n) {
        long[] answer = new long[n];

        if (n == 1) {
            return 1;
        }

        answer[0] = 1;
        answer[1] = 2;

        for (int i = 2; i < n; i++) {
            answer[i] = (answer[i - 2] + answer[i - 1]) % 1234567;
        }

        return answer[n - 1];
    }
}

public class 멀리뛰기 {
    public static void main(String[] args) {
        Solution46 solution46 = new Solution46();
        int n = 4;
        System.out.println(solution46.solution(n));
    }
}

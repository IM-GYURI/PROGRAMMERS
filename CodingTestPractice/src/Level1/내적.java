package Level1;

class Solution51 {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }
}

public class 내적 {
    public static void main(String[] args) {
        Solution51 solution51 = new Solution51();
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        System.out.println(solution51.solution(a, b));
    }
}

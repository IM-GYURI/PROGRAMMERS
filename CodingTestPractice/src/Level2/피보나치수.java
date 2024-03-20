package Level2;

class Solution19 {
    public int solution(int n) {
        int answer = fibonacci(n);
        return answer;
    }

    public int fibonacci(int n) {
        int[] fibo = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibo[i] = (fibo[i - 2] + fibo[i - 1]) % 1234567;
        }

        return fibo[n];
    }
}

public class 피보나치수 {
    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        int n = 5;
        System.out.println(solution19.solution(n));
    }
}

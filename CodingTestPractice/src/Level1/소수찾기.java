package Level1;

class Solution23 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                answer++;
            }
        }

        return answer;
    }

    public boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class 소수찾기 {
    public static void main(String[] args) {
        Solution23 solution23 = new Solution23();
        int n = 10;
        System.out.println(solution23.solution(n));

        n = 5;
        System.out.println(solution23.solution(n));
    }
}

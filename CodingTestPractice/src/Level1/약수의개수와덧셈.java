package Level1;

class Solution50 {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            if (countPrime(i) % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    public int countPrime(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        return count;
    }
}

public class 약수의개수와덧셈 {
    public static void main(String[] args) {
        Solution50 solution50 = new Solution50();
        int left = 13;
        int right = 17;
        System.out.println(solution50.solution(left, right));
    }
}

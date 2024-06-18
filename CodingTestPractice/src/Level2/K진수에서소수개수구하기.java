package Level2;

class Solution41 {
    public int solution(int n, int k) {
        int answer = 0;
        String str = "";

        while (n != 0) {
            str = n % k + str;
            n /= k;
        }

        String[] arr = str.split("0");

        for (String a : arr) {
            if (a.equals("")) continue;

            long num = Long.parseLong(a);

            if (isPrime(num)) answer++;
        }

        return answer;
    }

    public boolean isPrime(Long num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

public class K진수에서소수개수구하기 {
    public static void main(String[] args) {
        Solution41 solution41 = new Solution41();
        int n = 74;
        int k = 3;
        System.out.println(solution41.solution(n, k));
    }
}

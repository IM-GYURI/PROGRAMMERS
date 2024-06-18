package Level1;

class Solution47 {
    public int[] solution(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);

        int[] answer = new int[2];

        answer[0] = gcd(a, b);
        answer[1] = n * m / answer[0];

        return answer;
    }

    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}

public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        Solution47 solution47 = new Solution47();
        int n = 3;
        int m = 12;
        System.out.println(solution47.solution(n, m));
    }
}

package Level1;

class Solution19 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            answer += (n / a) * b;
            n = (n / a) * b + (n % a);
        }

        return answer;
    }
}

public class 콜라문제 {
    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        int a = 2;
        int b = 1;
        int n = 20;
        System.out.println(solution19.solution(a, b, n));

        a = 3;
        b = 1;
        n = 20;
        System.out.println(solution19.solution(a, b, n));
    }
}

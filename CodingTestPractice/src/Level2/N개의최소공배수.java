package Level2;

class Solution47 {
    public int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }

    public int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }

    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}

public class N개의최소공배수 {
    public static void main(String[] args) {
        Solution47 solution47 = new Solution47();
        int[] arr = {2, 6, 8, 14};
        System.out.println(solution47.solution(arr));
    }
}

package Level1;

import java.util.Arrays;

class Solution21 {
    public long solution(long n) {
        long answer = 0;
        int count = 0;
        long num = n;

        while (num > 0) {
            num /= 10;
            count++;
        }

        long[] arr = new long[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n % 10;
            n /= 10;
        }

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            answer *= 10;
            answer += arr[i];
        }

        return answer;
    }
}

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {
        Solution21 solution21 = new Solution21();
        long n = 118372;
        System.out.println(solution21.solution(n));
    }
}

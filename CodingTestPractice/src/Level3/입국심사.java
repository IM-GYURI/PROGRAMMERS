package Level3;

import java.util.Arrays;

class Solution5 {
    public long solution(int n, int[] times) {
        long answer = 0;

        Arrays.sort(times);

        long min = 0;
        long max = times[times.length - 1] * (long)n;

        while (min <= max) {
            long mid = (min + max) / 2;
            long people = cal(mid, times);

            if (people >= n) {
                max = mid - 1;
                answer = mid;
            } else {
                min = mid + 1;
            }
        }

        return answer;
    }

    public long cal(long mid, int[] times) {
        long count = 0;

        for (int i = 0; i < times.length; i++) {
            count += mid / times[i];
        }

        return count;
    }
}

public class 입국심사 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        int n = 6;
        int[] times = {7, 10};
        System.out.println(solution5.solution(n, times));
    }
}

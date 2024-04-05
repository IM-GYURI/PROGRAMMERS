package Level2;

class Solution29 {
    public long solution(int k, int d) {
        long answer = 0;

        for (long x = 0; x <= d; x += k) {
            long maxY = (long) Math.sqrt((long)d * d - (long)x * x);
            answer += maxY / k + 1;
        }

        return answer;
    }
}

public class 점찍기 {
    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();
        int k = 2;
        int d = 4;
        System.out.println(solution29.solution(k, d));
    }
}

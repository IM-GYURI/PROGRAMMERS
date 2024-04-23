package Level1;

import java.time.LocalDate;

class Solution33 {
    public String solution(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3);
    }
}

public class _2016년 {
    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();
        int a = 5;
        int b = 24;
        System.out.println(solution33.solution(a, b));
    }
}

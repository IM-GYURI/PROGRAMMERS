package Level2;

import java.util.Arrays;

class Solution3 {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while (!s.equals("1")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    answer[1] += 1;
                }
            }
            s = s.replace("0", "");
            int len = s.length();
            s = Integer.toString(len, 2);
            answer[0] += 1;
        }

        return answer;
    }
}

public class 이진변환반복하기 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        String s = "110010101001";
        System.out.println(Arrays.toString(solution3.solution(s)));

        s = "01110";
        System.out.println(Arrays.toString(solution3.solution(s)));

        s = "1111111";
        System.out.println(Arrays.toString(solution3.solution(s)));
    }
}

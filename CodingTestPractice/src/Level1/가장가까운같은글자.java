package Level1;

import java.util.Arrays;

class Solution31 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;

        for (int i = 1; i < s.length(); i++) {
            String temp = s.substring(0, i);
            if (!temp.contains(s.charAt(i) + "")) {
                answer[i] = -1;
            } else {
                int idx = 0;
                for (int j = 0; j < temp.length(); j++) {
                    if (temp.charAt(j) == s.charAt(i)) {
                        idx = j;
                    }
                }
                answer[i] = i - idx;
            }
        }

        return answer;
    }
}

public class 가장가까운같은글자 {
    public static void main(String[] args) {
        Solution31 solution31 = new Solution31();
        String s = "banana";
        System.out.println(Arrays.toString(solution31.solution(s)));
    }
}

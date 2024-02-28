package Level2;

class Solution4 {
    public int solution(String s) {
        int answer = s.length();
        int count = 1;

        for (int i = 1; i <= s.length() / 2; i++) {
            StringBuilder sb = new StringBuilder();
            String base = s.substring(0, i);
            for (int j = i; j <= s.length(); j += i) {
                int endIdx = Math.min(j + i, s.length());
                String compare = s.substring(j, endIdx);
                if (base.equals(compare)) {
                    count++;
                } else {
                    if (count >= 2) {
                        sb.append(count);
                    }
                    sb.append(base);
                    base = compare;
                    count = 1;
                }
            }
            sb.append(base);
            answer = Math.min(answer, sb.length());
        }
        return answer;
    }
}

public class 문자열압축 {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        String s = "aabbaccc";
        System.out.println(solution4.solution(s));

        s = "ababcdcdababcdcd";
        System.out.println(solution4.solution(s));

        s = "abcabcdede";
        System.out.println(solution4.solution(s));

        s = "abcabcabcabcdededededede";
        System.out.println(solution4.solution(s));

        s = "xababcdcdababcdcd";
        System.out.println(solution4.solution(s));
    }
}

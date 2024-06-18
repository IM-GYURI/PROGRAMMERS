package Level1;

import java.util.*;

class Solution44 {
    public String solution(String s, int n) {
        StringBuffer sb = new StringBuffer();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(" ");
                continue;
            }

            if (c >= 'a' && c <= 'z') {
                if (c + n > 'z') {
                    sb.append((char)(c - 26 + n));
                } else {
                    sb.append((char)(c + n));
                }
            }

            if (c >= 'A' && c <= 'Z') {
                if (c + n > 'Z') {
                    sb.append((char)(c - 26 + n));
                } else {
                    sb.append((char)(c + n));
                }
            }
        }

        return sb.toString();
    }
}

public class 시저암호 {
    public static void main(String[] args) {
        Solution44 solution44 = new Solution44();
        String s = "AB";
        int n = 1;
        System.out.println(solution44.solution(s, n));
    }
}

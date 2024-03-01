package Level1;

class Solution10 {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }

        return true;
    }
}

public class 문자열다루기기본 {
    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        String s = "a234";
        System.out.println(sol.solution(s));

        s = "1234";
        System.out.println(sol.solution(s));
    }
}

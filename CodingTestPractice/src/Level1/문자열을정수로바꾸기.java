package Level1;

class Solution11 {
    public int solution(String s) {
        String answer = "";

        if (s.charAt(0) == '+') {
            answer = s.substring(1);
            return Integer.parseInt(answer);
        } else if (s.charAt(0) == '-') {
            answer = s.substring(1);
            return -1 * Integer.parseInt(answer);
        } else {
            return Integer.parseInt(s);
        }
    }
}

public class 문자열을정수로바꾸기 {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        String s = "1234";
        System.out.println(solution11.solution(s));

        s = "-1234";
        System.out.println(solution11.solution(s));

        s = "+1234";
        System.out.println(solution11.solution(s));
    }
}

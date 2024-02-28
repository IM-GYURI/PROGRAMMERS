package Level1;

class Solution8 {
    public String solution(String s) {
        String answer = "";
        int count = -1;
        String[] str = s.split("");

        for (String a : str) {
            count = a.contains(" ") ? -1 : count + 1;
            answer += (count % 2 == 0) ? a.toUpperCase() : a.toLowerCase();
        }

        return answer;
    }
}

public class 이상한문자만들기 {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        String s = "try hello world";
        System.out.println(solution8.solution(s));
    }
}

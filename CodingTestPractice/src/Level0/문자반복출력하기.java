package Level0;

class Solution8 {
    public String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}

public class 문자반복출력하기 {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        String my_string = "hello";
        int n = 3;
        System.out.println(solution8.solution(my_string, n));
    }
}

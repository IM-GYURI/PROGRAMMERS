package Level1;

class Solution52 {
    public String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                answer += "수";
            else
                answer += "박";
        }

        return answer;
    }
}

public class 수박수박수박수박수 {
    public static void main(String[] args) {
        Solution52 solution52 = new Solution52();
        int n = 3;
        System.out.println(solution52.solution(n));
    }
}

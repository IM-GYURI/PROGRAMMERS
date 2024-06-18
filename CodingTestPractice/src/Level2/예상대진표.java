package Level2;

class Solution48 {
    public int solution(int n, int a, int b) {
        int answer = 0;

        while (true) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;

            answer++;

            if (a == b) {
                break;
            }
        }

        return answer;
    }
}

public class 예상대진표 {
    public static void main(String[] args) {
        Solution48 solution48 = new Solution48();
        int n = 8;
        int param2 = 4;
        int param3 = 7;
        System.out.println(solution48.solution(n, param2, param3));
    }
}

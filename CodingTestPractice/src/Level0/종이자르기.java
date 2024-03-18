package Level0;

class Solution11 {
    public int solution(int M, int N) {
        int answer = 0;

        if (M == 1 && N ==1) {
            return 0;
        }

        answer += M - 1;

        answer = answer + (answer + 1) * (N - 1);

        return answer;
    }
}

public class 종이자르기 {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        int M = 2;
        int N = 2;
        System.out.println(solution11.solution(M, N));

        M = 2;
        N = 5;
        System.out.println(solution11.solution(M, N));

        M = 1;
        N = 1;
        System.out.println(solution11.solution(M, N));
    }
}

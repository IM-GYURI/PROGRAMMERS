package Level1;

class Solution5 {
    public int solution(int n, int m, int[] section) {
        int start = section[0];
        int end = section[0] + m - 1;
        int answer = 1;

        for (int num : section) {
            if (start > num || end < num) {
                start = num;
                end = num + m - 1;
                answer++;
            }
        }
        return answer;
    }
}

public class 덧칠하기 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};
        System.out.println(solution5.solution(n, m, section));

        n = 5;
        m = 4;
        section = new int[]{1, 3};
        System.out.println(solution5.solution(n, m, section));

        n = 4;
        m = 1;
        section = new int[]{1, 2, 3, 4};
        System.out.println(solution5.solution(n, m, section));
    }
}

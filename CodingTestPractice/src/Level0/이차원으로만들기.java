package Level0;

class Solution5 {
    public int[][] solution(int[] num_list, int n) {
        int a = num_list.length / n;
        int[][] answer = new int[a][n];
        int idx = 0;

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[idx++];
            }
        }

        return answer;
    }
}
public class 이차원으로만들기 {
    public static void print(int[][] answer) {
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        int[][] answer = solution5.solution(num_list, n);
        print(answer);

        num_list = new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948};
        n = 3;
        answer = solution5.solution(num_list, n);
        print(answer);
    }
}

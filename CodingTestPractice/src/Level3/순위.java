package Level3;

class Solution9 {
    public int solution(int n, int[][] results) {
        int answer = 0;
        int[][] graph = new int[n][n];

        for (int i = 0; i < results.length; i++) {
            graph[results[i][0] - 1][results[i][1] - 1] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (graph[j][i] == 1 && graph[i][k] == 1) {
                        graph[j][k] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (graph[i][j] == 1 || graph[j][i] == 1) {
                    count++;
                }
            }

            if (count == n - 1) {
                answer++;
            }
        }

        return answer;
    }
}
public class 순위 {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        int n = 5;
        int[][] results = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};
        System.out.println(solution9.solution(n, results));
    }
}

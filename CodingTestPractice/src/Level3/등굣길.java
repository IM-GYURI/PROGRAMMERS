package Level3;

class Solution7 {
    public int solution(int m, int n, int[][] puddles) {
        int[][] road = new int[n][m];

        for (int i = 0; i < puddles.length; i++) {
            road[puddles[i][1] - 1][puddles[i][0] - 1] = -1;
        }

        road[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (road[i][j] == -1) {
                    road[i][j] = 0;
                    continue;
                }

                if (i != 0) {
                    road[i][j] += road[i - 1][j] % 1000000007;
                }

                if (j != 0) {
                    road[i][j] += road[i][j - 1] % 1000000007;
                }
            }
        }

        return road[n - 1][m - 1] % 1000000007;
    }
}

public class 등굣길 {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        int m = 4;
        int n = 3;
        int[][] puddles = {{2, 2}};
        System.out.println(solution7.solution(m, n, puddles));
    }
}

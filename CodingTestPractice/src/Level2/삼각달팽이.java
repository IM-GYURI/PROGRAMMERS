package Level2;

import java.util.Arrays;

class Solution33 {
    public int[] solution(int n) {
        int max = n * (n + 1) / 2;
        int[][] arr = new int[n][n];
        int[] answer = new int[max];

        int x = -1;
        int y = 0;
        int val = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else if (i % 3 == 2) {
                    x--;
                    y--;
                }
                arr[x][y] = val++;
            }
        }

        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != 0) {
                    answer[idx++] = arr[i][j];
                }
            }
        }
        return answer;
    }
}

public class 삼각달팽이 {
    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();
        int n = 4;
        System.out.println(Arrays.toString(solution33.solution(n)));
    }
}

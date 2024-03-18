package Level2;

import java.util.Arrays;

class Solution16 {
    int[] answer = new int[2];

    public int[] solution(int[][] arr) {
        int totalSize = arr.length;
        quad(0, 0, totalSize, arr);

        return answer;
    }

    public boolean isSame(int x, int y, int size, int[][] arr) {
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[x][y] != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void quad(int x, int y, int size, int[][] arr) {
        if (isSame(x, y, size, arr)) {
            answer[arr[x][y]]++;
            return;
        }

        quad(x, y, size / 2, arr);
        quad(x + size / 2, y, size / 2, arr);
        quad(x, y + size / 2, size / 2, arr);
        quad(x + size / 2, y + size / 2, size / 2, arr);
    }
}

public class 쿼드압축후개수세기 {
    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();
        int[][] arr = {{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        System.out.println(Arrays.toString(solution16.solution(arr)));

        arr = new int[][]{{1, 1, 1, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 1, 0, 0, 1, 1, 1, 1},
        {0, 0, 0, 0, 0, 0, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 1, 0, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}};
        System.out.println(Arrays.toString(solution16.solution(arr)));
    }
}

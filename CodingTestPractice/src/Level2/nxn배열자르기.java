package Level2;

import java.util.*;

class Solution44 {
    public int[] solution(int n, long left, long right) {
        int num = (int)right - (int)left + 1;
        int[] answer = new int[num];
        int[][] arr = new int[n][n];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = i + 1;
                }

                if (arr[j][i] == 0) {
                    arr[j][i] = i + 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                list.add(arr[i][j]);
            }
        }

        int idx = 0;
        for (int i = (int) left; i <= (int) right; i++) {
            answer[idx++] = list.get(i);
        }


        return answer;
    }
}

public class nxn배열자르기 {
    public static void main(String[] args) {
        Solution44 solution44 = new Solution44();
        int n = 3;
        long left = 2;
        long right = 5;
        System.out.println(solution44.solution(n, left, right));
    }
}

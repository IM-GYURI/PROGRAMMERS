package Level2;

import java.util.ArrayList;
import java.util.List;

class Solution18 {
    List<int[]> arr = new ArrayList<>();

    public int[][] solution(int n) {
        move(n, 1, 2, 3);
        int[][] answer = arr.stream().toArray(int[][]::new);
        return answer;
    }

    public void move(int cnt, int start, int mid, int end) {
        if (cnt == 0) {
            return;
        }

        move(cnt - 1, start, end, mid);
        arr.add(new int[]{start, end});
        move(cnt - 1, mid, start, end);
    }
}

public class 하노이의탑 {
    public static void main(String[] args) {
        Solution18 solution18 = new Solution18();
        int n = 2;
        print(solution18.solution(n));
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package Level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution1 {
    public static int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for (int i = 0; i < places.length; i++) {
            String[] p = places[i];
            boolean isOK = true;

            for (int j = 0; j < 5 && isOK; j++) {
                for (int k = 0; k < 5 && isOK; k++) {
                    if (p[j].charAt(k) == 'P') {
                        if (!bfs(j, k, p)) {
                            isOK = false;
                        }
                    }
                }
            }

            answer[i] = isOK ? 1 : 0;
        }

        return answer;
    }

    public static boolean bfs(int j, int k, String[] p) {
        int[] dj = {-1, 1, 0, 0};
        int[] dk = {0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[]{j, k});

        while (!queue.isEmpty()) {
            int[] position = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nj = position[0] + dj[i];
                int nk = position[1] + dk[i];

                if (nj < 0 || nj >= 5 || nk < 0 || nk >= 5 || (nj == j && nk == k)) {
                    continue;
                }

                int d = Math.abs(nj - j) + Math.abs(nk - k);

                if (p[nj].charAt(nk) == 'P' && d <= 2) {
                    return false;
                } else if (p[nj].charAt(nk) == 'O' && d < 2) {
                    queue.offer(new int[]{nj, nk});
                }
            }
        }
        return true;
    }
}

public class 거리두기확인하기 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        System.out.println(Arrays.toString(solution1.solution(places)));
    }
}

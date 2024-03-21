package Level2;

import java.util.LinkedList;
import java.util.Queue;

class Solution20 {
    int[] dX = {1, -1, 0, 0};
    int[] dY = {0, 0, 1, -1};

    public int solution(int[][] maps) {
        int answer = 0;

        int[][] visited = new int[maps.length][maps[0].length];

        bfs(maps, visited);

        answer = visited[maps.length - 1][maps[0].length - 1];
        if (answer == 0) {
            return -1;
        }

        return answer;
    }

    public void bfs(int[][] maps, int[][] visited) {
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        int[] start = new int[]{x, y};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 4; i++) {
                int calX = curX + dX[i];
                int calY = curY + dY[i];

                if (calX < 0 || calX > maps.length - 1 || calY < 0 || calY > maps[0].length - 1) {
                    continue;
                }

                if (visited[calX][calY] == 0 && maps[calX][calY] == 1) {
                    visited[calX][calY] = visited[curX][curY] + 1;
                    queue.offer(new int[]{calX, calY});
                }
            }
        }
    }
}

public class 게임맵최단거리 {
    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        System.out.println(solution20.solution(maps));

        maps = new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}};
        System.out.println(solution20.solution(maps));
    }
}

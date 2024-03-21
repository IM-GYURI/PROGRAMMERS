package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution21 {
    int[] dX = {1, -1, 0, 0};
    int[] dY = {0, 0, 1, -1};

    char[][] mapToChar;
    boolean[][] visited;


    public int[] solution(String[] maps) {
        List<Integer> list = new ArrayList<>();
        mapToChar = new char[maps.length][maps[0].length()];
        visited = new boolean[mapToChar.length][mapToChar[0].length];

        for (int i = 0; i < maps.length; i++) {
            mapToChar[i] = maps[i].toCharArray();
        }

        for (int i = 0; i < mapToChar.length; i++) {
            for (int j = 0; j < mapToChar[i].length; j++) {
                if (!visited[i][j] && mapToChar[i][j] != 'X') {
                    list.add(bfs(i, j));
                }
            }
        }

        if (list.size() == 0) {
            list.add(-1);
        }

        Collections.sort(list);
        return list.stream().mapToInt(i -> i).toArray();
    }

    public int bfs(int x, int y) {
        int sum = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];
            sum += mapToChar[curX][curY] - '0';

            for (int i = 0; i < 4; i++) {
                int calX = curX + dX[i];
                int calY = curY + dY[i];

                if (calX < 0 || calX > mapToChar.length - 1 || calY < 0 || calY > mapToChar[0].length - 1) {
                    continue;
                }

                if (!visited[calX][calY] && mapToChar[calX][calY] != 'X') {
                    visited[calX][calY] = true;
                    queue.offer(new int[]{calX, calY});
                }
            }
        }
        return sum;
    }
}

public class 무인도여행 {
    public static void main(String[] args) {
        Solution21 solution21 = new Solution21();
        String[] maps = {"X591X", "X1X5X", "X231X", "1XXX1"};
        System.out.println(Arrays.toString(solution21.solution(maps)));

        maps = new String[]{"XXX", "XXX", "XXX"};
        System.out.println(Arrays.toString(solution21.solution(maps)));
    }
}

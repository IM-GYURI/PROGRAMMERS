package Level1;

import java.util.Arrays;

class Solution25 {
    public int[] solution(String[] wallpaper) {
        int top = -1;
        int left = -1;
        int bottom = -1;
        int right = -1;

        char[][] arr = new char[wallpaper.length][wallpaper[0].length()];

        for (int i = 0; i < wallpaper.length; i++) {
            arr[i] = wallpaper[i].toCharArray();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == '#') {
                    top = i;
                    break;
                }
            }
            if (top != -1) {
                break;
            }
        }

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] == '#') {
                    left = i;
                    break;
                }
            }
            if (left != -1) {
                break;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == '#') {
                    bottom = i + 1;
                    break;
                }
            }
            if (bottom != -1) {
                break;
            }
        }

        for (int i = arr[0].length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] == '#') {
                    right = i + 1;
                    break;
                }
            }
            if (right != -1) {
                break;
            }
        }

        return new int[]{top, left, bottom, right};
    }
}

public class 바탕화면정리 {
    public static void main(String[] args) {
        Solution25 solution25 = new Solution25();
        String[] wallpaper = {".#...", "..#..", "...#."};
        System.out.println(Arrays.toString(solution25.solution(wallpaper)));

        wallpaper = new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."};
        System.out.println(Arrays.toString(solution25.solution(wallpaper)));

        wallpaper = new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        System.out.println(Arrays.toString(solution25.solution(wallpaper)));

        wallpaper = new String[]{"..", "#."};
        System.out.println(Arrays.toString(solution25.solution(wallpaper)));
    }
}

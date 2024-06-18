package Level1;

import java.util.*;

class Solution45 {
    public int solution(int[][] sizes) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int[] size : sizes) {
            Arrays.sort(size);
            max1 = Math.max(max1, size[0]);
            max2 = Math.max(max2, size[1]);
        }

        return max1 * max2;
    }
}

public class 최소직사각형 {
    public static void main(String[] args) {
        Solution45 solution45 = new Solution45();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution45.solution(sizes));
    }
}

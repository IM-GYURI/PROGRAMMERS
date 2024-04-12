package Level3;

import java.util.Arrays;
import java.util.Comparator;

class Solution10 {
    public int solution(int[][] routes) {
        int answer = 0;
        int cam = Integer.MIN_VALUE;

        Arrays.sort(routes, (o1, o2) -> o1[1] - o2[1]);

        for (int[] route : routes) {
            if (cam < route[0]) {
                cam = route[1];
                answer++;
            }
        }

        return answer;
    }
}

public class 단속카메라 {
    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
        int[][] routes = {{-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}};
        System.out.println(solution10.solution(routes));
    }
}

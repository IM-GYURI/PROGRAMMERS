package Level3;

class Solution6 {
    public int solution(int[][] triangle) {
//        int answer = 0;
//
//        for (int i = 1; i < triangle.length; i++) {
//            for (int j = 0; j < triangle[i].length; j++) {
//                if (j == 0) {
//                    triangle[i][j] += triangle[i - 1][j];
//                } else if (j == i) {
//                    triangle[i][j] += triangle[i - 1][j - 1];
//                } else {
//                    triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
//                }
//            }
//        }
//
//        for (int n : triangle[triangle.length - 1]) {
//            answer = Math.max(answer, n);
//        }
//
//        return answer;

        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }

        return triangle[0][0];
    }
}

public class 정수삼각형 {
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(solution6.solution(triangle));
    }
}

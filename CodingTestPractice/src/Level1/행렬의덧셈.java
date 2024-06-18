package Level1;

class Solution48 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }

        return arr1;
    }
}

public class 행렬의덧셈 {
    public static void main(String[] args) {
        Solution48 solution48 = new Solution48();
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        System.out.println(solution48.solution(arr1, arr2));
    }
}

package Level1;

import java.util.Arrays;

class Solution4 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] temp = new int[commands[i][1] - commands[i][0] + 1];
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                temp[j - commands[i][0] + 1] = array[j];
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }
        return answer;
    }
}

public class K번째수 {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution4.solution(arr, commands)));
    }
}

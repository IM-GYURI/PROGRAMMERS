package Level1;

import java.util.Stack;

class Solution18 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    if (!stack.isEmpty() && stack.peek() == board[j][moves[i] - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][moves[i] - 1]);
                    }

                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}

public class 크레인인형뽑기게임 {
    public static void main(String[] args) {
        Solution18 solution18 = new Solution18();
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution18.solution(board, moves));
    }
}

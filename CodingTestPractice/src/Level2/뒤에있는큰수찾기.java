package Level2;

import java.util.Arrays;
import java.util.Stack;

class Solution6 {
    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);

        for (int i = 0; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[i] > numbers[stack.peek()]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }

        return answer;
    }
}

public class 뒤에있는큰수찾기 {
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        int[] numbers = {2, 3, 3, 5};
        System.out.println(Arrays.toString(solution6.solution(numbers)));

        numbers = new int[]{9, 1, 5, 3, 6, 2};
        System.out.println(Arrays.toString(solution6.solution(numbers)));
    }
}

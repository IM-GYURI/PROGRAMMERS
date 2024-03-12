package Level2;

import java.util.Arrays;
import java.util.Stack;

class Solution10 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }

        return answer;
    }
}

public class 주식가격 {
    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(solution10.solution(prices)));
    }
}

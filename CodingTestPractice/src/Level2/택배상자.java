package Level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution14 {
    public int solution(int[] order) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= order.length; i++) {
            queue.offer(i);
        }

        for (int i = 0; i < order.length; i++) {
            if (stack.isEmpty()) {
                while (!queue.isEmpty() && queue.peek() != order[i]) {
                    stack.push(queue.poll());
                }
                if (queue.peek() == order[i]) {
                    queue.poll();
                    answer++;
                }
            } else {
                if (stack.peek() == order[i]) {
                    answer++;
                    stack.pop();
                } else {
                    while (!queue.isEmpty() && queue.peek() != order[i]) {
                        stack.push(queue.poll());
                    }
                    if (!queue.isEmpty() && queue.peek() == order[i]) {
                        queue.poll();
                        answer++;
                    } else {
                        break;
                    }
                }
            }
        }

        return answer;
    }
}

public class 택배상자 {
    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        int[] order = {4, 3, 1, 2, 5};
        System.out.println(solution14.solution(order));

        order = new int[]{5, 4, 3, 2, 1};
        System.out.println(solution14.solution(order));
    }
}

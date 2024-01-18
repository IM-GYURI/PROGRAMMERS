package Level1;

import java.util.Arrays;
import java.util.Stack;

class Solution3 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int n : arr) {
            if (stack.isEmpty() || stack.peek() != n) {
                stack.add(n);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }
}

public class 같은숫자는싫어_re {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        Solution3 s = new Solution3();
        System.out.println(Arrays.toString(s.solution(arr1)));
        System.out.println(Arrays.toString(s.solution(arr2)));
    }
}

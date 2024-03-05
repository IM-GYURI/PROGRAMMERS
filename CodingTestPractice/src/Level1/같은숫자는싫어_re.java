package Level1;

import java.util.Arrays;
import java.util.Stack;

class Solution3 {
    public int[] solution(int[] arr) {
        Stack stack = new Stack();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int num = (int) stack.peek();
            if (arr[i] != num) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = (int)stack.pop();
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

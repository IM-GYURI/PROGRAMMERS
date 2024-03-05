package Level1;

import java.util.Stack;

class Solution17 {
    public int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int num : ingredient) {
            stack.push(num);

            if (stack.size() >= 4) {
                int len = stack.size();
                if (stack.get(len - 1) == 1
                        && stack.get(len - 2) == 3
                        && stack.get(len - 3) == 2
                        && stack.get(len - 4) == 1) {
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }

        return answer;
    }
}

public class 햄버거만들기 {
    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution17.solution(ingredient));

        ingredient = new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2};
        System.out.println(solution17.solution(ingredient));
    }
}

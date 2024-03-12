package Level2;

import java.util.Stack;

class Solution7 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}

public class 올바른괄호 {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        String s = "()()";
        System.out.println(solution7.solution(s));

        s = "(())()";
        System.out.println(solution7.solution(s));

        s = ")()(";
        System.out.println(solution7.solution(s));

        s = "(()(";
        System.out.println(solution7.solution(s));
    }
}

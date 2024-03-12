package Level2;

import java.util.Stack;

class Solution8 {
    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            String temp = rotate(s, i);
            Stack<Character> stack = new Stack<>();
            boolean isPair = true;
            for (int j = 0; j < temp.length(); j++) {
                char c = temp.charAt(j);
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        isPair = false;
                    } else {
                        if (stack.peek() == '(') {
                            stack.pop();
                        }
                    }
                } else if (c == ']') {
                    if (stack.isEmpty()) {
                        isPair = false;
                    } else {
                        if (stack.peek() == '[') {
                            stack.pop();
                        }
                    }
                } else {
                    if (stack.isEmpty()) {
                        isPair = false;
                    } else {
                        if (stack.peek() == '{') {
                            stack.pop();
                        }
                    }
                }
            }

            if (isPair && stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }

    public String rotate(String s, int idx) {
        if (idx == 0) {
            return s;
        }

        String result = "";
        result += s.substring(idx);
        result += s.substring(0, idx);

        return result;
    }
}

public class 괄호회전하기 {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        String s = "[](){}";
        System.out.println(solution8.solution(s));

        s = "}]()[{";
        System.out.println(solution8.solution(s));

        s = "[)(]";
        System.out.println(solution8.solution(s));

        s = "}}}";
        System.out.println(solution8.solution(s));
    }
}

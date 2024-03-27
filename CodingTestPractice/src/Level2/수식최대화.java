package Level2;

import java.util.ArrayList;
import java.util.List;

class Solution24 {
    static long answer = Long.MIN_VALUE;
    static List<char[]> opList = new ArrayList<>();

    public long solution(String expression) {
        ArrayList<String> list = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '-' || expression.charAt(i) == '+' || expression.charAt(i) == '*') {
                list.add(expression.substring(start, i));
                list.add(expression.charAt(i) + "");
                start = i + 1;
            }
        }
        list.add(expression.substring(start));

        char[] op = {'+', '-', '*'};
        perm(op, 0);

        for (int i = 0; i < opList.size(); i++) {
            ArrayList<String> subList = new ArrayList<>(list);
            char[] curOp = opList.get(i);
            for (int j = 0; j < curOp.length; j++) {
                for (int k = 0; k < subList.size(); k++) {
                    if ((curOp[j] + "").equals(subList.get(k))) {
                        subList.set(k - 1, calc(subList.get(k - 1), subList.get(k), subList.get(k + 1)));
                        subList.remove(k);
                        subList.remove(k);
                        k--;
                    }
                }
            }
            answer = Math.max(answer, Math.abs(Long.parseLong(subList.get(0))));
        }

        return answer;
    }

    public String calc(String num1, String op, String num2) {
        long n1 = Long.parseLong(num1);
        long n2 = Long.parseLong(num2);

        if (op.equals("+")) {
            return n1 + n2 + "";
        } else if (op.equals("-")) {
            return n1 - n2 + "";
        } else {
            return n1 * n2 + "";
        }
    }

    public void perm(char[] op, int depth) {
        if (depth == op.length) {
            char[] temp = op.clone();
            opList.add(temp);
            return;
        }

        for (int i = depth; i < op.length; i++) {
            swap(op, depth, i);
            perm(op, depth + 1);
            swap(op, depth, i);
        }
    }

    public void swap(char[] op, int depth, int i) {
        char temp = op[depth];
        op[depth] = op[i];
        op[i] = temp;
    }
}

public class 수식최대화 {
    public static void main(String[] args) {
        Solution24 solution24 = new Solution24();
        String expression = "100-200*300-500+20";
        System.out.println(solution24.solution(expression));
    }
}

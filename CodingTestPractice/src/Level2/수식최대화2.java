package Level2;

import java.util.ArrayList;

class Solution28 {
    char[] op = {'+', '-', '*'};
    ArrayList<char[]> opList = new ArrayList<>();

    public long solution(String expression) {
        long answer = 0;

        ArrayList<String> list = new ArrayList<>();
        int idx = 0;

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*') {
                list.add(expression.substring(idx, i));
                list.add(expression.substring(i, i + 1));
                idx = i + 1;
            }
        }
        list.add(expression.substring(idx));

        permutation(0, op.length);

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

    public void permutation(int depth, int len) {
        if (depth == len) {
            opList.add(op.clone());
            return;
        }

        for (int i = depth; i < len; i++) {
            swap(depth, i);
            permutation(depth + 1, len);
            swap(depth, i);
        }
    }

    public void swap(int depth, int i) {
        char temp = op[depth];
        op[depth] = op[i];
        op[i] = temp;
    }

    public String calc(String num1, String op, String num2) {
        if (op.equals("+")) {
            return String.valueOf(Long.valueOf(num1) + Long.valueOf(num2));
        } else if (op.equals("-")) {
            return String.valueOf(Long.valueOf(num1) - Long.valueOf(num2));
        } else {
            return String.valueOf(Long.valueOf(num1) * Long.valueOf(num2));
        }
    }
}

public class 수식최대화2 {
    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        String expression = "100-200*300-500+20";
        System.out.println(solution28.solution(expression));
    }
}

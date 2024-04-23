package Level1;

import java.util.LinkedList;
import java.util.Queue;

class Solution34 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();

        for (String s : cards1) {
            queue1.add(s);
        }

        for (String s : cards2) {
            queue2.add(s);
        }

        for (int i = 0; i < goal.length; i++) {
            if (!queue1.isEmpty() && queue1.peek().equals(goal[i])) {
                queue1.remove();
            } else if (!queue2.isEmpty() && queue2.peek().equals(goal[i])) {
                queue2.remove();
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}

public class 카드뭉치 {
    public static void main(String[] args) {
        Solution34 solution34 = new Solution34();
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(solution34.solution(cards1, cards2, goal));
    }
}

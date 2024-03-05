package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution5 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            double remain = (100 - progresses[i]) / (double) speeds[i];
            int date = (int) Math.ceil(remain);

            if (!queue.isEmpty()) {
                if (queue.peek() < remain) {
                    list.add(queue.size());
                    queue.clear();
                }
            }

            queue.offer(date);
        }
        list.add(queue.size());

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

public class 기능개발_re {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(solution5.solution(progresses, speeds)));

        progresses = new int[]{95, 90, 99, 99, 80, 99};
        speeds = new int[]{1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(solution5.solution(progresses, speeds)));
    }
}

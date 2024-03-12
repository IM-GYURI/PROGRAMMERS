package Level2;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution9 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : priorities) {
            pq.add(num);
        }

        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    pq.poll();
                    answer++;
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}

public class 프로세스 {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println(solution9.solution(priorities, location));

        priorities = new int[]{1, 1, 9, 1, 1, 1};
        location = 0;
        System.out.println(solution9.solution(priorities, location));
    }
}

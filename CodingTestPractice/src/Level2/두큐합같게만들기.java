package Level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution15 {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;

        Queue<Integer> que1 = new LinkedList<>();
        for (int num : queue1) {
            que1.offer(num);
        }

        Queue<Integer> que2 = new LinkedList<>();
        for (int num : queue2) {
            que2.offer(num);
        }

        long sum1 = Arrays.stream(queue1).sum();
        long sum2 = Arrays.stream(queue2).sum();

        while (sum1 != sum2) {
            if (answer > (queue1.length + queue2.length) * 2) {
                return -1;
            }

            int val = 0;
            if (sum1 > sum2) {
                val = que1.poll();
                que2.offer(val);
                sum1 -= val;
                sum2 += val;
                answer++;
            } else if (sum1 < sum2){
                val = que2.poll();
                sum1 += val;
                sum2 -= val;
                que1.offer(val);
                answer++;
            } else {
                return answer;
            }
        }

        return answer;
    }
}

public class 두큐합같게만들기 {
    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();

        int[] queue1 = {3, 2, 7, 2};
        int[] queue2 = {4, 6, 5, 1};

        System.out.println(solution15.solution(queue1, queue2));
    }
}

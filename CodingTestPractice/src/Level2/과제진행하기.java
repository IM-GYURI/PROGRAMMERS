package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

class Solution13 {
    static class Task {
        private String name;
        private int start;
        private int playtime;

        public Task(String name, int start, int playtime) {
            this.name = name;
            this.start = start;
            this.playtime = playtime;
        }

        public Task(String name, int playtime) {
            this.name = name;
            this.playtime = playtime;
        }
    }

    public String[] solution(String[][] plans) {
        List<String> answer = new ArrayList<>();

        PriorityQueue<Task> pq = new PriorityQueue<>(
                (o1, o2) -> (o1.start - o2.start)
        );

        for (int i = 0; i < plans.length; i++) {
            String name = plans[i][0];

            String[] str = plans[i][1].split(":");
            int h = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            int start = (h * 60) + m;

            int time = Integer.parseInt(plans[i][2]);

            pq.add(new Task(name, start, time));
        }

        Stack<Task> remainingTask = new Stack<>();

        while (!pq.isEmpty()) {
            Task curTask = pq.poll();

            String curName = curTask.name;
            int curStart = curTask.start;
            int curPlaytime = curTask.playtime;

            int curTime = curStart;

            if (!pq.isEmpty()) {
                Task nextTask = pq.peek();

                if (curTime + curPlaytime < nextTask.start) {
                    answer.add(curName);
                    curTime += curPlaytime;

                    while (!remainingTask.isEmpty()) {
                        Task rem = remainingTask.pop();

                        if (curTime + rem.playtime <= nextTask.start) {
                            curTime += rem.playtime;
                            answer.add(rem.name);
                            continue;
                        } else {
                            int t = rem.playtime - (nextTask.start - curTime);
                            remainingTask.push(new Task(rem.name, t));
                            break;
                        }
                    }
                } else if (curStart + curPlaytime == nextTask.start) {
                    answer.add(curName);
                    continue;
                } else {
                    int t = (nextTask.start - curTime);
                    remainingTask.push(new Task(curName, curPlaytime - t));
                }
            } else {
                if (remainingTask.isEmpty()) {
                    curTime += curPlaytime;
                    answer.add(curName);
                } else {
                    answer.add(curName);

                    while (!remainingTask.isEmpty()) {
                        Task rem = remainingTask.pop();
                        answer.add(rem.name);
                    }
                }
            }
        }

        String[] result = new String[answer.size()];
        int idx = 0;
        for (String s : answer) {
            result[idx++] = s;
        }

        return result;
    }
}

public class 과제진행하기 {
    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        String[][] plans = {{"korean", "11:40", "30"}, {"english", "12:10", "20"}, {"math", "12:30", "40"}};
        System.out.println(Arrays.toString(solution13.solution(plans)));

        plans = new String[][]{{"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"}, {"computer", "12:30", "100"}};
        System.out.println(Arrays.toString(solution13.solution(plans)));

        plans = new String[][]{{"aaa", "12:00", "20"}, {"bbb", "12:10", "30"}, {"ccc", "12:40", "10"}};
        System.out.println(Arrays.toString(solution13.solution(plans)));
    }
}

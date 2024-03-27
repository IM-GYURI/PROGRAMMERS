package Level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution2 {
    ArrayList<String> list;
    boolean[] visited;

    public String[] solution(String[][] tickets) {
        String[] answer = {};
        int count = 0;
        visited = new boolean[tickets.length];
        list = new ArrayList<>();

        dfs("ICN", "ICN", tickets, count);

        Collections.sort(list);
        answer = list.get(0).split(" ");

        return answer;
    }

    public void dfs(String start, String route, String[][] tickets, int count) {
        if (count == tickets.length) {
            list.add(route);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (start.equals(tickets[i][0]) && !visited[i]) {
                visited[i] = true;
                dfs(tickets[i][1], route + " " + tickets[i][1], tickets, count + 1);
                visited[i] = false;
            }
        }
    }
}

public class 여행경로 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        System.out.println(Arrays.toString(solution2.solution(tickets)));

        tickets = new String[][]{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        System.out.println(Arrays.toString(solution2.solution(tickets)));
    }
}

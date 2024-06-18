package Level1;

// 첫번째 풀이 -> 시간 초과

import java.util.*;

class Solution41 {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String call : callings) {
            int curRank = map.get(call);

            String front = players[curRank - 1];

            map.replace(front, curRank);
            players[curRank] = front;

            map.replace(call, curRank - 1);
            players[curRank - 1] = call;
        }

        return players;
    }
}

public class 달리기경주 {
    public static void main(String[] args) {
        Solution41 solution41 = new Solution41();
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(solution41.solution(players, callings));
    }
}

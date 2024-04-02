package Level3;

import java.util.HashSet;

class Solution4 {
    String[] userIdArr;
    String[] bannedIdArr;
    boolean[] visited;
    HashSet<HashSet<String>> result = new HashSet<>();

    public int solution(String[] user_id, String[] banned_id) {
        userIdArr = user_id;
        bannedIdArr = banned_id;
        visited = new boolean[userIdArr.length];

        dfs(new HashSet<>(), 0);

        return result.size();
    }

    public void dfs(HashSet<String> set, int depth) {
        if (depth == bannedIdArr.length) {
            result.add(set);
            return;
        }

        for (int i = 0; i < userIdArr.length; i++) {
            if (set.contains(userIdArr[i])) {
                continue;
            }

            if (check(userIdArr[i], bannedIdArr[depth])) {
                set.add(userIdArr[i]);
                dfs(new HashSet<>(set), depth + 1);
                set.remove(userIdArr[i]);
            }
        }
    }

    public boolean check(String userId, String bannedId) {
        if (userId.length() != bannedId.length()) {
            return false;
        }

        boolean match = true;

        for (int i = 0; i < userId.length(); i++) {
            if (bannedId.charAt(i) != '*' && userId.charAt(i) != bannedId.charAt(i)) {
                match = false;
                break;
            }
        }
        return match;
    }
}

public class 불량사용자 {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
        String[] banned_id = {"fr*d*", "abc1**"};
        System.out.println(solution4.solution(user_id, banned_id));
    }
}

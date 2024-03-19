package Level2;

import java.util.Set;
import java.util.TreeSet;

class Solution17 {
    Set<String> set;
    String[] arr = {"A", "E", "I", "O", "U"};

    public int solution(String word) {
        int answer = 0;
        set = new TreeSet<>();

        for (int i = 0; i < 5; i++) {
            makeWord(arr[i], 1);
        }

        int count = 0;
        for (String s : set) {
            count++;
            if (s.equals(word)) {
                return count;
            }
        }

        return answer;
    }

    public void makeWord(String base, int depth) {
        set.add(base);
        if (depth == 5) {
            return;
        }

        for (int i = 0; i < 5; i++) {
            makeWord(base + arr[i], depth + 1);
        }
    }
}

public class 모음사전 {
    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        String word = "AAAAE";
        System.out.println(solution17.solution(word));

        word = "AAAE";
        System.out.println(solution17.solution(word));

        word = "I";
        System.out.println(solution17.solution(word));

        word = "EIO";
        System.out.println(solution17.solution(word));
    }
}

package Level1;

import java.util.ArrayList;

class Solution16 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            list.add((char)('a' + i));
        }

        for (char c : skip.toCharArray()) {
            int idx = list.indexOf(c);
            list.remove(idx);
        }

        for (int i = 0; i < s.length(); i++) {
            int position = list.indexOf(s.charAt(i));
            char c = list.get((position + index) % list.size());
            answer += c;
        }

        return answer;
    }
}

public class 둘만의암호 {
    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();
        String s = "aukks";
        String skip = "wbqd";
        int idx = 5;
        System.out.println(solution16.solution(s, skip, idx));
    }
}

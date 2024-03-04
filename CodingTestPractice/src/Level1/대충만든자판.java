package Level1;

import java.util.Arrays;
import java.util.HashMap;

class Solution12 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> keypad = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char key = keymap[i].charAt(j);
                if (keypad.containsKey(key)) {
                    int value = keypad.get(key);
                    keypad.put(key, Math.min(value, j + 1));
                } else {
                    keypad.put(key, j + 1);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int result = 0;
            boolean flag = true;
            for (char c : targets[i].toCharArray()) {
                if (keypad.containsKey(c)) {
                    result += keypad.get(c);
                } else {
                    flag = false;
                }
            }
            answer[i] = flag ? result : -1;
        }

        return answer;
    }
}

public class 대충만든자판 {
    public static void main(String[] args) {
        Solution12 s = new Solution12();
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};
        System.out.println(Arrays.toString(s.solution(keymap, targets)));

        keymap = new String[]{"AA"};
        targets = new String[]{"B"};
        System.out.println(Arrays.toString(s.solution(keymap, targets)));

        keymap = new String[]{"AGZ", "BSSS"};
        targets = new String[]{"ASA", "BGZ"};
        System.out.println(Arrays.toString(s.solution(keymap, targets)));
    }
}

package Level0;

import java.util.*;

class Solution1 {
    public String solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                int count = map.get(c) + 1;
                map.put(c, count);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                list.add(c);
            }
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }

        return result;
    }
}

public class 한번만등장한문자 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        String s1 = "abcabcadc";
        System.out.println(s.solution(s1));

        s1 = new String("abdc");
        System.out.println(s.solution(s1));

        s1 = new String("hello");
        System.out.println(s.solution(s1));
    }
}

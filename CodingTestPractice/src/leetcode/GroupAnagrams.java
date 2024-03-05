package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int value = 0;

        for (int i = 0; i < strs.length; i++) {
            String key = "";
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            key = new String(charArray);

            if (map.get(key) != null) {
                int n = map.get(key);
                List<String> target = answer.get(n);
                target.add(strs[i]);
                answer.set(n, target);
            } else {
                map.put(key, value++);
                List<String> target = new ArrayList<>();
                target.add(strs[i]);
                answer.add(target);
            }
        }
        return answer;
    }
}

public class GroupAnagrams {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        for (List<String> list : s.groupAnagrams(strs)) {
            for (String str : list) {
                System.out.print(str);
            }
            System.out.println();
        }
        System.out.println();

        strs = new String[]{""};
        for (List<String> list : s.groupAnagrams(strs)) {
            for (String str : list) {
                System.out.print(str);
            }
            System.out.println();
        }
        System.out.println();

        strs = new String[]{"a"};
        for (List<String> list : s.groupAnagrams(strs)) {
            for (String str : list) {
                System.out.print(str);
            }
            System.out.println();
        }
        System.out.println();
    }
}

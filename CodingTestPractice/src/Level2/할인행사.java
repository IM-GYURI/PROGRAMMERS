package Level2;

import java.util.*;
import java.util.Map.*;

class Solution42 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        for (int i = 0; i < discount.length - 9; i++) {
            Map<String, Integer> map = new HashMap<>();

            for (int j = i; j < i + 10; j++) {
                map.put(discount[j], map.getOrDefault(discount[j], 0) + 1);
            }

            int count = 0;
            for (int j = 0; j < want.length; j++) {
                String w = want[j];
                int n = number[j];

                for (Entry<String, Integer> entry : map.entrySet()) {
                    if (entry.getKey().equals(w) && entry.getValue() >= n) {
                        count++;
                        break;
                    }
                }
            }

            if (count == want.length) {
                answer++;
            }
        }

        return answer;
    }
}
public class 할인행사 {
    public static void main(String[] args) {
        Solution42 solution42 = new Solution42();
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solution42.solution(want, number, discount));
    }
}

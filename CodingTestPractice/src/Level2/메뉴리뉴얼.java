package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

class Solution30 {
    // 조합과 개수를 저장할 map
    HashMap<String, Integer> map;

    public String[] solution(String[] orders, int[] course) {
        ArrayList<String> answer = new ArrayList<>();

        // orders 문자열 각각 오름차순 정렬
        // e.g. "BAC" -> "ABC"
        for (int i = 0; i < orders.length; i++) {
            char[] charArr = orders[i].toCharArray();
            Arrays.sort(charArr);
            orders[i] = String.valueOf(charArr);
        }

        // course 순회하면서 각 길이만큼의 조합 구하기
        for (int i = 0; i < course.length; i++) {
            map = new HashMap<>();
            int max = Integer.MIN_VALUE;
            // 손님마다의 조합을 구함
            for (int j = 0; j < orders.length; j++) {
                StringBuffer sb = new StringBuffer();
                if (course[i] <= orders[j].length()) {  // 코스에 필요한 개수 <= 각 문자열의 길이인 경우
                    combination(orders[j], sb, 0, 0, course[i]);
                }
            }
            // 가장 많이 주문된 횟수 max에 저장
            // e.g. 예제 1 "AC" -> 4회 주문
            for (Entry<String, Integer> entry : map.entrySet()) {
                max = Math.max(max, entry.getValue());
            }

            for (Entry<String, Integer> entry : map.entrySet()) {
                // 최소 2번 이상 주문된 조합, 해당 횟수와 일치하는 조합 list에 추가
                if (max >= 2 && entry.getValue() == max) {
                    answer.add(entry.getKey());
                }
            }
        }
        // 추가된 조합 오름차순
        Collections.sort(answer);
        // 스트링 배열로 변환 후 리턴
        return answer.stream().toArray(String[]::new);
    }

    public void combination(String str, StringBuffer sb, int idx, int cnt, int n) {
        if (cnt == n) {
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
            return;
        }

        for (int i = idx; i < str.length(); i++) {
            sb.append(str.charAt(i));
            combination(str, sb, i + 1, cnt + 1, n);
            sb.delete(cnt, cnt + 1);
        }
    }
}

public class 메뉴리뉴얼 {
    public static void main(String[] args) {
        Solution30 solution30 = new Solution30();
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2, 3, 4};
        System.out.println(Arrays.toString(solution30.solution(orders, course)));
    }
}

package Level1;

// 첫번째 풀이 : 37.5점
// - report에 중복되는 값은 하나를 제외하고는 "" 처리
// - reportMap에 id와 신고당한 횟수를 저장
// - result에 유저가 신고한 사람 중 정지된 사람의 수를 저장
// - id_list 순서대로 반환

// 두번째 풀이 : 블로그 참고
// - Map의 key로는 신고당한 사람의 이름, value로는 신고한 사람들의 Set
// - idxMap은 id_list의 name과 idx 저장

import java.util.*;

class Solution39 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idxMap.put(name, i);
        }

        for (String s : report) {
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            map.get(to).add(from);
        }

        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = map.get(id_list[i]);
            if (send.size() >= k) {
                for (String name : send) {
                    answer[idxMap.get(name)]++;
                }
            }
        }

        return answer;
    }
}

public class 신고결과받기 {
    public static void main(String[] args) {
        Solution39 solution39 = new Solution39();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        System.out.println(solution39.solution(id_list, report, k));
    }
}

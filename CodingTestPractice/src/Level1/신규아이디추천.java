package Level1;

import java.util.ArrayList;

class Solution7 {
    public String solution(String new_id) {
        ArrayList<Character> list = new ArrayList<>();
        String answer = "";

        for (char c : new_id.toCharArray()) {
            list.add(c);
        }

        int dif = 'a' - 'A';

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 'A' && list.get(i) <= 'Z') {
                char c = (char) (list.get(i) + dif);
                list.remove(i);
                list.add(i, c);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) >= 'a' && list.get(i) <= 'z') && !(list.get(i) >= '0' && list.get(i) <= '9')
                    && (list.get(i) != '-') && (list.get(i) != '_') && (list.get(i) != '.')) {
                list.remove(i);
                i = i - 1;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == '.') {
                int idx = i;
                while (list.get(idx) == '.') {
                    idx++;
                    if (idx > list.size() - 1) {
                        break;
                    }
                }
                for (int j = i + 1; j < idx; j++) {
                    list.remove(i);
                }
            }
        }

        if (!list.isEmpty() && list.get(0) == '.') {
            list.remove(0);
        }

        if (!list.isEmpty() && list.get(list.size() - 1) == '.') {
            list.remove(list.size() - 1);
        }

        if (list.isEmpty()) {
            list.add('a');
        }

        if (list.size() >= 16) {
            for (int i = 15; i < list.size(); i++) {
                list.remove(i);
                i = i - 1;
            }
            if (list.get(list.size() - 1) == '.') {
                list.remove(list.size() - 1);
            }
        }

        if (list.size() <= 2) {
            char c = list.get(list.size() - 1);
            while (list.size() < 3) {
                list.add(c);
            }
        }

        for (char c : list) {
            answer += c;
        }

        return answer;
    }
}

public class 신규아이디추천 {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution7.solution(new_id));

        new_id = "z-+.^.";
        System.out.println(solution7.solution(new_id));

        new_id = "=.=";
        System.out.println(solution7.solution(new_id));

        new_id = "123_.def";
        System.out.println(solution7.solution(new_id));

        new_id = "abcdefghijklmn.p";
        System.out.println(solution7.solution(new_id));
    }
}

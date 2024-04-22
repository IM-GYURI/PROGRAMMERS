package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution32 {
    public int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[score.length];

        if (k > score.length) {
            for (int i = 0; i < answer.length; i++) {
                list.add(score[i]);
                answer[i] = Collections.min(list);
            }
            return answer;
        }

        for (int i = 0; i < k; i++) {
            list.add(score[i]);
            Collections.sort(list);
            answer[i] = Collections.min(list);
        }

        for (int i = k; i < score.length; i++) {
            int idx = -1;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) < score[i]) {
                    idx = j;
                    break;
                }
            }
            if (idx != -1) {
                list.remove(idx);
                list.add(score[i]);
                Collections.sort(list);
            }
            answer[i] = Collections.min(list);
        }

        return answer;
    }
}

public class 명예의전당 {
    public static void main(String[] args) {
        Solution32 solution32 = new Solution32();
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(solution32.solution(k, score)));
    }
}

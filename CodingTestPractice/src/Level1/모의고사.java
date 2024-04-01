package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution22 {
    int[] no1 = {1, 2, 3, 4, 5};
    int[] no2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] no3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        int[] count = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == no1[i % no1.length]) {
                count[0]++;
            }
            if (answers[i] == no2[i % no2.length]) {
                count[1]++;
            }
            if (answers[i] == no3[i % no3.length]) {
                count[2]++;
            }
        }

        int max = Arrays.stream(count).max().getAsInt();

        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}

public class 모의고사 {
    public static void main(String[] args) {
        Solution22 solution22 = new Solution22();
        int[] answers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution22.solution(answers)));

        answers = new int[]{1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(solution22.solution(answers)));
    }
}

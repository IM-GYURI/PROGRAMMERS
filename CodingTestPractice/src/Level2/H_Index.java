package Level2;

import java.util.Arrays;

class Solution35 {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;

            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }
}

public class H_Index {
    public static void main(String[] args) {
        Solution35 solution35 = new Solution35();
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution35.solution(citations));
    }
}

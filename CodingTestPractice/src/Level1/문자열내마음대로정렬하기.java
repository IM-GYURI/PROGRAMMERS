package Level1;

import java.util.Arrays;
import java.util.Comparator;

class Solution29 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(n) - o2.charAt(n);
            }
        });

        return strings;
    }
}

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(Arrays.toString(solution29.solution(strings, n)));
    }
}

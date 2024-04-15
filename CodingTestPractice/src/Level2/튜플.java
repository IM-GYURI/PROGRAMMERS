package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution36 {
    public int[] solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();
        s = s.substring(2);
        s = s.substring(0, s.length() - 2);
        s = s.replace("},{", "-");
        String[] str = s.split("-");

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()- o2.length();
            }
        });

        for (String x : str) {
            String[] tmp = x.split(",");
            for (int i = 0; i < tmp.length; i++) {
                int n = Integer.parseInt(tmp[i]);
                if (!answer.contains(n)) {
                    answer.add(n);
                }
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}

public class 튜플 {
    public static void main(String[] args) {
        Solution36 solution36 = new Solution36();
        String s = "{{20,111},{111}}";
        System.out.println(Arrays.toString(solution36.solution(s)));
    }
}

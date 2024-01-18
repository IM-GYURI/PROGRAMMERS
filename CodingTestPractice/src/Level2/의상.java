package Level2;

import java.util.HashMap;
import java.util.Iterator;

class Solution2 {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        Iterator<Integer> it = map.values().iterator();
        int answer = 1;

        while (it.hasNext()) {
            answer *= it.next().intValue() + 1;
        }

        return answer - 1;
    }
}

public class 의상 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Solution2 s = new Solution2();
        System.out.println(s.solution(clothes));
    }
}

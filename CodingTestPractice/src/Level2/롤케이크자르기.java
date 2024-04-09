package Level2;

import java.util.HashMap;

class Solution32 {
    public int solution(int[] topping) {
        int answer = 0;

        HashMap<Integer, Integer> older = new HashMap<>();
        HashMap<Integer, Integer> younger = new HashMap<>();

        for (int n : topping) {
            younger.put(n, younger.getOrDefault(n, 0) + 1);
        }

        for (int n : topping) {
            older.put(n, older.getOrDefault(n, 0) + 1);

            if (younger.get(n) == 1) {
                younger.remove(n);
            } else {
                younger.put(n, younger.get(n) - 1);
            }

            if (older.size() == younger.size()) {
                answer++;
            }
        }

        return answer;
    }
}

public class 롤케이크자르기 {
    public static void main(String[] args) {
        Solution32 solution32 = new Solution32();
        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
        System.out.println(solution32.solution(topping));

        topping = new int[]{1, 2, 3, 1, 4};
        System.out.println(solution32.solution(topping));
    }
}

package Level0;

import java.util.Arrays;

class Solution2 {
    public int[] solution(int[] numbers, String direction) {
        if (direction.equals("left")) {
            return left(numbers);
        } else {
            return right(numbers);
        }
    }

    public int[] left(int[] numbers) {
        int[] result = new int[numbers.length];
        result[numbers.length - 1] = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            result[i] = numbers[i + 1];
        }
        return result;
    }

    public int[] right(int[] numbers) {
        int[] result = new int[numbers.length];
        result[0] = numbers[numbers.length - 1];
        for (int i = 1; i < numbers.length; i++) {
            result[i] = numbers[i - 1];
        }
        return result;
    }
}

public class 배열회전시키기 {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] numbers = {1, 2, 3};
        String direction = "right";
        System.out.println(Arrays.toString(s.solution(numbers, direction)));

        numbers = new int[]{4, 455, 6, 4, -1, 45, 6};
        direction = "left";
        System.out.println(Arrays.toString(s.solution(numbers, direction)));
    }
}

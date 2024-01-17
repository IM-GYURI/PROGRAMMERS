package Level1;

import java.util.ArrayList;
import java.util.Arrays;

class Solution2 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if (list.isEmpty()) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[list.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
            answer = Arrays.stream(answer).sorted().toArray();
        }

        return answer;
    }
}

public class 나누어떨어지는숫자배열 {
    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[arr.length - 1] + "]");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 9, 7, 10};
        int divisor1 = 5;

        Solution2 s = new Solution2();

        print(s.solution(arr1, divisor1));

        int[] arr2 = {2, 36, 1, 3};
        int divisor2 = 1;

        print(s.solution(arr2, divisor2));

        int[] arr3 = {3, 2, 6};
        int divisor3 = 10;

        print(s.solution(arr3, divisor3));
    }
}

package Level2;

import java.util.Arrays;

class Solution38 {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}

public class 가장큰수 {
    public static void main(String[] args) {
        Solution38 solution38 = new Solution38();
        int[] numbers = {3, 30, 34, 5, 9};
        System.out.println(solution38.solution(numbers));
    }
}

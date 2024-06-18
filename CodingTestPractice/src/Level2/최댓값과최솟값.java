package Level2;

import java.util.*;

class Solution50 {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        return Arrays.stream(arr).min().getAsInt() + " " + Arrays.stream(arr).max().getAsInt();
    }
}

public class 최댓값과최솟값 {
    public static void main(String[] args) {
        Solution50 solution50 = new Solution50();
        String s = "1 2 3 4";
        System.out.println(solution50.solution(s));
    }
}

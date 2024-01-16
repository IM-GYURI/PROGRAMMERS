package Level1;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        int value = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                list.add(arr[i]);
                value = arr[i];
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(arr1)));
        System.out.println(Arrays.toString(s.solution(arr2)));
    }
}
